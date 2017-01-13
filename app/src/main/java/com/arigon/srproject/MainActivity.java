package com.arigon.srproject;


import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    TextView textView1;
    boolean clicked = false;
    String value;
    Button currButton;

    Button[] boardButtons = new Button[64];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get random numbers
        int[] randNum = new int[32];

        for(int i = 0; i<32; i++)
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
        Button button26 = (Button) findViewById(R.id.button26);
        button26.setText(String.valueOf(randNum[25]));
        button26.setOnClickListener(new View.OnClickListener() {

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
        Button button27 = (Button) findViewById(R.id.button27);
        button27.setText(String.valueOf(randNum[26]));
        button27.setOnClickListener(new View.OnClickListener() {

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
        Button button28 = (Button) findViewById(R.id.button28);
        button28.setText(String.valueOf(randNum[27]));
        button28.setOnClickListener(new View.OnClickListener() {

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
        Button button29 = (Button) findViewById(R.id.button29);
        button29.setText(String.valueOf(randNum[28]));
        button29.setOnClickListener(new View.OnClickListener() {

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
        Button button30 = (Button) findViewById(R.id.button30);
        button30.setText(String.valueOf(randNum[29]));
        button30.setOnClickListener(new View.OnClickListener() {

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
        Button button31 = (Button) findViewById(R.id.button31);
        button31.setText(String.valueOf(randNum[30]));
        button31.setOnClickListener(new View.OnClickListener() {

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
        Button button32 = (Button) findViewById(R.id.button32);
        button32.setText(String.valueOf(randNum[31]));
        button32.setOnClickListener(new View.OnClickListener() {

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
        //btn8.setText(randomSign());
        boardButtons[7] = btn8;
        Button btn9 = (Button) findViewById(R.id.btn9);
        btn9.setText(randomSign());
        boardButtons[8] = btn9;
        Button btn11 = (Button) findViewById(R.id.btn11);
        btn11.setText(randomSign());
        boardButtons[10] = btn11;
        Button btn13 = (Button) findViewById(R.id.btn13);
        btn13.setText(randomSign());
        boardButtons[12] = btn13;
        Button btn15 = (Button) findViewById(R.id.btn15);
        btn15.setText(randomSign());
        boardButtons[14] = btn15;
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
        boardButtons[23] = btn22;
        Button btn25 = (Button) findViewById(R.id.btn25);
        btn25.setText(randomSign());
        boardButtons[24] = btn25;
        Button btn27 = (Button) findViewById(R.id.btn27);
        btn27.setText(randomSign());
        boardButtons[26] = btn27;
        Button btn29 = (Button) findViewById(R.id.btn29);
        btn29.setText(randomSign());
        boardButtons[28] = btn29;
        Button btn31 = (Button) findViewById(R.id.btn31);
        btn31.setText(randomSign());
        boardButtons[30] = btn31;
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
        Button btn41 = (Button) findViewById(R.id.btn41);
        btn41.setText(randomSign());
        boardButtons[40] = btn41;
        Button btn43 = (Button) findViewById(R.id.btn43);
        btn43.setText(randomSign());
        boardButtons[42] = btn43;
        Button btn45 = (Button) findViewById(R.id.btn45);
        btn45.setText(randomSign());
        boardButtons[44] = btn45;
        Button btn47 = (Button) findViewById(R.id.btn47);
        btn47.setText(randomSign());
        boardButtons[46] = btn47;
        Button btn50 = (Button) findViewById(R.id.btn50);
        btn50.setText(randomSign());
        boardButtons[49] = btn50;
        Button btn52 = (Button) findViewById(R.id.btn52);
        btn52.setText(randomSign());
        boardButtons[51] = btn52;
        Button btn54 = (Button) findViewById(R.id.btn54);
        btn54.setText(randomSign());
        boardButtons[53] = btn54;
        Button btn56 = (Button) findViewById(R.id.btn56);
        btn56.setText(randomSign());
        boardButtons[55] = btn56;
        Button btn57 = (Button) findViewById(R.id.btn57);
        //btn57.setText(randomSign());
        boardButtons[56] = btn57;
        Button btn59 = (Button) findViewById(R.id.btn59);
        btn59.setText(randomSign());
        boardButtons[58] = btn59;
        Button btn61 = (Button) findViewById(R.id.btn61);
        btn61.setText(randomSign());
        boardButtons[60] = btn61;
        Button btn63 = (Button) findViewById(R.id.btn63);
        btn63.setText(randomSign());
        boardButtons[62] = btn63;



        //board buttons
        Button btn1 = (Button) findViewById(R.id.btn1);
        boardButtons[0] = btn1;
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn=(Button) v;
                if(clicked&&btn.getText().length() == 0&&checkIfValid(btn))
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
                if(clicked&&btn.getText().length() == 0)
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
                if(clicked&&btn.getText().length() == 0)
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
                if(clicked&&btn.getText().length() == 0)
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

    public Boolean checkIfValid(Button button)
    {
        for(int i = 0; i<64; i++)
        {
            if(boardButtons[i] == button)
            {
                //top left square
                if(boardButtons[i]==boardButtons[0])
                {
                    if(boardButtons[i+2].getText()==""&&boardButtons[i+16].getText()=="")
                    {
                        return true;
                    }
                    else
                    {
                        if(boardButtons[i+1].getText()==">"&&String.valueOf(boardButtons[i+2].getText())!=null)
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                return false;

                            }
                        }
                        else
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                return false;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                return true;

                            }

                        }
                    }
                }
                //rest of top row
                if(boardButtons[i]==boardButtons[2]||boardButtons[i]==boardButtons[4])
                {
                    if(boardButtons[i-2].getText()==""&&boardButtons[i+2].getText()==""&&boardButtons[i+16].getText()=="")
                    {
                        return true;
                    }
                    else if(boardButtons[i-2].getText()!=""&&boardButtons[i+2].getText()==""&&boardButtons[i+16].getText()=="")
                    {

                    }
                    else if(boardButtons[i-2].getText()!=""&&boardButtons[i+2].getText()!=""&&boardButtons[i+16].getText()=="")
                    {

                    }
                    else if(boardButtons[i-2].getText()!=""&&boardButtons[i+2].getText()==""&&boardButtons[i+16].getText()!="")
                    {

                    }
                    else if(boardButtons[i-2].getText()!=""&&boardButtons[i+2].getText()!=""&&boardButtons[i+16].getText()=="")
                    {

                    }
                    else if(boardButtons[i-2].getText()!=""&&boardButtons[i+2].getText()!=""&&boardButtons[i+16].getText()!="")
                    {

                    }
                    else if(boardButtons[i-2].getText()==""&&boardButtons[i+2].getText()!=""&&boardButtons[i+16].getText()!="")
                    {

                    }
                }
                //last on first row
                if(boardButtons[i]==boardButtons[6])
                {
                    if(boardButtons[i-2].getText()==""&&boardButtons[i+2].getText()==""&&boardButtons[i+2].getText()=="")
                    {
                        return true;
                    }
                    else
                    {
                        if(boardButtons[i+1].getText()==">"&&String.valueOf(boardButtons[i+2].getText())!=null)
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                return true;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                return false;

                            }
                        }
                        else
                        {
                            if(Integer.parseInt(String.valueOf(value)) > Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                return false;
                            }
                            else if(Integer.parseInt(String.valueOf(value)) < Integer.parseInt(String.valueOf(boardButtons[i+2].getText())))
                            {
                                return true;

                            }

                        }
                    }
                }


            }
        }
        return false;

    }

}


