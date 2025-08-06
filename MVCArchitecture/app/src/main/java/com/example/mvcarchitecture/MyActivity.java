package com.example.mvcarchitecture;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MyActivity extends AppCompatActivity {
    private EditText emailView, passwordView;
    private TextView messageView;
    private Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        emailView = findViewById(R.id.email);
        passwordView = findViewById(R.id.password);
        messageView = findViewById(R.id.textView);
        loginBtn = findViewById(R.id.loginBtn);
        loginBtn.setOnClickListener(view -> clickLogin());
    }

    private void clickLogin() {
        String email = emailView.getText().toString().trim();
        String password = passwordView.getText().toString().trim();
        var user = new User(email, password);

        messageView.setVisibility(View.VISIBLE);
        if (user.isValidEmail() && user.isValidPassword()) {
            messageView.setText(R.string.login_success);
            messageView.setTextColor(getResources().getColor(com.google.android.material.R.color.design_default_color_primary));
        } else {
            messageView.setText(R.string.login_failed);
            messageView.setTextColor(getResources().getColor(com.google.android.material.R.color.design_default_color_error));
        }
    }
}
