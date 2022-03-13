package com.niit.MongoDbExample.models;

import org.springframework.data.mongodb.core.mapping.Document;
import com.niit.MongoDbExample.models.college;

@Document(collection="students1")
public class Student {

    private int id;
    private String name;
    private String city;
    private college college;

    public Student(int id, String name, String city, college college) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.college = college;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCollege(college college) {
        this.college = college;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public college getCollege() {
        return college;
    }
}
