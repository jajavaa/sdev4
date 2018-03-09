package controllers;

import models.Address;
import models.Department;
import models.Project;
import models.users.Admin;
import models.users.Employee;
import models.users.User;
import play.data.Form;
import play.data.FormFactory;
import play.db.ebean.Transactional;
import play.mvc.*;
import views.html.addEmployee;
import views.html.employee;
import views.html.employees;

import javax.inject.Inject;

public class EmployeeController extends Controller {

    private FormFactory formFactory;

    @Inject
    public EmployeeController(FormFactory  formFactory) {
        this.formFactory = formFactory;
    }

    @Security.Authenticated(Secured.class)
    @With(Auth.AuthAdmin.class)
    public Result employees() {
        return ok(employees.render(Employee.getAll(), User.getWithEmail(session().get("email"))));
    }

    @Security.Authenticated(Secured.class)
    @With(Auth.AuthEmployee.class)
    public Result employee(String id) {
        Employee emp = Employee.get(id);
        if (emp.getEmail().equals(session().get("email")) || User.getWithEmail(session().get("email")).getClass().equals(Admin.class)) {
            return ok(employee.render(emp, User.getWithEmail(session().get("email"))));
        } else return forbidden("Error 403: Forbidden");
    }

    @Security.Authenticated(Secured.class)
    @With(Auth.AuthAdmin.class)
    @Transactional
    public Result update(String id) {
        Employee employee;
        Form<Employee> employeeForm;
        Form<Address> addressForm;
        try {
            employee = Employee.get(id);
            Address address = employee.getAddress();
            employeeForm = formFactory.form(Employee.class).fill(employee);
            addressForm = formFactory.form(Address.class).fill(address);
        } catch (Exception ex) {
            return badRequest("error");
        }
        return ok(addEmployee.render(employeeForm, addressForm, employee, Department.getAll(), Project.getAll(), User.getWithEmail(session().get("email"))));
    }

    @Security.Authenticated(Secured.class)
    @With(Auth.AuthAdmin.class)
    @Transactional
    public Result delete(String id) {
        Employee.getFinder().ref(id).delete();
        flash("success", "Employee has been deleted");
        return redirect(routes.HomeController.index("0"));
    }

    public Result form() {
        Form<Address> addressForm = formFactory.form(Address.class).bindFromRequest();
        Form<Employee> employeeForm = formFactory.form(Employee.class).bindFromRequest();
        Employee employee = employeeForm.get();
        if (!employeeForm.hasErrors()) {

            Address address = addressForm.get();
            if (employee.getId() == null) {
                employee.save();
            } else if (employee.getId() != null) {
                employee.setAddress(address);
                employee.update();
            }
        }
        else {
            return ok(addEmployee.render(employeeForm, addressForm, employee, Department.getAll(), Project.getAll(), User.getWithEmail(session().get("email"))));
        }
        Http.MultipartFormData data = request().body().asMultipartFormData();
        Http.MultipartFormData.FilePart image = data.getFile("upload");
        return redirect(routes.HomeController.index("0"));
    }
}
