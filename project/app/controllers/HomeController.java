package controllers;

import models.Department;
import models.Employee;
import models.Project;
import models.users.User;
import play.api.Environment;
import play.data.Form;
import play.data.FormFactory;
import play.db.ebean.Transactional;
import play.mvc.Http;
import play.mvc.Controller;
import play.mvc.Http.MultipartFormData.FilePart;
import play.mvc.Result;
import play.mvc.Security;
import play.mvc.With;
import views.html.*;
import javax.inject.Inject;
import java.util.List;


public class HomeController extends Controller {

    private FormFactory formFactory;
    private Environment environment;

    @Inject
    public HomeController(FormFactory formFactory, Environment environment) {
        this.environment = environment;
        this.formFactory = formFactory;
    }

    public Result index(Long cat) {
        List<Employee> employees = null;
        List<Department> departments = Department.findAll();
        if (cat == 0) {
            departments = Department.findAll();
        } else {
            employees = Department.find.ref(cat).getEmployees();
        }
        return ok(index.render(employees, departments, User.getUserById(session().get("email")), environment));
    }

    public Result employee(Long id) {
        return ok(employee.render(Employee.find.byId(id), User.find(session().get("email"))));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    public Result createEmployee() {
        return ok(addProduct.render(formFactory.form(Employee.class), User.getUserById(session().get("email"))));
    }

    public Result createEmployeeSubmit() {
        Form<Employee> newEmployeeForm = formFactory.form(Employee.class).bindFromRequest();
        if (!newEmployeeForm.hasErrors()) {
            Employee employee = newEmployeeForm.get();
            if (employee.getId() == null) {
                employee.save();
                flash("success", "Product " + employee.getNames() + " was added");
            } else if (employee.getId() != null) {
                employee.update();
                flash("success", "Product " + employee.getNames() + " was updated");
            }
        } else {
            return badRequest(addProduct.render(newEmployeeForm, User.getUserById(session().get("email"))));
        }
        Http.MultipartFormData data = request().body().asMultipartFormData();
        FilePart image = data.getFile("upload");
        return redirect(controllers.routes.HomeController.index(0));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result deleteEmployee(Long id) {
        Employee.find.ref(id).delete();
        flash("success", "Employee has been deleted");
        return redirect(routes.HomeController.index(0));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result updateEmployee(Long id) {
        Employee employee;
        Form<Employee> form;
        try {
            employee = Employee.find.byId(id);
            assert employee != null;
            form = formFactory.form(Employee.class).fill(employee);
        } catch (Exception ex) {
            return badRequest("error");
        }
        return ok(addEmployee.render(form, User.find(session().get("email"))));
    }

    public Result project() {
        return ok(customer.render(Project.findAll(), User.find(session().get("email"))));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result createProject() {
        Form<Project> customerForm = formFactory.form(Project.class);
        return ok(addProject.render(customerForm, User.find(session().get("email"))));
    }

    public Result projectSubmit() {
        Form<Project> form = formFactory.form(Project.class).bindFromRequest();
        if (!form.hasErrors()) {
            Project project = form.get();
            if (project.getId() == null) {
                project.save();
                flash("success", String.format("Project %s was added", project.getName()));
            } else {
                project.update();
                flash("success", String.format("Project %s was updated", project.getName()));
            }
            return redirect(controllers.routes.HomeController.project());
        } else {
            return badRequest(addProject.render(form, User.find(session().get("email"))));
        }
    }

    public Result deleteProject(Long id) {
        Project.find.ref(id).delete();
        flash("success", "Customer has been deleted");
        return redirect(routes.HomeController.index(0));
    }

    @Transactional
    public Result updateProject(Long id) {
        Project project;
        Form<Project> form;

        try {
            project = Project.find.byId(id);
            assert project != null;
            form = formFactory.form(Project.class).fill(project);
        } catch (Exception ex) {
            return badRequest("error");
        }

        return ok(addCustomer.render(form, User.getUserById(session().get("email"))));
    }
}
