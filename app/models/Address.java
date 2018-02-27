package models;

import io.ebean.Model;
import play.data.validation.Constraints.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address extends Model {

    @Id
    private Long id;
    @Required
    private String lineOne, lineTwo;
    @Required
    private String city;
    @Required
    private String county;
    @Required
    private String code;
    private String country;

    public Address() {
    }

    public Address(String lineOne, String lineTwo, String city, String county, String code, String country) {
        this.lineOne = lineOne;
        this.lineTwo = lineTwo;
        this.city = city;
        this.county = county;
        this.code = code;
        this.country = country;
    }

    public Address(Long id, String lineOne, String lineTwo, String city, String county, String code, String country) {
        this(lineOne, lineTwo, city, county, code, country);
        this.id = id;
    }

    public Long getId() {
        return id;
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

    @Override
    public String toString() {
        return String.format("%s,%n%s,%n%s,%n%s,%n%s,%n%s", lineOne, lineOne, city, county, code, country);
    }
}
