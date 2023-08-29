package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class LuckyNo2Basic extends AppCompatActivity {
    TextView welcome,luckyno;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lucky_no2_basic);
        welcome = findViewById(R.id.welcome2);
        luckyno = findViewById(R.id.luckynumber);
        btn =findViewById(R.id.btn2);
        int randNumber = randomno();
        luckyno.setText(""+randNumber);
        Intent i = getIntent();
        String userName = i.getStringExtra("nmae");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareData(userName,randNumber);
            }
        });
    }

    public int randomno(){
        Random random = new Random();
        int max_limit = 1000;
        int randomnumber = random.nextInt(max_limit);
        return randomnumber;
    }
    public void shareData(String uname ,int randno){
        Intent i = new  Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_SUBJECT,uname+ "Check out");
        i.putExtra(Intent.EXTRA_TEXT,"My lucky number is : "+randno);
        startActivity(Intent.createChooser(i,"Chose a platform"));

    }
}