package models;

import io.ebean.Finder;
import io.ebean.Model;
import io.ebean.annotation.NotNull;
import models.users.Employee;
import play.data.validation.Constraints.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Address extends Model {

    @Id
    private String id;
    @NotNull
    private String lineOne;
    @NotNull
    private String lineTwo;
    @NotNull
    private String city;
    @NotNull
    private String county;
    @NotNull
    private String code;
    @NotNull
    private String country;

    private static Finder<String, Address> finder = new Finder<>(Address.class);

    public Address() {
    }

    public Address(String id, String lineOne, String lineTwo, String city, String county, String code, String country) {
        this.id = id;
        this.lineOne = lineOne;
        this.lineTwo = lineTwo;
        this.city = city;
        this.county = county;
        this.code = code;
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLineOne() {
        return lineOne;
    }

    public void setLineOne(String lineOne) {
        this.lineOne = lineOne;
    }

    public String getLineTwo() {
        return lineTwo;
    }

    public void setLineTwo(String lineTwo) {
        this.lineTwo = lineTwo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public static Address get(String id) {
        return finder.ref(id);
    }

    public static List<Address> getOrphaned() {
        List<Address> orphaned = finder.all();
        List<Address> notOrphaned = new ArrayList<>();
        for(Employee employee: Employee.getAll()) {
            notOrphaned.add(employee.getAddress());
        }
        orphaned.removeAll(notOrphaned);
        return orphaned;
    }
}