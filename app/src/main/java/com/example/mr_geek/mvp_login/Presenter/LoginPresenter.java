package com.example.mr_geek.mvp_login.Presenter;

import com.example.mr_geek.mvp_login.Model.User;
import com.example.mr_geek.mvp_login.View.ILoginView;

public class LoginPresenter implements ILoginPresenter {
    private ILoginView loginView;

    public LoginPresenter(ILoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void onLogin(String email, String password) {
        User user = new User(email,password);
        if (user.isValide())
            loginView.onLoginResult("Login succeeded");
        else
            loginView.onLoginResult("Login failed");
    }
}
