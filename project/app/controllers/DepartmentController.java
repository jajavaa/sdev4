package controllers;

import models.Department;
import models.users.User;
import play.mvc.Result;
import views.html.departments;

import static play.mvc.Controller.session;
import static play.mvc.Results.ok;

public class DepartmentController {

    public DepartmentController() {}

    public Result departments(Long id) {
        return ok(departments.render(Department.getAll(), Department.get(id), User.find(session().get("email"))));
    }
}