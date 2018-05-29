package com.example.yamataku.sampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tomoka extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tomoka);

        ListView lvCategory = findViewById(R.id.lvCategory);
        List<Map<String, String>> categoryList = new ArrayList<>();
        Map<String, String> category = new HashMap<>();
        category.put("name", "このカテゴリを検索する");
        category.put("number", "44");
        categoryList.add(category);
        category = new HashMap<>();
        category.put("name", "アイス");
        category.put("number", "4");
        categoryList.add(category);
        category = new HashMap<>();
        category.put("name", "クッキー");
        category.put("number", "2");
        categoryList.add(category);
        category = new HashMap<>();
        category.put("name", "ケーキ");
        category.put("number", "26");
        categoryList.add(category);
        category = new HashMap<>();
        category.put("name", "シュークリーム");
        category.put("number", "5");
        categoryList.add(category);
        category = new HashMap<>();
        category.put("name", "チョコレート");
        category.put("number", "3");
        categoryList.add(category);
        category = new HashMap<>();
        category.put("name", "パイ");
        category.put("number", "4");
        categoryList.add(category);

        String[] from = {"name", "number"};
        int[] to = {android.R.id.text1, android.R.id.text2};
        SimpleAdapter adapter = new SimpleAdapter(Tomoka.this, categoryList, android.R.layout.simple_list_item_2, from, to);
        lvCategory.setAdapter(adapter);
    }
}
