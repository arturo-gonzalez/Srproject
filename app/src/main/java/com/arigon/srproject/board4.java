package com.arigon.srproject;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by art on 1/6/2017.
 */

public class board4 extends AppCompatActivity {

    TextView textView1;
    boolean clicked = false;
    String value;
    Button currButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.board4);

        //get random numbers
        int[] randNum = new int[8];

        for(int i = 0; i<8; i++)
        {
            randNum[i] = (int) (Math.random() * 50);
        }




        Button button1 = (Button) findViewById(R.id.button1);
        button1.setText(String.valueOf(randNum[0]));
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(clicked)
                {
                    currButton.setBackgroundColor(Color.GRAY);
                }
                Button button=(Button) v;
                value = button.getText().toString();
                button.setBackgroundColor(Color.WHITE);

                clicked = true;
                currButton = button;

            }
        });
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setText(String.valueOf(randNum[1]));
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(clicked)
                {
                    currButton.setBackgroundColor(Color.GRAY);
                }
                Button button=(Button) v;
                value = button.getText().toString();
                button.setBackgroundColor(Color.WHITE);


                clicked = true;
                currButton = button;

            }
        });
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setText(String.valueOf(randNum[2]));
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(clicked)
                {
                    currButton.setBackgroundColor(Color.GRAY);
                }
                Button button=(Button) v;
                value = button.getText().toString();
                button.setBackgroundColor(Color.WHITE);


                clicked = true;
                currButton = button;

            }
        });
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setText(String.valueOf(randNum[3]));
        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(clicked)
                {
                    currButton.setBackgroundColor(Color.GRAY);
                }
                Button button=(Button) v;
                value = button.getText().toString();
                button.setBackgroundColor(Color.WHITE);


                clicked = true;
                currButton = button;

            }
        });
        Button button5 = (Button) findViewById(R.id.button5);
        button5.setText(String.valueOf(randNum[4]));
        button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(clicked)
                {
                    currButton.setBackgroundColor(Color.GRAY);
                }
                Button button=(Button) v;
                value = button.getText().toString();
                button.setBackgroundColor(Color.WHITE);


                clicked = true;
                currButton = button;

            }
        });
        Button button6 = (Button) findViewById(R.id.button6);
        button6.setText(String.valueOf(randNum[5]));
        button6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(clicked)
                {
                    currButton.setBackgroundColor(Color.GRAY);
                }
                Button button=(Button) v;
                value = button.getText().toString();
                button.setBackgroundColor(Color.WHITE);


                clicked = true;
                currButton = button;

            }
        });
        Button button7 = (Button) findViewById(R.id.button7);
        button7.setText(String.valueOf(randNum[6]));
        button7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(clicked)
                {
                    currButton.setBackgroundColor(Color.GRAY);
                }
                Button button=(Button) v;
                value = button.getText().toString();
                button.setBackgroundColor(Color.WHITE);


                clicked = true;
                currButton = button;

            }
        });
        Button button8 = (Button) findViewById(R.id.button8);
        button8.setText(String.valueOf(randNum[7]));
        button8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(clicked)
                {
                    currButton.setBackgroundColor(Color.GRAY);
                }
                Button button=(Button) v;
                value = button.getText().toString();
                button.setBackgroundColor(Color.WHITE);


                clicked = true;
                currButton = button;

            }
        });




        //< and < on board
        Button btn2 = (Button) findViewById(R.id.btn2);
        btn2.setText(randomSign());
        Button btn4 = (Button) findViewById(R.id.btn4);
        //btn4.setText(randomSign());
        Button btn5 = (Button) findViewById(R.id.btn5);
        btn5.setText(randomSign());
        Button btn7 = (Button) findViewById(R.id.btn7);
        btn7.setText(randomSign());
        Button btn10 = (Button) findViewById(R.id.btn10);
        btn10.setText(randomSign());
        Button btn12 = (Button) findViewById(R.id.btn12);
        btn12.setText(randomSign());
        Button btn13 = (Button) findViewById(R.id.btn13);
        //btn13.setText(randomSign());
        Button btn15 = (Button) findViewById(R.id.btn15);
        btn15.setText(randomSign());




        //board buttons
        Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn=(Button) v;
                if(clicked&&btn.getText().length() == 0)
                {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }




            }
        });
        Button btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn=(Button) v;
                if(clicked&&btn.getText().length() == 0)
                {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }




            }
        });
        Button btn6 = (Button) findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn=(Button) v;
                if(clicked&&btn.getText().length() == 0)
                {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }




            }
        });
        Button btn8 = (Button) findViewById(R.id.btn8);
        btn8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn=(Button) v;
                if(clicked&&btn.getText().length() == 0)
                {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }




            }
        });
        Button btn9 = (Button) findViewById(R.id.btn9);
        btn9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn=(Button) v;
                if(clicked&&btn.getText().length() == 0)
                {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }




            }
        });
        Button btn11 = (Button) findViewById(R.id.btn11);
        btn11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn=(Button) v;
                if(clicked&&btn.getText().length() == 0)
                {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }




            }
        });
        Button btn14 = (Button) findViewById(R.id.btn14);
        btn14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn=(Button) v;
                if(clicked&&btn.getText().length() == 0)
                {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }




            }
        });
        Button btn16 = (Button) findViewById(R.id.btn16);
        btn16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn=(Button) v;
                if(clicked&&btn.getText().length() == 0)
                {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }




            }
        });
    }

    public String randomSign(){
        String v;
        int x = (int) (Math.random() * 2);
        if(x == 1)
            v = ">";
        else
            v = "<";

        return v;
    }

}

