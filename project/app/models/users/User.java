package models.users;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import io.ebean.annotation.NotNull;

@Entity
@MappedSuperclass
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "role")
public class User extends Model {

    @Id
    protected String id;
    @NotNull
    protected String firstName;
    @NotNull
    protected String lastName;
    @NotNull
    protected String password;
    @Column(unique = true)
    @NotNull
    protected String email;
    @NotNull
    protected String phone;

    private static Finder<String, User> finder = new Finder<>(User.class);

    public User() {
    }

    public User(String id, String firstName, String lastName, String password, String email, String phone, String role) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static List<? extends User> getAll() {
        return finder.all();
    }

    public static User getWithEmail(String email) {
        return finder.query().where().eq("email", email).findOne();
    }

    public static User auth(String email, String password) {
        return finder.query().where().eq("email", email).eq("password", password).findUnique();
    }
}