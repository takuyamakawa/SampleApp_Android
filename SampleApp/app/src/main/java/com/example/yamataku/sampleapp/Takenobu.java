package com.example.yamataku.sampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.HashMap;
import java.util.Map;

public class Takenobu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takenobu);


        Map<String, String> aMap = new HashMap<>();

        //String Key[] = new String[10];


        aMap.put("ArrayAdapter","説明１");
        aMap.put("SimpleAdapter","説明２");
        aMap.put("BaseAdapter","説明３");
        aMap.put("a","説明４");
        aMap.put("b","説明５");
        aMap.put("c","説明６");

        ListView listView = (ListView) findViewById(R.id.dynamic);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1);

        for(String key : aMap.keySet()){
            adapter.add(key);
        }

        listView.setAdapter(adapter);
    }
}
