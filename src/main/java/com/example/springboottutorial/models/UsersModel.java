package com.example.springboottutorial.models;

import javax.persistence.*;
import java.util.HashMap;

@Entity
@Table(name = "contact_us")
public class UsersModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private String phone;
    @Column(name = "subject")
    private String subject;
    @Column(name = "message")
    private String message;

    public UsersModel(String name, String email, String phone, String subject, String message) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.subject = subject;
        this.message = message;
    }

    public UsersModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HashMap<String,String> generateMap(){
        HashMap<String,String> contact_us_map = new HashMap<String,String>();
        contact_us_map.put("name",this.name);
        contact_us_map.put("email",this.email);
        contact_us_map.put("phone",this.phone);
        contact_us_map.put("subject",this.subject);
        contact_us_map.put("message",this.message);
        return contact_us_map;
    }

}
