package com.example.tryit.activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tryit.R;
import com.example.tryit.fragment.MyFragment;
import com.google.android.gms.common.SignInButton;

import lombok.extern.slf4j.Slf4j;

public class MyActivity extends AppCompatActivity {
    private EditText emailEditText;
    private EditText passwordEditText;
    private Button loginButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_hehe);
        Toast.makeText(this, "MyActivity loaded", Toast.LENGTH_SHORT).show();

        emailEditText = findViewById(R.id.editTextTextEmailAddress);
        passwordEditText = findViewById(R.id.editTextTextPassword);
        loginButton = findViewById(R.id.button);

        loginButton.setOnClickListener(v -> {
            String email = emailEditText.getText().toString();
            System.out.println("Email: " + email);
            System.out.println("Password: " + passwordEditText.getText().toString());

            if (email.equals("hoana5k44nknd@gmail.com")) {
                Toast.makeText(MyActivity.this, "Login successful", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MyActivity.this, "Login failed", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
