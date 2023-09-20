package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class BasicScreen extends AppCompatActivity {
    Button heightButton,luckynumberButton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_screen);
        heightButton = findViewById(R.id.heightButton);
        luckynumberButton2 =findViewById(R.id.luckynumberButton);


    }
    public void heightBtn(View view){
        Toast.makeText(BasicScreen.this,"Height Calulator", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(BasicScreen.this, HeightCalActivity.class );
        startActivity(intent);
    }
    public void luckyBtn(View view){
        Toast.makeText(BasicScreen.this,"LuckyNumber", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(BasicScreen.this, LuckyNoBasic.class );
        startActivity(intent);
    }
    public void CurrencyBtn(View view){
        Toast.makeText(BasicScreen.this,"Scroll", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(BasicScreen.this, CurrencyConcerter.class);
        startActivity(intent);
    }
}