package models;


import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints.Required;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Entity
public class Department extends Model {

    @Id
    private Long id;
    
    @Required
    private String title;

    @OneToMany
    private List<Employee> employees;

    public Department() {}

    public Department(Long id, String title, List<Employee> employees) {
        this.id = id;
        this.title = title;
        this.employees = employees;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public static Finder<Long, Department> find = new Finder<>(Department.class);

    public static List<Department> findAll() {
        return Department.find.query().where().orderBy("title asc").findList();
    }

    public static Map<String, String> options() {
        LinkedHashMap<String, String> options = new LinkedHashMap<>();
        findAll().forEach(department -> options.put(department.getId().toString(), department.getTitle()));
        return options;
    }
}