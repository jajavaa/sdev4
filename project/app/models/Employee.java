package models;

import io.ebean.Finder;
import io.ebean.Model;
import org.joda.time.DateTime;
import play.data.validation.Constraints.Required;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
public class Employee extends Model {

    @Id
    private String email;

    @Required
    private String firstName;

    @Required
    private String lastName;

    @Required
    private String salary;

    @Required
    private DateTime dob;

    @Required
    private String phone;

    @OneToOne
    private Address address;

    @ManyToOne
    private Department department;

    private List<Project> projects;

    public static Finder<String, Employee> finder = new Finder<>(Employee.class);

    public Employee(String email, String firstName, String lastName, String salary, DateTime dob, String phone,
                    Address address, Department department, List<Project> projects) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.dob = dob;
        this.phone = phone;
        this.address = address;
        this.department = department;
        this.projects = projects;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSalary() {
        return salary;
    }

    public DateTime getDob() {
        return dob;
    }

    public String getPhone() {
        return phone;
    }

    public Address getAddress() {
        return address;
    }

    public Department getDepartment() {
        return department;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void setDob(DateTime dob) {
        this.dob = dob;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public void addProject(Project project) {
        this.projects.add(project);
    }

    public void removeProject(Project project) {
        this.projects.remove(project);
    }

    public static Employee read(String email) {
        return finder.byId(email);
    }

    public static List<Employee> read() {
        return finder.all();
    }

    public static void change(String email) {
        finder.db().
    }
}
