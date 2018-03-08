package controllers;

import models.users.Employee;
import models.users.User;
import play.data.Form;
import play.data.FormFactory;
import play.db.ebean.Transactional;
import play.mvc.*;
import views.html.employee;

import javax.inject.Inject;

public class EmployeeController extends Controller {

    private FormFactory formFactory;

    @Inject
    public EmployeeController(FormFactory  formFactory) {
        this.formFactory = formFactory;
    }

    @Security.Authenticated(Secured.class)
    @With(Auth.AuthEmployee.class)
    public Result employee(String id) {
        Employee emp = Employee.get(id);
        if (emp.getEmail().equals(session().get("email"))) {
            return ok(employee.render(emp, User.getWithEmail(session().get("email"))));
        } else return unauthorized();
    }

    @Security.Authenticated(Secured.class)
    @With(Auth.AuthAdmin.class)
    public Result createEmployee() {
        return ok();
    }

    @Security.Authenticated(Secured.class)
    @With(Auth.AuthAdmin.class)
    @Transactional
    public Result updateEmployee(String id) {
        Employee employee;
        Form<Employee> form;
        try {
            employee = Employee.getFinder().byId(id);
            assert employee != null;
            form = formFactory.form(Employee.class).fill(employee);
        } catch (Exception ex) {
            return badRequest("error");
        }
        return ok("Updated");
    }

    @Security.Authenticated(Secured.class)
    @With(Auth.AuthAdmin.class)
    @Transactional
    public Result deleteEmployee(String id) {
        Employee.getFinder().ref(id).delete();
        flash("success", "Employee has been deleted");
        return redirect(routes.HomeController.index("0"));
    }

    public Result employeeForm() {
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
        }
//        else {
//            return badRequest(addEmployee.render(newEmployeeForm, User.find(session().get("email"))));
//        }
        Http.MultipartFormData data = request().body().asMultipartFormData();
        Http.MultipartFormData.FilePart image = data.getFile("upload");
        return redirect(routes.HomeController.index("0"));
    }
}
