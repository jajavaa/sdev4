package models.users;

import io.ebean.Finder;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.List;

@Entity
@DiscriminatorValue(value = "admin")
public class Admin extends User {

    private static Finder<String, Admin> finder = new Finder<>(Admin.class);

    public Admin() {
    }

    public Admin(String id, String firstName, String lastName, String password, String email, String phone, String role) {
        super(id, firstName, lastName, password, email, phone, role);
    }

    public static Finder<String, Admin> getFinder() {
        return finder;
    }

    public static List<Admin> getAll() {
        return finder.all();
    }

    public static Admin get(String id) {
        return finder.ref(id);
    }
}