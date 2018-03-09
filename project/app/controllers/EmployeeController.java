package controllers;

import models.users.Employee;
import models.users.User;
import play.data.Form;
import play.data.FormFactory;
import play.db.ebean.Transactional;
import play.mvc.*;
import views.html.addEmployee;
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
        } else return forbidden("Error 403: Forbidden");
    }

    @Security.Authenticated(Secured.class)
    @With(Auth.AuthAdmin.class)
    @Transactional
    public Result update(String id) {
        Employee employee;
        Form<Employee> form;
        try {
            employee = Employee.getFinder().byId(id);
            assert employee != null;
            form = formFactory.form(Employee.class).fill(employee);
        } catch (Exception ex) {
            return badRequest("error");
        }
        return ok(addEmployee.render(form, User.getWithEmail(session().get("email"))));
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
        Form<Employee> form = formFactory.form(Employee.class).bindFromRequest();
        if (!form.hasErrors()) {
            Employee employee = form.get();
            if (employee.getId() == null) {
                employee.save();
            } else if (employee.getId() != null) {
                employee.update();
            }
        }
        else {
            return badRequest(addEmployee.render(form, User.getWithEmail(session().get("email"))));
        }
        Http.MultipartFormData data = request().body().asMultipartFormData();
        Http.MultipartFormData.FilePart image = data.getFile("upload");
        return redirect(routes.HomeController.index("0"));
    }
}
