package com.example.test1.model;

public class Auth {
    private Long id;
    private String fistname;
    private String lastname;
    private String email;
    private String pass;
    private int date;

    public Auth() {
    }

    public Auth(Long id, String fistname, String lastname, String email, String pass, int date) {
        this.id = id;
        this.fistname = fistname;
        this.lastname = lastname;
        this.email = email;
        this.pass = pass;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFistname() {
        return fistname;
    }

    public void setFistname(String fistname) {
        this.fistname = fistname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Auth{" +
                "id=" + id +
                ", fistname='" + fistname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", pass='" + pass + '\'' +
                ", date=" + date +
                '}';
    }
}

