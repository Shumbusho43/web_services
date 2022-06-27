package com.husky.hiric.models;

import javax.persistence.*;

@Entity
@Table(name="department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department() {
    }

    public Department(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Department(Integer id) {
        this.id = id;
    }

    public Department(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                ", name='" + name + '\'' +
                '}';
    }
}
