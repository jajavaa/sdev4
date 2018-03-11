package controllers;

import io.ebean.DuplicateKeyException;
import models.Address;
import models.Department;
import models.Project;
import models.users.Admin;
import models.users.Employee;
import models.users.User;
import org.im4java.core.ConvertCmd;
import org.im4java.core.IMOperation;
import play.api.Environment;
import play.data.Form;
import play.data.FormFactory;
import play.db.ebean.Transactional;
import play.mvc.*;
import views.html.addEmployee;
import views.html.employee;
import views.html.employees;

import javax.inject.Inject;
import java.io.File;
import java.util.UUID;

public class EmployeeController extends Controller {

    private FormFactory formFactory;
    private Environment environment;

    @Inject
    public EmployeeController(FormFactory formFactory, Environment environment) {
        this.formFactory = formFactory;
        this.environment = environment;
    }

    @Security.Authenticated(Secured.class)
    @With(Auth.AuthAdmin.class)
    public Result employees() {
        return ok(employees.render(Employee.getAll(), User.getWithEmail(session().get("email"))));
    }

    @Security.Authenticated(Secured.class)
    public Result employee(String id) {
        Employee emp = Employee.get(id);
        if (emp.getEmail().equals(session().get("email")) || User.getWithEmail(session().get("email")).getClass().equals(Admin.class)) {
            return ok(employee.render(emp, environment, User.getWithEmail(session().get("email"))));
        } else return forbidden("Error 403: Forbidden");
    }

    @Security.Authenticated(Secured.class)
    @With(Auth.AuthAdmin.class)
    @Transactional
    public Result create() {
        return ok(addEmployee.render(formFactory.form(Employee.class), null, null, Department.getAll(), User.getWithEmail(session().get("email"))));
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    public Result update(String id) {
        Employee employee;
        Form<Employee> employeeForm;
        try {
            employee = Employee.get(id);
            employeeForm = formFactory.form(Employee.class).fill(employee);
        } catch (Exception ex) {
            return badRequest("error");
        }
        return ok(addEmployee.render(employeeForm, employee.getAddress(), employee, Department.getAll(), User.getWithEmail(session().get("email"))));
    }

    @Security.Authenticated(Secured.class)
    @With(Auth.AuthAdmin.class)
    @Transactional
    public Result delete(String id) {
        Employee.getFinder().ref(id).delete();
        flash("success", "Employee has been deleted");
        return redirect(routes.EmployeeController.employees());
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    public Result form() {
        Form<Employee> employeeForm = formFactory.form(Employee.class).bindFromRequest();
        Employee employee = employeeForm.get();
        if (employeeForm.hasErrors()) {
            if (User.getWithEmail(session().get("email")) instanceof Admin) {
                return redirect(routes.EmployeeController.employees());
            } else {
                return redirect(routes.EmployeeController.employee(employee.getId()));
            }

        }
        if (employeeForm.field("d").getValue().isPresent()) {
            employee.setDepartment(Department.get(employeeForm.field("d").getValue().get()));
        }
        if (employeeForm.field("a").getValue().isPresent()) {
            employee.setAddress(Address.get(employeeForm.field("a").getValue().get()));
        }
        for (Project project : Project.getAll()) {
            if (employeeForm.field(project.getId()).getValue().isPresent()) {
                project.getEmployees().add(employee);
            }
        }
        if (employee.getId().equals("")) {
            try {
                employee.setId(UUID.randomUUID().toString());
                employee.save();
            } catch (DuplicateKeyException e) {
                return internalServerError("Email already taken by another employee.");
            }
        } else if (!employee.getId().equals("")) {
            if(employee.getPassword().equals("")) {
                employee.setPassword(Employee.get(employee.getId()).getPassword());
            }
            employee.update();

        }
        Http.MultipartFormData.FilePart image = request().body().asMultipartFormData().getFile("upload");
        saveImage(employee.getId(), image);
        if (User.getWithEmail(session().get("email")) instanceof Admin) {
            return redirect(routes.EmployeeController.employees());
        } else {
            return redirect(routes.EmployeeController.employee(employee.getId()));
        }
    }

    private void saveImage(String id, Http.MultipartFormData.FilePart<File> uploaded) {
        if (uploaded != null && uploaded.getContentType().startsWith("image/")) {
            File file = uploaded.getFile();
            IMOperation op = new IMOperation();
            op.addImage(file.getAbsolutePath());
            op.resize(300, 200);
            op.addImage(String.format("public/images/employees/%s.jpg", id));
            IMOperation thumb = new IMOperation();
            thumb.addImage(file.getAbsolutePath());
            thumb.resize(128);
            thumb.addImage(String.format("public/images/employees/thumbs/%s.jpg", id));
            File dir = new File("public/images/employees/thumbs/");
            if (!dir.exists()) {
                boolean mkdirs = dir.mkdirs();
            }
            try {
                ConvertCmd cmd = new ConvertCmd();
                cmd.run(op);
                cmd.run(thumb);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}