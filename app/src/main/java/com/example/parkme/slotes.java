package com.example.parkme;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class slotes extends AppCompatActivity
{
    TextView s1;
    TextView s2;
    TextView s3;
    TextView s4;
    TextView s5;
    TextView s6;
    TextView s7;
    TextView s8;
    TextView s9;
    TextView s10;
    TextView spot;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slotes);
        s1 =(TextView) findViewById(R.id.s1);
        s2 =(TextView) findViewById(R.id.s2);
        s3 =(TextView) findViewById(R.id.s3);
        s4 =(TextView) findViewById(R.id.s4);
        s5 =(TextView) findViewById(R.id.s5);
        s6 =(TextView) findViewById(R.id.s6);
        s7 =(TextView) findViewById(R.id.s7);
        s8 =(TextView) findViewById(R.id.s8);
        s9 =(TextView) findViewById(R.id.s9);
        s10 =(TextView) findViewById(R.id.s10);
        spot = (TextView) findViewById(R.id.spot)
        String x= findViewById(R.id.spot).toString();
       /* try{
            x = findViewById(R.id.spot).toString();
        }catch (Exception e){
            Log.e("aaaa", "onCreate: ");
        }*/
       spot = getIntent().getExtras().getString("value");

       x.setText(spot);

        if (2+""==x)
            { s2.setBackgroundColor(Color.RED); }
            else
                { s2.setBackgroundColor(Color.GREEN);
                }
        if (1+""==x)
            { s1.setBackgroundColor(Color.RED); }
        else
        { s1.setBackgroundColor(Color.GREEN);
        }
        if (3+""==x)
        { s3.setBackgroundColor(Color.RED); }
        else
        { s3.setBackgroundColor(Color.GREEN);
        }
        if (4+""==x)
        { s4.setBackgroundColor(Color.RED); }
        else
        { s4.setBackgroundColor(Color.GREEN);
        }
        if (5+""==x)
        { s5.setBackgroundColor(Color.RED); }
        else
        { s5.setBackgroundColor(Color.GREEN);
        }
        if (6+""==x)
        { s6.setBackgroundColor(Color.RED); }
        else
        { s6.setBackgroundColor(Color.GREEN);
        }
        if (7+""==x)
        { s7.setBackgroundColor(Color.RED); }
        else
        { s7.setBackgroundColor(Color.GREEN);
        }
        if (8+""==x)
        { s8.setBackgroundColor(Color.RED); }
        else
        { s8.setBackgroundColor(Color.GREEN);
        }
        if (9+""==x)
        { s9.setBackgroundColor(Color.RED); }
        else
        { s9.setBackgroundColor(Color.GREEN);
        }
        if (10+""==x)
        { s10.setBackgroundColor(Color.RED); }
        else
        { s10.setBackgroundColor(Color.GREEN);
        }
    }
}
