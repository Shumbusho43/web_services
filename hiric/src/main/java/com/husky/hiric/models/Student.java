package com.husky.hiric.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
@Data
@NoArgsConstructor
@Entity(name = "Student")
@Table(name="Student")
public class Student {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private String email;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
    @Transient
    private int age;
    public Student(String firstName,String lastName,LocalDate dob){
        this.firstName=firstName;
        this.lastName=lastName;
        this.dob=dob;
    }
    //all args constructor
    public Student(String firstName,String lastName,LocalDate dob,String email,Department department){
        this.firstName=firstName;
        this.lastName=lastName;
        this.dob=dob;
        this.email=email;
        this.department=department;
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

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getAge() {
        LocalDate localDate=LocalDate.now();
       if(this.dob!=null){
           return Period.between(this.dob,localDate).getYears();
       }
       return 0;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }
}
