package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HeightCalActivity extends AppCompatActivity {
    Button convetButton;
    TextView conveterText;
    EditText editConverterText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_height_cal);
        convetButton = findViewById(R.id.convertButton);
         conveterText= findViewById(R.id.textView2);
         editConverterText = findViewById(R.id.editTextNumber);

        // convetButton.setOnClickListener(new View.OnClickListener() {
          //   @Override

         //});



    }
    public void covertMethod(View view) {
        try {
            Toast.makeText(HeightCalActivity.this, "Button Working", Toast.LENGTH_SHORT).show();
            String s = editConverterText.getText().toString();
            int cm = Integer.parseInt(s);
            Double feet = 0.032808 * cm;
            conveterText.setText("Your height in Feet is " + feet);
        }
        catch (Exception e){
            Toast.makeText(HeightCalActivity.this, "Enter value", Toast.LENGTH_SHORT).show();
        }
    }

}