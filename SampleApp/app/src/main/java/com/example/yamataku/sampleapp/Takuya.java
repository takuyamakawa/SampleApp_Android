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
        String text = "TableLayoutの説明です。\n\n" +
                "ボタンだけだなく画像やその他部品を配置させることができます。\n\n" +
                "大きさに関してはlayout_spanを変更することで変更できます。" +
                "上では、0のlayout_spanを2にした場合がそれに当たります。\n\n" +
                "また、配置はAttributesからもlayout_columnを指定することで変更できます。" +
                "上では、「+」のlayout_columnを3にした場合がそれに当たります。";

        intro.setText(text);
    }
}
