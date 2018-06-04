package com.example.yamataku.sampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Takenobu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takenobu);

        HashMap<String, String> aMap = new HashMap<>();

        //情報をコードから入力
        aMap.put("ArrayAdapter","説明１");
        aMap.put("SimpleAdapter","説明２");
        aMap.put("BaseAdapter","説明３");
        aMap.put("a","説明４");
        aMap.put("b","説明５");
        aMap.put("c","説明６");
        aMap.put("d","説明７");
        for(int i=0; i<10; i++){
            aMap.put("e"+i,"説明"+(i+7));
        }

        ListView listView = (ListView) findViewById(R.id.dynamic);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1);

        for(String key : aMap.keySet()){
            adapter.add(key);
        }
        listView.setAdapter(adapter);

        final HashMap<String, String> copyMap = aMap;

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ListView list = (ListView)parent;
                String msg =  copyMap.get((String)list.getItemAtPosition(position));
                Toast.makeText(getBaseContext(), msg,Toast.LENGTH_LONG).show();
            }
        });
    }
}
