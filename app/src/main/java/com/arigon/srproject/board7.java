/**
 * Created by art on 1/18/2017.
 */
package com.arigon.srproject;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;




import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;


public class board7 extends AppCompatActivity {
    boolean clicked = false;
    String value;
    Button currButton;

    Button[] boardButtons = new Button[49];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.board7);

        final TextView alert=(TextView) findViewById(R.id.textView1);

        //get random numbers
        int[] randNum = new int[25];

        for(int i = 0; i<25; i++)
        {
            randNum[i] = (int) (Math.random() * 100);
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
        Button button9 = (Button) findViewById(R.id.button9);
        button9.setText(String.valueOf(randNum[8]));
        button9.setOnClickListener(new View.OnClickListener() {

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
        Button button10 = (Button) findViewById(R.id.button10);
        button10.setText(String.valueOf(randNum[9]));
        button10.setOnClickListener(new View.OnClickListener() {

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
        Button button11 = (Button) findViewById(R.id.button11);
        button11.setText(String.valueOf(randNum[10]));
        button11.setOnClickListener(new View.OnClickListener() {

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
        Button button12 = (Button) findViewById(R.id.button12);
        button12.setText(String.valueOf(randNum[11]));
        button12.setOnClickListener(new View.OnClickListener() {

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
        Button button13 = (Button) findViewById(R.id.button13);
        button13.setText(String.valueOf(randNum[12]));
        button13.setOnClickListener(new View.OnClickListener() {

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
        Button button14 = (Button) findViewById(R.id.button14);
        button14.setText(String.valueOf(randNum[13]));
        button14.setOnClickListener(new View.OnClickListener() {

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
        Button button15 = (Button) findViewById(R.id.button15);
        button15.setText(String.valueOf(randNum[14]));
        button15.setOnClickListener(new View.OnClickListener() {

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
        Button button16 = (Button) findViewById(R.id.button16);
        button16.setText(String.valueOf(randNum[15]));
        button16.setOnClickListener(new View.OnClickListener() {

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
        Button button17 = (Button) findViewById(R.id.button17);
        button17.setText(String.valueOf(randNum[16]));
        button17.setOnClickListener(new View.OnClickListener() {

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
        Button button18 = (Button) findViewById(R.id.button18);
        button18.setText(String.valueOf(randNum[17]));
        button18.setOnClickListener(new View.OnClickListener() {

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
        Button button19 = (Button) findViewById(R.id.button19);
        button19.setText(String.valueOf(randNum[18]));
        button19.setOnClickListener(new View.OnClickListener() {

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
        Button button20 = (Button) findViewById(R.id.button20);
        button20.setText(String.valueOf(randNum[19]));
        button20.setOnClickListener(new View.OnClickListener() {

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
        Button button21= (Button) findViewById(R.id.button21);
        button21.setText(String.valueOf(randNum[20]));
        button21.setOnClickListener(new View.OnClickListener() {

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
        Button button22 = (Button) findViewById(R.id.button22);
        button22.setText(String.valueOf(randNum[21]));
        button22.setOnClickListener(new View.OnClickListener() {

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
        Button button23 = (Button) findViewById(R.id.button23);
        button23.setText(String.valueOf(randNum[22]));
        button23.setOnClickListener(new View.OnClickListener() {

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
        Button button24 = (Button) findViewById(R.id.button24);
        button24.setText(String.valueOf(randNum[23]));
        button24.setOnClickListener(new View.OnClickListener() {

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
        Button button25 = (Button) findViewById(R.id.button25);
        button25.setText(String.valueOf(randNum[24]));
        button25.setOnClickListener(new View.OnClickListener() {

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
        boardButtons[1] = btn2;
        Button btn4 = (Button) findViewById(R.id.btn4);
        btn4.setText(randomSign());
        boardButtons[3] = btn4;
        Button btn6 = (Button) findViewById(R.id.btn6);
        btn6.setText(randomSign());
        boardButtons[5] = btn6;
        Button btn8 = (Button) findViewById(R.id.btn8);
        btn8.setText(randomSign());
        boardButtons[7] = btn8;
        Button btn10 = (Button) findViewById(R.id.btn10);
        btn10.setText(randomSign());
        boardButtons[9] = btn10;
        Button btn12 = (Button) findViewById(R.id.btn12);
        btn12.setText(randomSign());
        boardButtons[11] = btn12;
        Button btn14 = (Button) findViewById(R.id.btn14);
        btn14.setText(randomSign());
        boardButtons[13] = btn14;
        Button btn16 = (Button) findViewById(R.id.btn16);
        btn16.setText(randomSign());
        boardButtons[15] = btn16;
        Button btn18 = (Button) findViewById(R.id.btn18);
        btn18.setText(randomSign());
        boardButtons[17] = btn18;
        Button btn20 = (Button) findViewById(R.id.btn20);
        btn20.setText(randomSign());
        boardButtons[19] = btn20;
        Button btn22 = (Button) findViewById(R.id.btn22);
        btn22.setText(randomSign());
        boardButtons[21] = btn22;
        Button btn24 = (Button) findViewById(R.id.btn24);
        btn24.setText(randomSign());
        boardButtons[23] = btn24;
        Button btn26 = (Button) findViewById(R.id.btn26);
        btn26.setText(randomSign());
        boardButtons[25] = btn26;
        Button btn28 = (Button) findViewById(R.id.btn28);
        btn28.setText(randomSign());
        boardButtons[27] = btn28;
        Button btn30 = (Button) findViewById(R.id.btn30);
        btn30.setText(randomSign());
        boardButtons[29] = btn30;
        Button btn32 = (Button) findViewById(R.id.btn32);
        btn32.setText(randomSign());
        boardButtons[31] = btn32;
        Button btn34 = (Button) findViewById(R.id.btn34);
        btn34.setText(randomSign());
        boardButtons[33] = btn34;
        Button btn36 = (Button) findViewById(R.id.btn36);
        btn36.setText(randomSign());
        boardButtons[35] = btn36;
        Button btn38 = (Button) findViewById(R.id.btn38);
        btn38.setText(randomSign());
        boardButtons[37] = btn38;
        Button btn40 = (Button) findViewById(R.id.btn40);
        btn40.setText(randomSign());
        boardButtons[39] = btn40;
        Button btn42 = (Button) findViewById(R.id.btn42);
        btn42.setText(randomSign());
        boardButtons[41] = btn42;
        Button btn44 = (Button) findViewById(R.id.btn44);
        btn44.setText(randomSign());
        boardButtons[43] = btn44;
        Button btn46 = (Button) findViewById(R.id.btn46);
        btn46.setText(randomSign());
        boardButtons[45] = btn46;
        Button btn48 = (Button) findViewById(R.id.btn48);
        btn48.setText(randomSign());
        boardButtons[47] = btn48;




        //board buttons
        Button btn1 = (Button) findViewById(R.id.btn1);
        boardButtons[0] = btn1;
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn=(Button) v;
                if(clicked&&btn.getText().length() == 0&&checkIfValid(btn, alert))
                {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }




            }
        });
        Button btn3 = (Button) findViewById(R.id.btn3);
        boardButtons[2] = btn3;
        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn=(Button) v;
                if(clicked&&btn.getText().length() == 0&&checkIfValid(btn, alert))
                {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }




            }
        });
        Button btn5 = (Button) findViewById(R.id.btn5);
        boardButtons[4] = btn5;
        btn5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn=(Button) v;
                if(clicked&&btn.getText().length() == 0&&checkIfValid(btn, alert))
                {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }




            }
        });
        Button btn7 = (Button) findViewById(R.id.btn7);
        boardButtons[6] = btn7;
        btn7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn=(Button) v;
                if(clicked&&btn.getText().length() == 0&&checkIfValid(btn, alert))
                {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }




            }
        });
        Button btn9 = (Button) findViewById(R.id.btn9);
        boardButtons[8] = btn9;
        btn9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn=(Button) v;
                if(clicked&&btn.getText().length() == 0&&checkIfValid(btn, alert))
                {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }




            }
        });
        Button btn11 = (Button) findViewById(R.id.btn11);
        boardButtons[10] = btn11;
        btn11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn=(Button) v;
                if(clicked&&btn.getText().length() == 0&&checkIfValid(btn, alert))
                {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }




            }
        });
        Button btn13 = (Button) findViewById(R.id.btn13);
        boardButtons[12] = btn13;
        btn13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn=(Button) v;
                if(clicked&&btn.getText().length() == 0&&checkIfValid(btn, alert))
                {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }




            }
        });
        Button btn15 = (Button) findViewById(R.id.btn15);
        boardButtons[14] = btn15;
        btn15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn=(Button) v;
                if(clicked&&btn.getText().length() == 0&&checkIfValid(btn, alert))
                {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }




            }
        });
        Button btn17 = (Button) findViewById(R.id.btn17);
        boardButtons[16] = btn17;
        btn17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn=(Button) v;
                if(clicked&&btn.getText().length() == 0&&checkIfValid(btn, alert))
                {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }




            }
        });
        Button btn19 = (Button) findViewById(R.id.btn19);
        boardButtons[18] = btn19;
        btn19.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn=(Button) v;
                if(clicked&&btn.getText().length() == 0&&checkIfValid(btn, alert))
                {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }




            }
        });
        Button btn21 = (Button) findViewById(R.id.btn21);
        boardButtons[20] = btn21;
        btn21.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn=(Button) v;
                if(clicked&&btn.getText().length() == 0&&checkIfValid(btn, alert))
                {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }




            }
        });
        Button btn23 = (Button) findViewById(R.id.btn23);
        boardButtons[22] = btn23;
        btn23.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn=(Button) v;
                if(clicked&&btn.getText().length() == 0&&checkIfValid(btn, alert))
                {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }




            }
        });
        Button btn25 = (Button) findViewById(R.id.btn25);
        boardButtons[24] = btn25;
        btn25.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn=(Button) v;
                if(clicked&&btn.getText().length() == 0&&checkIfValid(btn, alert))
                {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }




            }
        });
        Button btn27 = (Button) findViewById(R.id.btn27);
        boardButtons[26] = btn27;
        btn27.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn=(Button) v;
                if(clicked&&btn.getText().length() == 0&&checkIfValid(btn, alert))
                {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }




            }
        });
        Button btn29 = (Button) findViewById(R.id.btn29);
        boardButtons[28] = btn29;
        btn29.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn=(Button) v;
                if(clicked&&btn.getText().length() == 0&&checkIfValid(btn, alert))
                {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }




            }
        });
        Button btn31 = (Button) findViewById(R.id.btn31);
        boardButtons[30] = btn31;
        btn31.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn=(Button) v;
                if(clicked&&btn.getText().length() == 0&&checkIfValid(btn, alert ))
                {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }




            }
        });
        Button btn33= (Button) findViewById(R.id.btn33);
        boardButtons[32] = btn33;
        btn33.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn=(Button) v;
                if(clicked&&btn.getText().length() == 0&&checkIfValid(btn, alert))
                {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }




            }
        });
        Button btn35 = (Button) findViewById(R.id.btn35);
        boardButtons[34] = btn35;
        btn35.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn=(Button) v;
                if(clicked&&btn.getText().length() == 0&&checkIfValid(btn, alert))
                {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }




            }
        });
        Button btn37 = (Button) findViewById(R.id.btn37);
        boardButtons[36] = btn37;
        btn37.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn=(Button) v;
                if(clicked&&btn.getText().length() == 0&&checkIfValid(btn, alert))
                {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }




            }
        });
        Button btn39 = (Button) findViewById(R.id.btn39);
        boardButtons[38] = btn39;
        btn39.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn=(Button) v;
                if(clicked&&btn.getText().length() == 0&&checkIfValid(btn, alert))
                {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }




            }
        });
        Button btn41 = (Button) findViewById(R.id.btn41);
        boardButtons[40] = btn41;
        btn41.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn=(Button) v;
                if(clicked&&btn.getText().length() == 0&&checkIfValid(btn, alert))
                {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }




            }
        });
        Button btn43= (Button) findViewById(R.id.btn43);
        boardButtons[42] = btn43;
        btn43.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn=(Button) v;
                if(clicked&&btn.getText().length() == 0&&checkIfValid(btn, alert))
                {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }




            }
        });
        Button btn45 = (Button) findViewById(R.id.btn45);
        boardButtons[44] = btn45;
        btn45.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn=(Button) v;
                if(clicked&&btn.getText().length() == 0&&checkIfValid(btn, alert))
                {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }




            }
        });
        Button btn47 = (Button) findViewById(R.id.btn47);
        boardButtons[46] = btn47;
        btn47.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn=(Button) v;
                if(clicked&&btn.getText().length() == 0&&checkIfValid(btn, alert))
                {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }




            }
        });
        Button btn49 = (Button) findViewById(R.id.btn49);
        boardButtons[48] = btn49;
        btn49.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn=(Button) v;
                if(clicked&&btn.getText().length() == 0&&checkIfValid(btn, alert))
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

    public Boolean checkIfValid(Button button, TextView alert)
    {
        for(int i = 0; i<49; i++)
        {
            if(boardButtons[i] == button)
            {
                //1 and 9
                if(boardButtons[i]==boardButtons[0]||boardButtons[i]==boardButtons[8])
                {
                    if(boardButtons[i+2].getText()==""&&boardButtons[i+14].getText()=="")
                    {
                        alert.setText("");
                        return true;
                    }
                    else if(boardButtons[i+2].getText()!=""&&boardButtons[i+14].getText()=="")
                    {
                        if(boardButtons[i+1].getText()==">"&&String.valueOf(boardButtons[i+2].getText())!=null)
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i+1].getText()=="<"&&String.valueOf(boardButtons[i+2].getText())!=null)
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;

                            }

                        }
                    }
                    else if(boardButtons[i+2].getText()==""&&boardButtons[i+14].getText()!="")
                    {
                        if(boardButtons[i+7].getText()==">"&&String.valueOf(boardButtons[i+14].getText())!=null)
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i+7].getText()=="<"&&String.valueOf(boardButtons[i+14].getText())!=null)
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;

                            }

                        }

                    }
                    else if(boardButtons[i+2].getText()!=""&&boardButtons[i+14].getText()!="")
                    {
                        if(boardButtons[i+1].getText()==">"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i+1].getText()=="<"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i+1].getText()=="<"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i+1].getText()==">"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }

                    }
                }
                //rest of first and second row
                else if(boardButtons[i]==boardButtons[2]||boardButtons[i]==boardButtons[4]||boardButtons[i]==boardButtons[10])
                {
                    if(boardButtons[i-2].getText()==""&&boardButtons[i+2].getText()==""&&boardButtons[i+14].getText()=="")
                    {
                        alert.setText("");
                        return true;
                    }
                    else if(boardButtons[i-2].getText()!=""&&boardButtons[i+2].getText()==""&&boardButtons[i+14].getText()=="")
                    {
                        if(boardButtons[i-1].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value))< Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }

                        }
                        else if(boardButtons[i-1].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }
                        }

                    }
                    else if(boardButtons[i-2].getText()==""&&boardButtons[i+2].getText()!=""&&boardButtons[i+14].getText()=="")
                    {
                        if(boardButtons[i+1].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value))> Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }

                        }
                        else if(boardButtons[i+1].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }
                        }

                    }
                    else if(boardButtons[i-2].getText()==""&&boardButtons[i+2].getText()==""&&boardButtons[i+14].getText()!="")
                    {
                        if(boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value))> Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }

                        }
                        else if(boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }
                        }

                    }
                    else if(boardButtons[i-2].getText()!=""&&boardButtons[i+2].getText()!=""&&boardButtons[i+14].getText()=="")
                    {

                    }
                    else if(boardButtons[i-2].getText()==""&&boardButtons[i+2].getText()!=""&&boardButtons[i+14].getText()!="")
                    {

                    }
                    else if(boardButtons[i-2].getText()!=""&&boardButtons[i+2].getText()==""&&boardButtons[i+14].getText()!="")
                    {

                    }
                    else if(boardButtons[i-2].getText()!=""&&boardButtons[i+2].getText()!=""&&boardButtons[i+14].getText()!="")
                    {

                    }
                }
                //last button on first row (7 and 13)
                else if(boardButtons[i]==boardButtons[6]||boardButtons[i]==boardButtons[12])
                {
                    if(boardButtons[i-2].getText()==""&&boardButtons[i+14].getText()=="")
                    {
                        alert.setText("");
                        return true;
                    }
                    else if(boardButtons[i-2].getText()!=""&&boardButtons[i+14].getText()=="")
                    {
                        if(boardButtons[i-1].getText()==">"&&String.valueOf(boardButtons[i-2].getText())!=null)
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()=="<"&&String.valueOf(boardButtons[i-2].getText())!=null)
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                    }
                    else if(boardButtons[i-2].getText()==""&&boardButtons[i+14].getText()!="")
                    {
                        if(boardButtons[i+7].getText()==">"&&String.valueOf(boardButtons[i+14].getText())!=null)
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i+7].getText()=="<"&&String.valueOf(boardButtons[i+14].getText())!=null)
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }

                    }
                    else if(boardButtons[i-2].getText()!=""&&boardButtons[i+14].getText()!="")
                    {
                        if(boardButtons[i-1].getText()==">"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-1].getText()=="<"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()==">"&&boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }

                    }
                }


                //two leftmost columns
                else if(boardButtons[i]==boardButtons[14]||boardButtons[i]==boardButtons[28]||boardButtons[i]==boardButtons[22])
                {
                    if(boardButtons[i-14].getText()==""&&boardButtons[i+2].getText()==""&&boardButtons[i+14].getText()=="")
                    {
                        alert.setText("");
                        return true;
                    }
                    else if(boardButtons[i-14].getText()!=""&&boardButtons[i+2].getText()==""&&boardButtons[i+14].getText()=="")
                    {
                        if(boardButtons[i-7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value))< Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }

                        }
                        else if(boardButtons[i-7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }
                        }

                    }
                    else if(boardButtons[i-14].getText()==""&&boardButtons[i+2].getText()!=""&&boardButtons[i+14].getText()=="")
                    {
                        if(boardButtons[i+1].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value))>Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }

                        }
                        else if(boardButtons[i+1].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }
                        }

                    }
                    else if(boardButtons[i-14].getText()==""&&boardButtons[i+2].getText()==""&&boardButtons[i+14].getText()!="")
                    {
                        if(boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value))> Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }

                        }
                        else if(boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }
                        }

                    }
                    else if(boardButtons[i-14].getText()!=""&&boardButtons[i+2].getText()!=""&&boardButtons[i+14].getText()=="")
                    {

                    }
                    else if(boardButtons[i-14].getText()!=""&&boardButtons[i+2].getText()==""&&boardButtons[i+14].getText()!="")
                    {

                    }
                    else if(boardButtons[i-14].getText()==""&&boardButtons[i+2].getText()!=""&&boardButtons[i+14].getText()!="")
                    {

                    }
                    else if(boardButtons[i-14].getText()!=""&&boardButtons[i+2].getText()!=""&&boardButtons[i+14].getText()!="")
                    {

                    }
                }

                //two rightmost columns
                else if(boardButtons[i]==boardButtons[20]||boardButtons[i]==boardButtons[26]||boardButtons[i]==boardButtons[34])
                {
                    if(boardButtons[i-14].getText()==""&&boardButtons[i-2].getText()==""&&boardButtons[i+14].getText()=="")
                    {
                        alert.setText("");
                        return true;
                    }
                    else if(boardButtons[i-14].getText()!=""&&boardButtons[i-2].getText()==""&&boardButtons[i+14].getText()=="")
                    {
                        if(boardButtons[i-7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value))< Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }

                        }
                        else if(boardButtons[i-7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }
                        }

                    }
                    else if(boardButtons[i-14].getText()==""&&boardButtons[i-2].getText()!=""&&boardButtons[i+14].getText()=="")
                    {
                        if(boardButtons[i-1].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value))< Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) >  Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }

                        }
                        else if(boardButtons[i-1].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }
                        }

                    }
                    else if(boardButtons[i-14].getText()==""&&boardButtons[i-2].getText()==""&&boardButtons[i+14].getText()!="")
                    {
                        if(boardButtons[i+7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value))> Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }

                        }
                        else if(boardButtons[i+7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+14].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }
                        }

                    }
                    else if(boardButtons[i-14].getText()!=""&&boardButtons[i-2].getText()!=""&&boardButtons[i+14].getText()=="")
                    {

                    }
                    else if(boardButtons[i-14].getText()==""&&boardButtons[i-2].getText()!=""&&boardButtons[i+14].getText()!="")
                    {

                    }
                    else if(boardButtons[i-14].getText()!=""&&boardButtons[i+2].getText()==""&&boardButtons[i+14].getText()!="")
                    {

                    }
                    else if(boardButtons[i-14].getText()==""&&boardButtons[i-2].getText()==""&&boardButtons[i+14].getText()=="")
                    {

                    }
                }
                //37 and 43 bottom left  corner buttons
                else if(boardButtons[i]==boardButtons[42]||boardButtons[i]==boardButtons[36])
                {
                    if(boardButtons[i-14].getText()==""&&boardButtons[i+2].getText()=="")
                    {
                        alert.setText("");
                        return true;
                    }
                    else if(boardButtons[i-14].getText()!=""&&boardButtons[i+2].getText()=="")
                    {
                        if(boardButtons[i-7].getText()==">"&&String.valueOf(boardButtons[i-14].getText())!=null)
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-7].getText()=="<"&&String.valueOf(boardButtons[i-14].getText())!=null)
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                    }
                    else if(boardButtons[i-14].getText()==""&&boardButtons[i+2].getText()!="")
                    {
                        if(boardButtons[i+1].getText()==">"&&String.valueOf(boardButtons[i+2].getText())!=null)
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()=="<"&&String.valueOf(boardButtons[i+2].getText())!=null)
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }

                    }
                    else if(boardButtons[i-14].getText()!=""&&boardButtons[i+2].getText()!="")
                    {
                        if(boardButtons[i-7].getText()==">"&&boardButtons[i+1].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-7].getText()=="<"&&boardButtons[i+1].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-7].getText()=="<"&&boardButtons[i+1].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-7].getText()==">"&&boardButtons[i+1].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }

                    }
                }

                //41 and 49 bottom right corner
                else if(boardButtons[i]==boardButtons[40]||boardButtons[i]==boardButtons[48])
                {
                    if(boardButtons[i-2].getText()==""&&boardButtons[i-14].getText()=="")
                    {
                        alert.setText("");
                        return true;
                    }
                    else if(boardButtons[i-2].getText()!=""&&boardButtons[i-14].getText()=="")
                    {
                        if(boardButtons[i-1].getText()==">"&&String.valueOf(boardButtons[i-2].getText())!=null)
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()=="<"&&String.valueOf(boardButtons[i-2].getText())!=null)
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                    }
                    else if(boardButtons[i-2].getText()==""&&boardButtons[i-14].getText()!="")
                    {
                        if(boardButtons[i-7].getText()==">"&&String.valueOf(boardButtons[i-14].getText())!=null)
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()=="<"&&String.valueOf(boardButtons[i-14].getText())!=null)
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }

                    }
                    else if(boardButtons[i-2].getText()!=""&&boardButtons[i-14].getText()!="")
                    {
                        if(boardButtons[i-1].getText()==">"&&boardButtons[i-7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()=="<"&&boardButtons[i-7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }
                        else if(boardButtons[i-1].getText()=="<"&&boardButtons[i-7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }
                        }
                        else if(boardButtons[i-1].getText()==">"&&boardButtons[i-7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText()))&&Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else
                            {
                                alert.setText("Can't place that number there");
                                return false;

                            }

                        }

                    }
                }

                //rest of last two rows
                else if(boardButtons[i]==boardButtons[38]||boardButtons[i]==boardButtons[44]||boardButtons[i]==boardButtons[46])
                {
                    if(boardButtons[i-14].getText()==""&&boardButtons[i+2].getText()==""&&boardButtons[i-2].getText()=="")
                    {
                        alert.setText("");
                        return true;
                    }
                    else if(boardButtons[i-14].getText()!=""&&boardButtons[i+2].getText()==""&&boardButtons[i-2].getText()=="")
                    {
                        if(boardButtons[i-7].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value))< Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }

                        }
                        else if(boardButtons[i-7].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-14].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }
                        }

                    }
                    else if(boardButtons[i-14].getText()==""&&boardButtons[i+2].getText()!=""&&boardButtons[i-2].getText()=="")
                    {
                        if(boardButtons[i+1].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value))> Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value))< Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }

                        }
                        else if(boardButtons[i+1].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }
                        }

                    }
                    else if(boardButtons[i-14].getText()==""&&boardButtons[i+2].getText()==""&&boardButtons[i-2].getText()!="")
                    {
                        if(boardButtons[i-1].getText()==">")
                        {
                            if(Integer.parseInt(String.valueOf(value))< Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }

                        }
                        else if(boardButtons[i-1].getText()=="<")
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("");
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i-2].getText())))
                            {
                                alert.setText("Can't place that number there");
                                return false;
                            }
                        }

                    }
                    else if(boardButtons[i-14].getText()!=""&&boardButtons[i+2].getText()!=""&&boardButtons[i-2].getText()=="")
                    {

                    }
                    else if(boardButtons[i-14].getText()==""&&boardButtons[i+2].getText()!=""&&boardButtons[i-2].getText()!="")
                    {

                    }
                    else if(boardButtons[i-14].getText()!=""&&boardButtons[i+2].getText()==""&&boardButtons[i-2].getText()!="")
                    {

                    }
                    else if(boardButtons[i-14].getText()!=""&&boardButtons[i+2].getText()!=""&&boardButtons[i-2].getText()!="")
                    {

                    }
                }

                //inner buttons ///todo:innerbuttons
                else
                {
                    if(boardButtons[i-14].getText()==""&&boardButtons[i+2].getText()==""&&boardButtons[i-2].getText()==""&&boardButtons[i+14].getText()=="")
                    {
                        return true;
                    }

                }





            }
        }
        return false;

    }

}


