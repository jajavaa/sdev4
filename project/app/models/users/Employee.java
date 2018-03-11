package models.users;

import io.ebean.Finder;
import io.ebean.annotation.NotNull;
import models.Address;
import models.Department;
import models.Project;

import javax.persistence.*;
import java.util.Comparator;
import java.util.List;

@Entity
@DiscriminatorValue(value = "employee")
public class Employee extends User {

    @OneToOne
    @NotNull
    private Address address;

    @ManyToOne
    @NotNull
    private Department department;

    @ManyToMany(mappedBy = "employees")
    @NotNull
    private List<Project> projects;

    private static Finder<String, Employee> finder = new Finder<>(Employee.class);

    public Employee() {
    }

    public Employee(String id, String firstName, String lastName, String password, String email, String phone,
                    String role, Address address, Department department, List<Project> projects) {
        super(id, firstName, lastName, password, email, phone, role);
        this.address = address;
        this.department = department;
        this.projects = projects;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
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

    public static Finder<String, Employee> getFinder() {
        return finder;
    }

    public static List<Employee> getAll() {
        List<Employee> employees = finder.all();
        employees.sort(Comparator.comparing(User::getLastName));
        return employees;
    }

    public static Employee get(String id) {
        return finder.ref(id);
    }
}