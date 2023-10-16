package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class RatingPage2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_page2);
        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");
        String email = intent.getStringExtra("Email");
        String gender = intent.getStringExtra("Gender");
        boolean reading = intent.getBooleanExtra("Reading", false);
        boolean traveling = intent.getBooleanExtra("Traveling", false);
        boolean sports = intent.getBooleanExtra("Sports", false);
        float rating = intent.getFloatExtra("Rating", 0.0f);

        // Display the data
        TextView tvName = findViewById(R.id.tvName);
        tvName.setText("Name: " + name);

        TextView tvEmail = findViewById(R.id.tvEmail);
        tvEmail.setText("Email: " + email);

        TextView tvGender = findViewById(R.id.tvGender);
        tvGender.setText("Gender: " + gender);

        TextView tvInterests = findViewById(R.id.tvInterests);
        StringBuilder interests = new StringBuilder("Interests: ");
        if (reading) {
            interests.append("Reading ");
        }
        if (traveling) {
            interests.append("Traveling ");
        }
        if (sports) {
            interests.append("Sports ");
        }
        tvInterests.setText(interests.toString());

        ProgressBar progressRating = findViewById(R.id.progressRating);
        int ratingProgress = (int) (rating * (progressRating.getMax() / 5.0f)); // Assuming a maximum rating of 5
        progressRating.setProgress(ratingProgress);
    }
}