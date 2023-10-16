package com.example.portfolio;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;

public class RatingPage extends AppCompatActivity {
    private EditText etName, etEmail;
    private RadioGroup radioGroup;
    private CheckBox cbReading, cbTraveling, cbSports;
    private RatingBar ratingBar;
    private Button btnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_page);

        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        radioGroup = findViewById(R.id.radioGroup);
        cbReading = findViewById(R.id.cbReading);
        cbTraveling = findViewById(R.id.cbTraveling);
        cbSports = findViewById(R.id.cbSports);
        ratingBar = findViewById(R.id.ratingBar);
        btnRegister = findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get user input
                String name = etName.getText().toString();
                String email = etEmail.getText().toString();
                int genderId = radioGroup.getCheckedRadioButtonId();
                String gender = "";
                if (genderId == R.id.rbMale) {
                    gender = "Male";
                } else if (genderId == R.id.rbFemale) {
                    gender = "Female";
                } else if (genderId == R.id.rbOther) {
                    gender = "Other";
                }
                boolean reading = cbReading.isChecked();
                boolean traveling = cbTraveling.isChecked();
                boolean sports = cbSports.isChecked();
                float rating = ratingBar.getRating();

                // Pass user input to the next activity
                Intent intent = new Intent(getApplicationContext(), RatingPage2.class);
                intent.putExtra("Name", name);
                intent.putExtra("Email", email);
                intent.putExtra("Gender", gender);
                intent.putExtra("Reading", reading);
                intent.putExtra("Traveling", traveling);
                intent.putExtra("Sports", sports);
                intent.putExtra("Rating", rating);
                startActivity(intent);
            }
        });
    }
}