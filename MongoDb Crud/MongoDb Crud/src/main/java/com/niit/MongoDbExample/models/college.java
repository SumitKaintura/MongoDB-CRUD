package com.niit.MongoDbExample.models;

import org.springframework.data.mongodb.core.mapping.Document;

public class college {

    private String name;
    private String collegeId;
    private String address;

    public college(String name, String collegeId, String address) {
        this.name = name;
        this.collegeId = collegeId;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getCollegeId() {
        return collegeId;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCollegeId(String collegeId) {
        this.collegeId = collegeId;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
