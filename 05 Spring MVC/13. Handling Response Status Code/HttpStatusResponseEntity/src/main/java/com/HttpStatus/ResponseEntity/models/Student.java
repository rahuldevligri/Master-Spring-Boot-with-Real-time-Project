package com.HttpStatus.ResponseEntity.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {
    private String name;
    private String email;
    private String phone;

    //@JsonIgnore //to ignore this filed both time deserialization(get) and serialization(set)
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


    /*
    consume: json include : setter : @JsonProperty
    Produce: json exclude : getter : @JsonIgnore
     */

    /*
    consume: json exclude : setter : @JsonIgnore
    Produce: json include : getter : @JsonProperty and also @JsonProperty use on field

     */
    @JsonIgnore // <- serialization ke time pe data ignore krega...
    public String getCourse() {
        return course;
    }

    @JsonProperty //<- deserialization ke time pe data include karega
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
