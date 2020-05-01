package model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", updatable = false, nullable = false)
    private Long id;

    @Column(length = 20, name = "first_name", nullable = false)
    @NotNull
    @Size(min=2, max =20)
    private String firstName;

    @Column(length = 20, name = "first_name", nullable = false)
    @NotNull
    @Size(min=2, max =20)
    private String lastName;

    @Column
    private String telephone;

    @Column
    @NotNull
    private String email;

    @Column(length = 15, nullable = false)
    @NotNull
    @Size(min = 1; max 15)
    private String login;

    @Column(length = 256, nullable = false)
    @NotNull
    @Size(min = 1, max = 256)
    private String password;

    @Enumerated
    @Column(name = "user_role")
    private UserRole role;

    @Column(name = "date_of_birth")
    @Temporal(TemporalType.DATE)
    @Past
    private Date dateOfBirth;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
