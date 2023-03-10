package com.example.filemanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;

    Button plus,minus,multi,division,pow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plus = (Button) findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multi = findViewById(R.id.multiply);
        division = findViewById(R.id.division);


    }
}