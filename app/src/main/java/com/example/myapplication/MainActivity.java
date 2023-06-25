package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void oncalc(View v){
        EditText et1,et2,et3;
        et1= (EditText)findViewById(R.id.et1);
        et2= (EditText)findViewById(R.id.et2);
        et3= (EditText)findViewById(R.id.et3);
        Button b1;
        float w= Float.valueOf(et2.getText().toString());
        float h= Float.valueOf(et3.getText().toString());
        float meter= h / 100;
        float bmi = w / (meter * meter);
        String str = et1.getText().toString();
        if (bmi < 18.5) {
            str  = "underweight";
        }
        else if (bmi < 25) {
            str = "normal";
        }
        else if (bmi < 30) {
            str = "overweight";
        }
        else {
            str = "obese";
        }

        et1.setText(str);

    }
}