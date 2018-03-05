package controllers;

import models.Department;
import models.users.User;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.departments;

public class HomeController extends Controller {

    public HomeController() {}

    public Result index(Long id) {
        Department department = Department.get(id);
        if (department == null) {
            return ok("Null");
        }
        return ok(departments.render(Department.getAll(), department, User.find(session().get("email"))));
    }



}