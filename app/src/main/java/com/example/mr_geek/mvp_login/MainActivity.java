package com.example.mr_geek.mvp_login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mr_geek.mvp_login.Presenter.LoginPresenter;
import com.example.mr_geek.mvp_login.View.ILoginView;

public class MainActivity extends AppCompatActivity implements ILoginView {
    private Button b_login;
    private EditText et_email;
    private EditText et_password;
    private LoginPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b_login = findViewById(R.id.b_login);
        et_email = findViewById(R.id.et_email);
        et_password = findViewById(R.id.et_password);
        presenter = new LoginPresenter(this);
        b_login.setOnClickListener(v -> presenter.onLogin(et_email.getText().toString(),et_password.getText().toString()));
    }

    @Override
    public void onLoginResult(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
