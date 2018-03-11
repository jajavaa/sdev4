package controllers;

import play.mvc.*;
import play.data.*;
import javax.inject.Inject;

import views.html.*;
import models.users.*;

public class LoginController extends Controller {
    private FormFactory formFactory;

    @Inject
    public LoginController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    public Result login() {
        Form<Login> loginForm = formFactory.form(Login.class);
        return ok(login.render(loginForm, User.getWithEmail(session().get("email"))));
    }

    public Result form() {
        Form<Login> loginForm = formFactory.form(Login.class).bindFromRequest();
        if (loginForm.hasErrors()) {
            return badRequest(login.render(loginForm, User.getWithEmail(session().get("email"))));
        } else {
            session().clear();
            session("email", loginForm.get().getEmail());
            System.out.println("User logged in." + loginForm.get().getEmail());
        }
        return redirect(routes.ProjectController.projects());
    }

    public Result logout() {
        session().clear();
        flash("success", "You've been logged out");
        return redirect(routes.LoginController.login());
    }
}