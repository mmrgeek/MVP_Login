package com.example.mr_geek.mvp_login.Model;

import android.util.Patterns;

public class User implements IUser{
    private String email;
    private String password;
    public User(String email,String password){
        this.email = email;
        this.password = password;
    }
    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public boolean isValide() {
        return !password.trim().isEmpty()
                && password.length()>=8 &&
                Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }
}
