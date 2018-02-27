package models;

import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints.Required;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Employee extends Model {

    @Id
    private Long id;
    @Required
    private String firstName, lastName;
    @Required
    private String email, phone;
    @Required
    private Department department;
    @Required
    private Address address;

    @ManyToMany
    private List<Project> projects;

    public Employee() {}

    public Employee(Long id, String firstName, String lastName, String email, String phone, Department department, Address address, List<Project> projects) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.department = department;
        this.address = address;
        this.projects = projects;
    }

    public Long getId() {
        return id;
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public String getNames() {
        return String.format("%s %s", firstName, lastName);
    }

    public static final Finder<Long, Employee> find = new Finder<>(Employee.class);

    public static List<Employee> findAll() {
        return Employee.find.all();
    }

}
    