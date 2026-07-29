package com.example.program1;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String VALID_USERNAME = "ANAMIKA";
    private static final String VALID_PASSWORD = "PASSWORD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText usernameEditText = findViewById(R.id.username);
        EditText passwordEditText = findViewById(R.id.password);
        Button loginButton = findViewById(R.id.loginbutton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();
                if (VALID_USERNAME.equals(username) && VALID_PASSWORD.equals(password)) {
                    Toast.makeText(MainActivity.this, "login successful", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "invalid", Toast.LENGTH_SHORT).show();
                }

            }

        });
    }
}