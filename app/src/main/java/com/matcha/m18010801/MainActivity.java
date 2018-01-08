package com.matcha.m18010801;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView act;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        act=findViewById(R.id.autoCompleteTextView);
        String[] str={"aac","bbc","cca","abc","aad","cac","ccc"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(
                MainActivity.this,android.R.layout.simple_list_item_1,str);
        act.setThreshold(1);
        act.setAdapter(adapter);

    }
}
