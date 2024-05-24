package com.springBootApplication.Actuator.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "custom.config")
@Component
public class CustomConfig {

    private String name, password, email;
    private int emailExpTime;


    //toString method
    @Override
    public String toString() {
        return "CustomConfig{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", emailExpTime=" + emailExpTime +
                '}';
    }

    //setter getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEmailExpTime() {
        return emailExpTime;
    }

    public void setEmailExpTime(int emailExpTime) {
        this.emailExpTime = emailExpTime;
    }
}
