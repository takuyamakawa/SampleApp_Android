package com.example.yamataku.sampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button takuyaBtn = (Button) findViewById(R.id.takuya);
        takuyaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Takuya.class);
                startActivity(intent);
            }
        });

        Button kodaiBtn = (Button) findViewById(R.id.kodai);
        kodaiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Kodai.class);
                startActivity(intent);
            }
        });

        Button yukiBtn = (Button) findViewById(R.id.yuki);
        yukiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Yuki.class);
                startActivity(intent);
            }
        });

        Button maayaBtn = (Button) findViewById(R.id.maaya);
        maayaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Maaya.class);
                startActivity(intent);
            }
        });

        Button takamatuBtn = (Button) findViewById(R.id.takamatu);
        takamatuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Takamatu.class);
                startActivity(intent);
            }
        });

        Button takenobuBtn = (Button) findViewById(R.id.takenobu);
        takenobuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Takenobu.class);
                startActivity(intent);
            }
        });

        Button tomokaBtn = (Button) findViewById(R.id.tomoka);
        tomokaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Tomoka.class);
                startActivity(intent);
            }
        });
    }
}
