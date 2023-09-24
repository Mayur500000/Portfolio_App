package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class CurrencyConcerter extends AppCompatActivity {
    EditText edt1;
    TextView tv1;
    Spinner spn1,spn2;
    String cur1,cur2;
    Button btn1;
    Double val;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_concerter);
        edt1 = findViewById(R.id.edt1);
        spn1 = findViewById(R.id.sp1);
        spn2 = findViewById(R.id.sp2);
        tv1 = findViewById(R.id.tv1);

        ArrayAdapter<CharSequence> ad1 = ArrayAdapter.createFromResource(this ,R.array.currency,android.R.layout.simple_spinner_item);
        ad1.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spn1.setAdapter(ad1);
        spn1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                cur1 = (String) adapterView.getItemAtPosition(i);
                ((TextView) spn1.getSelectedView()).setTextColor(getResources().getColor(R.color.black));
                //Toast.makeText(getApplicationContext(), cur1, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        ArrayAdapter<CharSequence> ad2 = ArrayAdapter.createFromResource(this ,R.array.currency,android.R.layout.simple_spinner_item);
        ad2.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spn2.setAdapter(ad2);
        spn2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                cur2 = (String) adapterView.getItemAtPosition(i);
                ((TextView) spn2.getSelectedView()).setTextColor(getResources().getColor(R.color.black));
                //Toast.makeText(getApplicationContext(), cur2, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }
    public void cal(View view) {
        try {


            if (cur1.equals("RS") && cur2.equals("RS")) {
                val = Double.parseDouble(edt1.getText().toString());
                tv1.setText(String.valueOf(val * 1) + " ₹");
            } else if (cur1.equals("RS") && cur2.equals("USD")) {
                val = Double.parseDouble(edt1.getText().toString());
                tv1.setText(String.valueOf(val * 0.012) + " $");
            } else if (cur1.equals("RS") && cur2.equals("YEN")) {
                val = Double.parseDouble(edt1.getText().toString());
                tv1.setText(String.valueOf(val * 1.76) + " ¥");
            } else if (cur1.equals("RS") && cur2.equals("EURO")) {
                val = Double.parseDouble(edt1.getText().toString());
                tv1.setText(String.valueOf(val * 0.011) + " €");
            } else if (cur1.equals("RS") && cur2.equals("RUBLE")) {
                val = Double.parseDouble(edt1.getText().toString());
                tv1.setText(String.valueOf(val * 1.16) + " ₽");
            }

            //USD
            else if (cur1.equals("USE") && cur2.equals("RS")) {
                val = Double.parseDouble(edt1.getText().toString());
                tv1.setText(String.valueOf(val * 83.16) + " ₹");
            } else if (cur1.equals("USD") && cur2.equals("USD")) {
                val = Double.parseDouble(edt1.getText().toString());
                tv1.setText(String.valueOf(val * 1) + " $");
            } else if (cur1.equals("USD") && cur2.equals("YEN")) {
                val = Double.parseDouble(edt1.getText().toString());
                tv1.setText(String.valueOf(val * 148.14) + " ¥");
            } else if (cur1.equals("USD") && cur2.equals("EURO")) {
                val = Double.parseDouble(edt1.getText().toString());
                tv1.setText(String.valueOf(val * 0.94) + " €");
            } else if (cur1.equals("USD") && cur2.equals("RUBLE")) {
                val = Double.parseDouble(edt1.getText().toString());
                tv1.setText(String.valueOf(val * 96.50) + " ₽");
            }
            //YEN
            else if (cur1.equals("YEN") && cur2.equals("RS")) {
                val = Double.parseDouble(edt1.getText().toString());
                tv1.setText(String.valueOf(val * 0.56) + " ₹");
            } else if (cur1.equals("YEN") && cur2.equals("USD")) {
                val = Double.parseDouble(edt1.getText().toString());
                tv1.setText(String.valueOf(val * 0.0068) + " $");
            } else if (cur1.equals("YEN") && cur2.equals("YEN")) {
                val = Double.parseDouble(edt1.getText().toString());
                tv1.setText(String.valueOf(val * 1) + " ¥");
            } else if (cur1.equals("YEN") && cur2.equals("EURO")) {
                val = Double.parseDouble(edt1.getText().toString());
                tv1.setText(String.valueOf(val * 0.0063) + " €");
            } else if (cur1.equals("USD") && cur2.equals("RUBLE")) {
                val = Double.parseDouble(edt1.getText().toString());
                tv1.setText(String.valueOf(val * 0.65) + " ₽");
            }
            //EURO
            else if (cur1.equals("EURO") && cur2.equals("RS")) {
                val = Double.parseDouble(edt1.getText().toString());
                tv1.setText(String.valueOf(val * 88.91) + " ₹");
            } else if (cur1.equals("EURO") && cur2.equals("USD")) {
                val = Double.parseDouble(edt1.getText().toString());
                tv1.setText(String.valueOf(val * 1.07) + " $");
            } else if (cur1.equals("EURO") && cur2.equals("YEN")) {
                val = Double.parseDouble(edt1.getText().toString());
                tv1.setText(String.valueOf(val * 158.37) + " ¥");
            } else if (cur1.equals("EURO") && cur2.equals("EURO")) {
                val = Double.parseDouble(edt1.getText().toString());
                tv1.setText(String.valueOf(val * 1) + " €");
            } else if (cur1.equals("EURO") && cur2.equals("RUBLE")) {
                val = Double.parseDouble(edt1.getText().toString());
                tv1.setText(String.valueOf(val * 103.42) + " ₽");
            }
            //RUBLE
            else if (cur1.equals("RUBLE") && cur2.equals("RS")) {
                val = Double.parseDouble(edt1.getText().toString());
                tv1.setText(String.valueOf(val * 0.86) + " ₹");
            } else if (cur1.equals("RUBLE") && cur2.equals("USD")) {
                val = Double.parseDouble(edt1.getText().toString());
                tv1.setText(String.valueOf(val * 0.010) + " $");
            } else if (cur1.equals("RUBLE") && cur2.equals("YEN")) {
                val = Double.parseDouble(edt1.getText().toString());
                tv1.setText(String.valueOf(val * 1.53) + " ¥");
            } else if (cur1.equals("RUBLE") && cur2.equals("EURO")) {
                val = Double.parseDouble(edt1.getText().toString());
                tv1.setText(String.valueOf(val * 0.0097) + " €");
            } else if (cur1.equals("RUBLE") && cur2.equals("RUBLE")) {
                val = Double.parseDouble(edt1.getText().toString());
                tv1.setText(String.valueOf(val * 1) + " ₽");
            }
        }
        catch (Exception e){
            Toast.makeText(this, "Enter a Valide Number ", Toast.LENGTH_SHORT).show();
        }
    }
}