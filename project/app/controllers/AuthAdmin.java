package controllers;

import play.mvc.*;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.CompletableFuture;

import models.users.Admin;
import models.users.User;

public class AuthAdmin extends Action.Simple {
    public CompletionStage<Result> call(Http.Context ctx) {
        String id = ctx.session().get("email");
        assert id != null;
        User user = Admin.get(id);
        if (user.getRole().equals("admin") && user.getClass().equals(Admin.class)) {
            return delegate.call(ctx);
        }
        return CompletableFuture.completedFuture(redirect(routes.LoginController.login()));
    }
}