package com.nse.android.maps;

import android.content.Intent;
import android.support.v4.text.TextUtilsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    DataBaseHelper mDb;
    EditText tname, tsurname, tparent, tcellnumber, tdateofbirth,thomeAddress,tEmergency,trelationship,tAge,tGrade;
    Button Bed;
    Button main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tGrade = (EditText) findViewById(R.id.Grade);
        tAge = (EditText) findViewById(R.id.Age);
        trelationship = (EditText) findViewById(R.id.relationship);
        tEmergency = (EditText) findViewById(R.id.Emergency);
        thomeAddress= (EditText) findViewById(R.id.Home);
        tname = (EditText) findViewById(R.id.name);
        tsurname = (EditText) findViewById(R.id.surname);
        tparent = (EditText) findViewById(R.id.Parent);
        tcellnumber = (EditText) findViewById(R.id.CELL);
        tdateofbirth = (EditText) findViewById(R.id.dateofbirth);
        Bed = (Button) findViewById(R.id.Bed);
        main=(Button)findViewById(R.id.Main);

        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent open=new Intent(MainActivity.this,MapsActivity.class);
                startActivity(open);
            }
        });
        Bed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ClickMe();
               if(TextUtils.isEmpty(tname.getText().toString().trim())||TextUtils.isEmpty(tsurname.getText().toString().trim())
                       ||TextUtils.isEmpty(tdateofbirth.getText().toString().trim())||TextUtils.isEmpty(tcellnumber.getText().toString().trim())||TextUtils.isEmpty(tparent.getText().toString().trim())||TextUtils.isEmpty(trelationship.getText().toString().trim())||TextUtils.isEmpty(thomeAddress.getText().toString().trim())
                       ||TextUtils.isEmpty(tEmergency.getText().toString().trim())||TextUtils.isEmpty(tAge.getText().toString().trim())||TextUtils.isEmpty(tGrade.getText().toString().trim())){

                    tname.setError("Fields cant be empty");
                    tsurname.setError("Fields cant be empty");
                    tparent.setError("Fields cant be empty");
                    tcellnumber.setError("Fields cant be empty");
                    tdateofbirth.setError("Fields cant be empty");
                    thomeAddress.setError("Fields cant be empty");
                    tEmergency.setError("Fields cant be empty");
                    trelationship.setError("Fields cant be empty");
                    tGrade.setError("Fields cant be empty");
                    tAge.setError("Fields cant be empty");
                }
                else {
                    Toast.makeText(MainActivity.this, "DATA RECORED", Toast.LENGTH_LONG).show();
                    //ClickMe();
               }

            }
        });

    }

    /*private void ClickMe() {
        String name = tname.getText().toString();
        String surname = tsurname.getText().toString();
        String parent = tparent.getText().toString();

        String cellnumber = tcellnumber.getText().toString();
        String dateofbirth = tdateofbirth.getText().toString();
        String relationship = trelationship.getText().toString();
        String Address = thomeAddress.getText().toString();
        String Emergency = tEmergency.getText().toString();
        Boolean result = mDb.insertData(name, surname, parent, cellnumber, dateofbirth,relationship,Emergency,Address);
        if (result == true) {
            Toast.makeText(MainActivity.this, "Registration peer", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(MainActivity.this, "Failed to capture", Toast.LENGTH_SHORT).show();
        }


    }*/
}
