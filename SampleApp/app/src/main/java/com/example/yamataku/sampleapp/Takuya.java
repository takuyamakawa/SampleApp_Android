package com.example.yamataku.sampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Takuya extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takuya);

        TextView intro = findViewById(R.id.introduction);
        String text = "ほげほげほげほげほげほげほげほげほげほげほげほげ" +
                "ほげほげほげほげほげほげほげほげほげほげほげほげほげほげ" +
                "ほげほげほげほげほげほげほげほげほげほげほげほげほげほげ" +
                "ほげほげほげほげほげほげほげほげほげほげほげほげほげほげほげほげ" +
                "ほげほげほげほげほげほげほげほげほげほげほげほげほげほげほげほげ" +
                "ほげほげほげほげほげほげほげほげほげほげほげほげほげほげほげほげ";

        intro.setText(text);
    }
}
