package com.nse.android.maps;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Registration extends AppCompatActivity {
  TextView mtitle;
  //TextView S1;
  //TextView S2;
  //TextView S3;
  //TextView S4;
  //TextView S5;
  //TextView s6;
    ListView lv;

    String[] list={"Kimberley Junoir School","Newton Primary School","Floors Primary School","Staats Primary School","St Cyprians Grammar School",
    "Healer Primary School","Endeaver Primary school","Diamantveld Primary School","Sol plaatjie primary school","Tshiamo primary school","Masiza primary school",
   "Boitshoko primary school","Flamingo primary school","Flamingo primary school","Isago primary school" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        mtitle=(TextView)findViewById(R.id.title);
        mtitle.setPaintFlags(mtitle.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);

       lv=(ListView)findViewById(R.id.listView);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
        lv.setAdapter(adapter);
      lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
              Intent intent=new Intent(Registration.this,MainActivity.class);
              startActivity(intent);
          }
      });
    }
}
