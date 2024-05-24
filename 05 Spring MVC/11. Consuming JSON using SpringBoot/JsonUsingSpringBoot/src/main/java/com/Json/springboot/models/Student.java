package com.Json.springboot.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Student {
    private String name;
    private String email;
    private String phone;

    //@JsonIgnore //to ignore this field my json
    private String course;

    //getter & setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    //toString method override

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
