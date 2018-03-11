package controllers;

import models.Address;
import models.Department;
import models.Project;
import models.users.Employee;
import models.users.User;
import play.data.Form;
import play.data.FormFactory;
import play.db.ebean.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import play.mvc.With;
import views.html.addAddress;
import views.html.addEmployee;

import javax.inject.Inject;
import java.util.UUID;

public class AddressController extends Controller {

    private FormFactory formFactory;

    @Inject
    public AddressController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    public Result create(String employee) {
        return ok(addAddress.render(formFactory.form(Address.class), null, Employee.get(employee),User.getWithEmail(session().get("email"))));
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    public Result update(String id, String employee) {
        return ok(addAddress.render(formFactory.form(Address.class).fill(Address.get(id)), Address.get(id), Employee.get(employee), User.getWithEmail(session().get("email"))));
    }

    @Security.Authenticated(Secured.class)
    @With(Auth.AuthAdmin.class)
    @Transactional
    public Result delete(String id, String employeeId) {
        Employee employee = Employee.get(employeeId);
        employee.setAddress(null);
        employee.update();
        Address.get(id).delete();
        return redirect(routes.EmployeeController.employee(employeeId));
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    public Result form() {
        Form<Address> addressForm = formFactory.form(Address.class).bindFromRequest();
        if (addressForm.hasErrors()) {
            return redirect(routes.EmployeeController.employees());
        }
        Employee employee = null;
        if(addressForm.field("employee").getValue().isPresent()) {
            employee = Employee.get(addressForm.field("employee").getValue().get());
        }
        Address address = addressForm.get();
        if (address.getId().equals("")) {
            address.setId(UUID.randomUUID().toString());
            address.save();
            if (employee != null) {
                employee.setAddress(address);
                employee.save();
            }
            return redirect(routes.EmployeeController.employee(employee.getId()));
        } else {
            address.update();
            return redirect(routes.EmployeeController.employee(employee.getId()));
        }
    }
}