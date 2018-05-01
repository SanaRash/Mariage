package com.example.err.mariagetn.dao;

/**
 * Created by err on 26/04/2018.
 */

public class User {
    private Long id;
    private String user_emai;
    private String Password;
    private double latitude , longitude ;
    private String user_login ;
    private int tel;

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getUserName() {
        return user_login;
    }

    public void setUser_login(String User_login) {
        this.user_login = user_login;
    }

    public Long getID() {
        return id;
    }

    public void setID(Long id) {
        this.id = id;
    }

    public String getUser_email() {
        return user_emai;
    }

    public void setUser_email(String User_email) {this.user_emai = user_emai;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}





