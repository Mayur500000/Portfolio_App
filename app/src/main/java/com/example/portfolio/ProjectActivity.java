package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ProjectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);
        Button basicButton = findViewById(R.id.basic);
        basicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ProjectActivity.this,"Basic Projects",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ProjectActivity.this, BasicScreen.class );
                startActivity(intent);
            }
        });
    }
    public void intermediateBtn(View view){
        Toast.makeText(ProjectActivity.this,"Intermediate", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(ProjectActivity.this, Intermediate.class );
        startActivity(intent);
    }
}