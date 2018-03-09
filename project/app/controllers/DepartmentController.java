package controllers;

import models.Department;
import models.users.User;
import play.mvc.Result;
import views.html.department;
import views.html.departments;

import static play.mvc.Controller.session;
import static play.mvc.Results.ok;

public class DepartmentController {

    public DepartmentController() {}

    public Result departments() {
        return ok(departments.render(Department.getAll(), User.getWithEmail(session().get("email"))));
    }

    public Result department(String id) {
        return ok(department.render(Department.get(id), User.getWithEmail(session().get("email"))));
    }
}