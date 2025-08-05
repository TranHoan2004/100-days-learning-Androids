package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MyActivity extends AppCompatActivity {
    @SuppressLint("SetTextI18n")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Loading", Toast.LENGTH_SHORT).show();

        TextView title = findViewById(R.id.title);

        title.setOnClickListener(l -> {
            Toast.makeText(this, "Tu hoc lap trinh android", Toast.LENGTH_LONG).show();
        });
    }
}
