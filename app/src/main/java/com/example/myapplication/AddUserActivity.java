package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.BreakIterator;

public class AddUserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_user);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


    public void addUser(View view) {
        EditText editFirstName = findViewById(R.id.editFirstName);
        EditText editLastName = findViewById(R.id.editLastName);
        EditText editEmail = findViewById(R.id.editEmail);
        RadioGroup radioDegreeProgram = findViewById(R.id.radioDegreeProgram);
        String degreeProgram = "";



        if (radioDegreeProgram.getCheckedRadioButtonId() == R.id.seRadioButton) {
            degreeProgram = "Software engineering";
        } else if (radioDegreeProgram.getCheckedRadioButtonId() == R.id.imRadioButton) {
                degreeProgram = "Industrial management";
        } else if (radioDegreeProgram.getCheckedRadioButtonId() == R.id.ceRadioButton) {
                degreeProgram = "Computational engineering";
        } else if (radioDegreeProgram.getCheckedRadioButtonId() == R.id.eeRadioButton) {
                degreeProgram = "Electrical engineering";
        }
        User newUser = new User(editFirstName.getText().toString(),editLastName.getText().toString(),editEmail.getText().toString(), degreeProgram);

    }

}