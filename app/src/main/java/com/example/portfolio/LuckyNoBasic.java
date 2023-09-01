package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LuckyNoBasic extends AppCompatActivity {

    EditText  editText;
    TextView textView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lucky_no_basic);
        editText= findViewById(R.id.editTextText);
        button = findViewById(R.id.btn1);
        textView = findViewById(R.id.enternmber);


    }
    public void guess(View view){
        Toast.makeText(LuckyNoBasic.this,"Good Luck", Toast.LENGTH_SHORT).show();
        String s = editText.getText().toString();
        Intent i = new Intent(getApplicationContext(), LuckyNo2Basic.class);
        i.putExtra("name",s);
        startActivity(i);

    }

}