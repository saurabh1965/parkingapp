package com.example.parkme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView name;
    TextView cont;
    TextView vnum;
    TextView spot;
    TextView tim;
    Button submit;
    TextView message;
    List<String> spots =new ArrayList<>();
    Button b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name =(TextView) findViewById(R.id.name);
        cont=(TextView) findViewById(R.id.cont);
        spot =(TextView) findViewById(R.id.spot);
        vnum=(TextView) findViewById(R.id.vnum);
        tim =(TextView) findViewById(R.id.tim);
        submit =(Button) findViewById(R.id.submit);
        message =(TextView) findViewById(R.id.message);
        findViewById(R.id.det).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent xy = new Intent(MainActivity.this,detail.class);
                startActivity(xy);
            }
        });
        findViewById(R.id.sslot).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivity.this,slotes.class);
                startActivity(x);
            }
        });
        submit.setOnClickListener(new Button.OnClickListener(){
                    public void onClick(View v){
                        //Toast.makeText(MainActivity.this, "detail saved", Toast.LENGTH_SHORT).show();
                        if (name.getText().toString().isEmpty()||tim.getText().toString().isEmpty()||spot.getText().toString().isEmpty()||vnum.getText().toString().isEmpty()||cont.getText().toString().isEmpty())
                        {
                            message.setText("please fill all detail");
                            message.setTextColor(Color.RED);

                        }
                        else
                        {
                            if(spots.contains(spot.getText().toString()))
                            {
                                message.setText("spot already taken");
                                message.setTextColor(Color.RED);
                            }
                            else
                            {
                                spots.add(spot.getText().toString());
                                message.setText("detail saved");
                                message.setTextColor(Color.GREEN);
                            }

                        }
                    }
                }
        );

    }


}


