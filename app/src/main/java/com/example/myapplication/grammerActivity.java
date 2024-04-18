package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class grammerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_grammer);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ListView listView = findViewById(R.id.listview);
        List<String> list = new ArrayList<>();
        list.add("Past Simple");
        list.add("Past Continuos");
        list.add("Present Simple");
        list.add("Present Continous");
        list.add("Simple Future");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext() , android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);

      listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              if(position==0){
                  Intent in1=new Intent(grammerActivity.this,past_simple_activity.class);
                  startActivity(in1);
              }else if (position==1){
                  Intent in1=new Intent(grammerActivity.this,past_cont_activity.class);
                  startActivity(in1);

              }else if (position==2) {
                  Intent in1 = new Intent(grammerActivity.this, present_simple_activity.class);
                  startActivity(in1);
              }else if (position==3) {
                  Intent in1 = new Intent(grammerActivity.this, present_cont_activity.class);
                  startActivity(in1);
              }else if (position==4) {
                  Intent in1 = new Intent(grammerActivity.this, simple_future_activity.class);
                  startActivity(in1);
              }
          }
      });











    }



}