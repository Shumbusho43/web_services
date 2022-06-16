package com.husky.hiric.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="employee")
public class Employee {
@Id
@Column(name="id",nullable = false)
private Long id;
@Column(name="first_name",nullable = false,length = 100)
private String firstName;
@Column(name="last_name",nullable = false,length = 100)
private String lastName;
@Column(name="email",nullable = false,unique = true,length = 50)
private String email;
@Column(name="telephone",nullable = false,length = 10,unique = true)
private String telephone;
@Column(name="username",nullable = false,length = 50,unique = true)
private String username;
@Column(name="password",nullable = false,length = 128)
private String password;
@Column(name="gender",nullable = false,length = 10)
private String gender;
@Column(name="dob",nullable = false)
private Date dob;

    public Employee() {
    }

    public Employee(Long id, String firstName, String lastName, String email, String telephone, String username, String password, String gender, Date dob) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.telephone = telephone;
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.dob = dob;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", dob=" + dob +
                '}';
    }
}
