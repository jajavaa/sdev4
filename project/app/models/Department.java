package models;

import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints.Required;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Department extends Model {

    @Id
    private Long id;

    @Required
    private String title;

    @OneToMany
    private List<Employee> employees;

    public static Finder<Long, Department> find = new Finder<>(Department.class);

    public Department() {}

    public Department(String title, List<Employee> employees) {
        this.title = title;
        this.employees = employees;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public static List<Department> findAll() {
        return find.query().where().orderBy("lastName asc").findList();
    }
}
