package controllers;

import models.User;
import play.mvc.Action;
import play.mvc.Http.Context;
import play.mvc.Result;

import static java.util.concurrent.CompletableFuture.completedFuture;
import java.util.concurrent.CompletionStage;

public class AdminAuth extends Action.Simple {

    @Override
    public CompletionStage<Result> call(Context ctx) {
        String id = ctx.session().get("email");
        if (id != null) {
            User u = User.find(id);
            if ("admin".equals(u.getRole())) {
                return delegate.call(ctx);
            }
        }
        ctx.flash().put("error", "Admin Login Required");
        return completedFuture(redirect(routes.LoginController.login()));
    }
}
