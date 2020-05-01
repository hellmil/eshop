package model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Embeddable
public class Address implements Serializable {

    @Column(length = 50, nullable = false)
    @Size(min =3,max=50)
    @NotNull
    private String street1;

    private String street2;

    @Column(length = 50, nullable = false)
    @Size(min = 2, max = 50)
    @NotNull
    private String city;

    @ManyToOne
    @NotNull
    private String country;

    @Column(length = 5, name = "zip_code", nullable = false)
    @Size(min = 5, max = 5)
    @NotNull
    private String zipcode;

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street1='" + street1 + '\'' +
                ", street2='" + street2 + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }
}
