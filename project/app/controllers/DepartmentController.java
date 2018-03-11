package controllers;

import io.ebean.DataIntegrityException;
import models.Department;
import models.users.Employee;
import models.users.User;
import play.data.Form;
import play.data.FormFactory;
import play.db.ebean.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import play.mvc.With;
import views.html.addDepartment;
import views.html.department;
import views.html.departments;
import javax.inject.Inject;
import java.util.UUID;

public class DepartmentController extends Controller {

    private FormFactory formFactory;

    @Inject
    public DepartmentController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    @Security.Authenticated(Secured.class)
    @With(Auth.AuthAdmin.class)
    public Result departments() {
        return ok(departments.render(Department.getAll(), User.getWithEmail(session().get("email"))));
    }

    @Security.Authenticated(Secured.class)
    @With(Auth.AuthAdmin.class)
    public Result department(String id) {
        return ok(department.render(Department.get(id), User.getWithEmail(session().get("email"))));
    }

    @Security.Authenticated(Secured.class)
    @With(Auth.AuthAdmin.class)
    @Transactional
    public Result create() {
        return ok(addDepartment.render(formFactory.form(Department.class), null, User.getWithEmail(session().get("email"))));
    }

    @Security.Authenticated(Secured.class)
    @With(Auth.AuthAdmin.class)
    @Transactional
    public Result update(String id) {
        return ok(addDepartment.render(formFactory.form(Department.class).fill(Department.get(id)), Department.get(id), User.getWithEmail(session().get("email"))));
    }

    @Security.Authenticated(Secured.class)
    @With(Auth.AuthAdmin.class)
    @Transactional
    public Result delete(String id) {
        try {
            Department.getFind().ref(id).delete();
        } catch (DataIntegrityException e) {
            return redirect(routes.DepartmentController.departments());
        }
        return redirect(routes.DepartmentController.departments());
    }

    @Security.Authenticated(Secured.class)
    @With(Auth.AuthAdmin.class)
    @Transactional
    public Result form() {
        Form<Department> departmentForm = formFactory.form(Department.class).bindFromRequest();
        if (departmentForm.hasErrors()) {
            return redirect(routes.DepartmentController.departments());
        }
        Department department = departmentForm.get();
        for(Employee employee: Employee.getAll()) {
            if(departmentForm.field(employee.getId()).getValue().isPresent()) {
                department.getEmployees().add(employee);
            }
        }
        if (department.getId().equals("")) {
            department.setId(UUID.randomUUID().toString());
            department.save();
        } else if (!department.getId().equals("")) department.update();
        return redirect(routes.DepartmentController.departments());
    }
}