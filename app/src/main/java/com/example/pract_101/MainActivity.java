package com.example.pract_101;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextStudentId, editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextStudentId = findViewById(R.id.editTextStudentId);
        editTextPassword = findViewById(R.id.editTextPassword);
    }

    public void onLoginClicked(View view) {
        String studentId = editTextStudentId.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();

        if (studentId.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "Please enter both Student ID and Password", Toast.LENGTH_SHORT).show();
            return;
        }

        // Replace the following with actual authentication logic
        // For this example, just display a success message
        Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show();
    }
}
