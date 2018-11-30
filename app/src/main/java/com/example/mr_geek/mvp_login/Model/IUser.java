package com.example.mr_geek.mvp_login.Model;

public interface IUser {
    String getEmail();
    String getPassword();
    boolean isValid();
}
