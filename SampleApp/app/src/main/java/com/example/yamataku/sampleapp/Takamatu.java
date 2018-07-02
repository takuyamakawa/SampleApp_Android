package com.example.yamataku.sampleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.List;
import java.util.ArrayList;

public class Takamatu extends AppCompatActivity{

//    private List<String> list;
    private String[] list={"あ","い","う","え","お","か","き","く","け","こ","さ","し","す","せ","そ"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takamatu);

        GridView gridView=findViewById(R.id.gridView);


        ((TextView)findViewById(R.id.TextView)).setText("gridViewでは画像やテキストを配置できます。\n"
                + "1回目ではテキストのみを配置し押した部分のテキストを取得してToastで表示しています。");
//
//        list=new ArrayList<String>();
//        for (int i=0;i<50;i++){
//            list.add(String.valueOf(i));
//        }
//        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,list);
//        gridView.setNumColumns(5);
//        gridView.setAdapter(adapter);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.takamatsu_item,list);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String message=list[position];
                Toast.makeText(Takamatu.this,message,Toast.LENGTH_SHORT).show();
            }
        });

    }
    public void back(View view){
        finish();
    }
}

