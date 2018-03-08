package controllers;

import models.users.Employee;
import play.mvc.*;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.CompletableFuture;

import models.users.Admin;
import models.users.User;

public class Auth {

    static class AuthAdmin extends Action.Simple {
        @Override
        public CompletionStage<Result> call(Http.Context ctx) {
            String email = ctx.session().get("email");
            assert email != null;
            User user = Admin.getWithEmail(email);
            if (user.getRole().equals("admin") && user.getClass().equals(Admin.class)) {
                return delegate.call(ctx);
            }
            return CompletableFuture.completedFuture(forbidden("<h1>403 Unauthorized</h1>"));
        }
    }

    static class AuthEmployee extends Action.Simple {

        @Override
        public CompletionStage<Result> call(Http.Context ctx) {
            String email = ctx.session().get("email");
            assert email != null;
            User user = Employee.getWithEmail(email);
            if(user.getRole().equals("employee") && user.getClass().equals(Employee.class)) {

                return delegate.call(ctx);
            }
            return CompletableFuture.completedFuture(forbidden("<h1>403 Unauthorized</h1>"));
        }
    }
}

