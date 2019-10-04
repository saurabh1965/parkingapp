package com.example.parkme;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
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
        s1.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {
                if (s1.getText().toString().isEmpty())
                {
                    s1.setText("EmPTY");
                    s1.setTextColor(Color.GREEN);
                }
                else
                    { s1.setText("FiLLED");
                    s1.setTextColor(Color.RED);
                    }
            }
            }
        );
        s2.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v)
            {
                if (s2.getText().toString().isEmpty())
                {
                    s2.setText("EmPTY");
                    s2.setTextColor(Color.GREEN);
                }
                else
                    { s2.setText("FiLLED");
                    s2.setTextColor(Color.RED);
                    }
                }
            }
        );
        s3.setOnClickListener(new Button.OnClickListener(){
                                  public void onClick(View v)
                                  {
                                      if (s3.getText().toString().isEmpty())
                                      {
                                          s3.setText("EmPTY");
                                          s3.setTextColor(Color.GREEN);
                                      }
                                      else
                                      { s3.setText("FiLLED");
                                          s3.setTextColor(Color.RED);
                                      }
                                  }
                              }
        );
        s4.setOnClickListener(new Button.OnClickListener(){
                                  public void onClick(View v)
                                  {
                                      if (s4.getText().toString().isEmpty())
                                      {
                                          s4.setText("EmPTY");
                                          s4.setTextColor(Color.GREEN);
                                      }
                                      else
                                      { s4.setText("FiLLED");
                                          s4.setTextColor(Color.RED);
                                      }
                                  }
                              }
        );

                s5.setOnClickListener(new Button.OnClickListener(){
                    public void onClick(View v)
                    {
                        if (s5.getText().toString().isEmpty())
                        {
                            s5.setText("EmPTY");
                            s5.setTextColor(Color.GREEN);
                        }
                        else
                        { s5.setText("FiLLED");
                            s5.setTextColor(Color.RED);
                        }
                    }
                }
        );
    }
}
