package com.example.mvparchitecture;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MyActivity extends AppCompatActivity implements LoginInterface {
    private EditText emailView, passwordView;
    private TextView messageView;
    private Button loginBtn;
    private LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        emailView = findViewById(R.id.email);
        passwordView = findViewById(R.id.password);
        messageView = findViewById(R.id.textView);
        loginBtn = findViewById(R.id.loginBtn);

        presenter = new LoginPresenter(this);

        loginBtn.setOnClickListener(view -> clickLogin());
    }

    private void clickLogin() {
        var email = emailView.getText().toString().trim();
        var password = passwordView.getText().toString().trim();
        var user = new User(email, password);
        presenter.login(user);
    }

    @Override
    public void loginSuccess() {
        messageView.setVisibility(View.VISIBLE);
        messageView.setText(R.string.login_success);
        messageView.setTextColor(getResources().getColor(com.google.android.material.R.color.design_default_color_primary));
    }

    @Override
    public void loginError() {
        messageView.setVisibility(View.VISIBLE);
        messageView.setText(R.string.login_failed);
        messageView.setTextColor(getResources().getColor(com.google.android.material.R.color.design_default_color_error));
    }
}
