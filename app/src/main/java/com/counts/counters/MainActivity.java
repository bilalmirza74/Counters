package com.counts.counters;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int counter;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textCounter = findViewById(R.id.textCounter);
        Button btnCounter = findViewById(R.id.btnCounter);
        Button Reset = findViewById(R.id.Reset);

        counter = 0;
        btnCounter.setOnClickListener(view -> {
            counter++;
            textCounter.setText(""+counter);
        });

        Reset.setOnClickListener(view -> {
            counter=0;
            textCounter.setText(""+counter);
        });
    }
}
