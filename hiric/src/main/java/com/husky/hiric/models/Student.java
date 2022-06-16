package com.husky.hiric.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
@Data
@NoArgsConstructor
@Entity(name = "Student")
@Table(name="Student")
public class Student {
   @Id
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    @Transient
    private int age;
    public Student(String firstName,String lastName,LocalDate dob){
        this.firstName=firstName;
        this.lastName=lastName;
        this.dob=dob;
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
