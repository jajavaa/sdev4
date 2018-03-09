package controllers;

import models.Department;
import models.users.User;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.departments;

public class HomeController extends Controller {

    public HomeController() {}

    public Result index(String id) {
        return ok(departments.render(Department.getAll(), User.getWithEmail(session().get("email"))));
    }
}