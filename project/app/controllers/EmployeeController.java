package controllers;

import models.Employee;
import models.users.User;
import play.db.ebean.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import play.mvc.With;
import views.html.employee;

public class EmployeeController extends Controller {

    public Result employee(Long id) {
        return ok(employee.render(Employee.find(id), User.find(session().get("email"))));
    }
//
//    @Security.Authenticated(Secured.class)
//    @With(AuthAdmin.class)
//    public Result createEmployee() {
//        return ok(addEmployee.render(formFactory.form(Employee.class), User.find(session().get("email"))));
//    }

//    @Security.Authenticated(Secured.class)
//    @With(AuthAdmin.class)
//    @Transactional
//    public Result updateEmployee(Long id) {
//        Employee employee;
//        Form<Employee> form;
//        try {
//            employee = Employee.find.byId(id);
//            assert employee != null;
//            form = formFactory.form(Employee.class).fill(employee);
//        } catch (Exception ex) {
//            return badRequest("error");
//        }
//        return ok(addEmployee.render(form, User.find(session().get("email"))));
//    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result deleteEmployee(Long id) {
        Employee.find.ref(id).delete();
        flash("success", "Employee has been deleted");
        return redirect(routes.HomeController.index(0));
    }

//    public Result employeeForm() {
//        Form<Employee> newEmployeeForm = formFactory.form(Employee.class).bindFromRequest();
//        if (!newEmployeeForm.hasErrors()) {
//            Employee employee = newEmployeeForm.get();
//            if (employee.getId() == null) {
//                employee.save();
//                flash("success", "Product " + employee.getNames() + " was added");
//            } else if (employee.getId() != null) {
//                employee.update();
//                flash("success", "Product " + employee.getNames() + " was updated");
//            }
//        } else {
//            return badRequest(addEmployee.render(newEmployeeForm, User.find(session().get("email"))));
//        }
//        Http.MultipartFormData data = request().body().asMultipartFormData();
//        Http.MultipartFormData.FilePart image = data.getFile("upload");
//        return redirect(controllers.routes.HomeController.index(0));
//    }
}
