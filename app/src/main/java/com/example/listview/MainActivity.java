package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String string []={"Android","Java","PHP","HTML","JQuery","Jsp"};
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listview);
        arrayAdapter=new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,string);
        listView.setAdapter(arrayAdapter);
    }

}
