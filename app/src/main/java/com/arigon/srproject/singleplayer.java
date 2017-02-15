
package com.arigon.srproject;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class singleplayer extends AppCompatActivity {
    boolean clicked = false;
    String value;
    Button currButton;
    private TextView alert;
    //players turn
    int turn = 1;

    Button[] boardButtons = new Button[49];//array of board buttons
    Button[] removedButtons = new Button[49];//array of removed buttons
    int[] buttonIDs = new int[]{R.id.btn1,R.id.btn2,R.id.btn3,R.id.btn4,R.id.btn5,R.id.btn6,
            R.id.btn7,R.id.btn8,R.id.btn9,R.id.btn10,R.id.btn11,R.id.btn12,R.id.btn13,
            R.id.btn14,R.id.btn15,R.id.btn16,R.id.btn17,R.id.btn18,R.id.btn19,R.id.btn20,R.id.btn21,
            R.id.btn22,R.id.btn23,R.id.btn24,R.id.btn25,R.id.btn26,R.id.btn27,R.id.btn28,R.id.btn29,
            R.id.btn30,R.id.btn31,R.id.btn32,R.id.btn33,R.id.btn34,R.id.btn35,R.id.btn36,R.id.btn37,
            R.id.btn38,R.id.btn39,R.id.btn40,R.id.btn41,R.id.btn42,R.id.btn43,R.id.btn44,R.id.btn45,
            R.id.btn46,R.id.btn47,R.id.btn48,R.id.btn49};//array of ids


    ////////////////////////////////////////
    ///time
    ///////////////////////////////////////
    private TextView timerValue;
    private long startTime = 0L;
    private Handler customHandler = new Handler();
    long timeInMilliseconds = 0L;
    long timeSwapBuff = 0L;
    long updatedTime = 0L;


    //this function runs when the program starts
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_singleplayer);

        //final TextView
        alert = (TextView) findViewById(R.id.textView1);//textview that shows message


        int[] avnum = new int[25];
        for (int i = 0; i < 25; i++) {
            avnum[i] = i + 1;
        }

        ///////////////////////////////////////////
        //timer
        //////////////////////////////////////////
        timerValue = (TextView) findViewById(R.id.timerValue);
        startTime = SystemClock.uptimeMillis();
        customHandler.postDelayed(updateTimerThread, 0);


        ////////////////////////////////////////////////////////
        //create clickable buttons where numbers will be displayed
        //btn1-btn49 (only buttons taht don't contain < or >
        //add buttons to boardButton array
        //set onClickListener
        //if clicked is true and the button is empty and its checkIfValid is true
        // place number in button
        //  set clicked to false
        //  disable currButton so it can't be clicked anymore
        /////////////////////////////////////////////////////////
        Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn = (Button) v;
                if (clicked && btn.getText().length() == 0) {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                    win();
                }
            }
        });
        Button btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn = (Button) v;
                if (clicked && btn.getText().length() == 0  ) {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }
            }
        });
        Button btn5 = (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn = (Button) v;
                if (clicked && btn.getText().length() == 0) {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }
            }
        });
        Button btn7 = (Button) findViewById(R.id.btn7);
        btn7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn = (Button) v;
                if (clicked && btn.getText().length() == 0 ) {
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
                Button btn = (Button) v;
                if (clicked && btn.getText().length() == 0 ) {
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
                Button btn = (Button) v;
                if (clicked && btn.getText().length() == 0 ) {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }
            }
        });
        Button btn13 = (Button) findViewById(R.id.btn13);
        btn13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn = (Button) v;
                if (clicked && btn.getText().length() == 0 ) {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }
            }
        });
        Button btn15 = (Button) findViewById(R.id.btn15);
        btn15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn = (Button) v;
                if (clicked && btn.getText().length() == 0 ) {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }
            }
        });
        Button btn17 = (Button) findViewById(R.id.btn17);
        btn17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn = (Button) v;
                if (clicked && btn.getText().length() == 0  ) {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }
            }
        });
        Button btn19 = (Button) findViewById(R.id.btn19);
        btn19.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn = (Button) v;
                if (clicked && btn.getText().length() == 0 ) {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }
            }
        });
        Button btn21 = (Button) findViewById(R.id.btn21);
        btn21.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn = (Button) v;
                if (clicked && btn.getText().length() == 0 ) {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }
            }
        });
        Button btn23 = (Button) findViewById(R.id.btn23);
        btn23.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn = (Button) v;
                if (clicked && btn.getText().length() == 0  ) {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }
            }
        });
        Button btn25 = (Button) findViewById(R.id.btn25);
        btn25.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn = (Button) v;
                if (clicked && btn.getText().length() == 0 ) {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }
            }
        });
        Button btn27 = (Button) findViewById(R.id.btn27);
        btn27.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn = (Button) v;
                if (clicked && btn.getText().length() == 0 ) {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }
            }
        });
        Button btn29 = (Button) findViewById(R.id.btn29);
        btn29.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn = (Button) v;
                if (clicked && btn.getText().length() == 0 ) {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }
            }
        });
        Button btn31 = (Button) findViewById(R.id.btn31);
        btn31.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn = (Button) v;
                if (clicked && btn.getText().length() == 0 ) {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }
            }
        });
        Button btn33 = (Button) findViewById(R.id.btn33);
        btn33.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn = (Button) v;
                if (clicked && btn.getText().length() == 0 ) {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }
            }
        });
        Button btn35 = (Button) findViewById(R.id.btn35);
        btn35.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn = (Button) v;
                if (clicked && btn.getText().length() == 0 ) {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }
            }
        });
        Button btn37 = (Button) findViewById(R.id.btn37);
        btn37.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn = (Button) v;
                if (clicked && btn.getText().length() == 0 ) {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }
            }
        });
        Button btn39 = (Button) findViewById(R.id.btn39);
        btn39.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn = (Button) v;
                if (clicked && btn.getText().length() == 0 ) {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }
            }
        });
        Button btn41 = (Button) findViewById(R.id.btn41);
        btn41.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn = (Button) v;
                if (clicked && btn.getText().length() == 0 ) {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }
            }
        });
        Button btn43 = (Button) findViewById(R.id.btn43);
        btn43.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn = (Button) v;
                if (clicked && btn.getText().length() == 0 ) {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }
            }
        });
        Button btn45 = (Button) findViewById(R.id.btn45);
        btn45.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn = (Button) v;
                if (clicked && btn.getText().length() == 0) {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }
            }
        });
        Button btn47 = (Button) findViewById(R.id.btn47);
        btn47.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn = (Button) v;
                if (clicked && btn.getText().length() == 0 ) {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }

            }
        });
        Button btn49 = (Button) findViewById(R.id.btn49);
        btn49.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn = (Button) v;
                if (clicked && btn.getText().length() == 0 ) {
                    btn.setText(value);
                    clicked = false;
                    currButton.setEnabled(false);
                }
            }
        });
        //set numbers into light squares
        boardButtons[0] = btn1;
        boardButtons[2] = btn3;
        boardButtons[4] = btn5;
        boardButtons[6] = btn7;
        boardButtons[8] = btn9;
        boardButtons[10] = btn11;
        boardButtons[12] = btn13;
        boardButtons[14] = btn15;
        boardButtons[16] = btn17;
        boardButtons[18] = btn19;
        boardButtons[20] = btn21;
        boardButtons[22] = btn23;
        boardButtons[24] = btn25;
        boardButtons[26] = btn27;
        boardButtons[28] = btn29;
        boardButtons[30] = btn31;
        boardButtons[32] = btn33;
        boardButtons[34] = btn35;
        boardButtons[36] = btn37;
        boardButtons[38] = btn39;
        boardButtons[40] = btn41;
        boardButtons[42] = btn43;
        boardButtons[44] = btn45;
        boardButtons[46] = btn47;
        boardButtons[48] = btn49;


        ///////////////////////////////////////////////////
        // create buttons for dark squares
        ////////////////////////////////////////////////////
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn4 = (Button) findViewById(R.id.btn4);
        Button btn6 = (Button) findViewById(R.id.btn6);
        Button btn8 = (Button) findViewById(R.id.btn8);
        Button btn10 = (Button) findViewById(R.id.btn10);
        Button btn12 = (Button) findViewById(R.id.btn12);
        Button btn14 = (Button) findViewById(R.id.btn14);
        Button btn16 = (Button) findViewById(R.id.btn16);
        Button btn18 = (Button) findViewById(R.id.btn18);
        Button btn20 = (Button) findViewById(R.id.btn20);
        Button btn22 = (Button) findViewById(R.id.btn22);
        Button btn24 = (Button) findViewById(R.id.btn24);
        Button btn26 = (Button) findViewById(R.id.btn26);
        Button btn28 = (Button) findViewById(R.id.btn28);
        Button btn30 = (Button) findViewById(R.id.btn30);
        Button btn32 = (Button) findViewById(R.id.btn32);
        Button btn34 = (Button) findViewById(R.id.btn34);
        Button btn36 = (Button) findViewById(R.id.btn36);
        Button btn38 = (Button) findViewById(R.id.btn38);
        Button btn40 = (Button) findViewById(R.id.btn40);
        Button btn42 = (Button) findViewById(R.id.btn42);
        Button btn44 = (Button) findViewById(R.id.btn44);
        Button btn46 = (Button) findViewById(R.id.btn46);
        Button btn48 = (Button) findViewById(R.id.btn48);

        //add buttons to the boardButton array
        boardButtons[1] = btn2;
        boardButtons[3] = btn4;
        boardButtons[5] = btn6;
        boardButtons[7] = btn8;
        boardButtons[9] = btn10;
        boardButtons[11] = btn12;
        boardButtons[13] = btn14;
        boardButtons[15] = btn16;
        boardButtons[17] = btn18;
        boardButtons[19] = btn20;
        boardButtons[21] = btn22;
        boardButtons[23] = btn24;
        boardButtons[25] = btn26;
        boardButtons[27] = btn28;
        boardButtons[29] = btn30;
        boardButtons[31] = btn32;
        boardButtons[33] = btn34;
        boardButtons[35] = btn36;
        boardButtons[37] = btn38;
        boardButtons[39] = btn40;
        boardButtons[41] = btn42;
        boardButtons[43] = btn44;
        boardButtons[45] = btn46;
        boardButtons[47] = btn48;

        //boolean variable used in loop to test if a board is acceptable
        boolean acceptable = false;
        int count = 0;
        /////////////////////////////////////////////////
        ////////////////////////////////////////////////
        //loop to test if board is acceptable
        //this is where the board is created
        //numbers are randomly placed on board
        //inequality signs are placed between numbers if accepted
        ////////////////////////////////////////////////
        while (!acceptable) {
            int errors = 0;
            //array to contain random numbers
            Integer[] arr = new Integer[25];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i + 1;
            }
            Collections.shuffle(Arrays.asList(arr));//shuffle array


            //set numbers into light squares
            boardButtons[0].setText(String.valueOf(arr[0]));
            boardButtons[2].setText(String.valueOf(arr[1]));
            boardButtons[4].setText(String.valueOf(arr[2]));
            boardButtons[6].setText(String.valueOf(arr[3]));
            boardButtons[8].setText(String.valueOf(arr[4]));
            boardButtons[10].setText(String.valueOf(arr[5]));
            boardButtons[12].setText(String.valueOf(arr[6]));
            boardButtons[14].setText(String.valueOf(arr[7]));
            boardButtons[16].setText(String.valueOf(arr[8]));
            boardButtons[18].setText(String.valueOf(arr[9]));
            boardButtons[20].setText(String.valueOf(arr[10]));
            boardButtons[22].setText(String.valueOf(arr[11]));
            boardButtons[24].setText(String.valueOf(arr[12]));
            boardButtons[26].setText(String.valueOf(arr[13]));
            boardButtons[28].setText(String.valueOf(arr[14]));
            boardButtons[30].setText(String.valueOf(arr[15]));
            boardButtons[32].setText(String.valueOf(arr[16]));
            boardButtons[34].setText(String.valueOf(arr[17]));
            boardButtons[36].setText(String.valueOf(arr[18]));
            boardButtons[38].setText(String.valueOf(arr[19]));
            boardButtons[40].setText(String.valueOf(arr[20]));
            boardButtons[42].setText(String.valueOf(arr[21]));
            boardButtons[44].setText(String.valueOf(arr[22]));
            boardButtons[46].setText(String.valueOf(arr[23]));
            boardButtons[48].setText(String.valueOf(arr[24]));


            ////////////////////////////////////////////////////////////////////
            //place < and > on the specified buttons on board
            ///////////////////////////////////////////////////////////////////
            for (int i = 0; i < 49; i++)//find the button in the array
            {
                //top and bottom rows
                if (boardButtons[i] == boardButtons[1] || boardButtons[i] == boardButtons[3] || boardButtons[i] == boardButtons[5] || boardButtons[i] == boardButtons[43] || boardButtons[i] == boardButtons[45] || boardButtons[i] == boardButtons[47]) {
                    if (Integer.parseInt(String.valueOf(boardButtons[i - 1].getText())) > Integer.parseInt(String.valueOf(boardButtons[i + 1].getText()))) {
                        boardButtons[i].setText(">");
                    } else {
                        boardButtons[i].setText("<");
                    }
                }
                //left and right columms
                if (boardButtons[i] == boardButtons[7] || boardButtons[i] == boardButtons[13] || boardButtons[i] == boardButtons[21] || boardButtons[i] == boardButtons[27] || boardButtons[i] == boardButtons[35] || boardButtons[i] == boardButtons[41]) {
                    if (Integer.parseInt(String.valueOf(boardButtons[i - 7].getText())) > Integer.parseInt(String.valueOf(boardButtons[i + 7].getText()))) {
                        boardButtons[i].setText(">");
                    } else {
                        boardButtons[i].setText("<");
                    }
                }
                //center buttons
                if (boardButtons[i] == boardButtons[9] || boardButtons[i] == boardButtons[11] || boardButtons[i] == boardButtons[15] || boardButtons[i] == boardButtons[17] || boardButtons[i] == boardButtons[19] || boardButtons[i] == boardButtons[23] || boardButtons[i] == boardButtons[25] || boardButtons[i] == boardButtons[29] || boardButtons[i] == boardButtons[31] || boardButtons[i] == boardButtons[33] || boardButtons[i] == boardButtons[37] || boardButtons[i] == boardButtons[39]) {
                    if (Integer.parseInt(String.valueOf(boardButtons[i - 7].getText())) > Integer.parseInt(String.valueOf(boardButtons[i + 7].getText())) && Integer.parseInt(String.valueOf(boardButtons[i - 1].getText())) > Integer.parseInt(String.valueOf(boardButtons[i + 1].getText()))) {
                        boardButtons[i].setText(">");
                    } else if (Integer.parseInt(String.valueOf(boardButtons[i - 7].getText())) < Integer.parseInt(String.valueOf(boardButtons[i + 7].getText())) && Integer.parseInt(String.valueOf(boardButtons[i - 1].getText())) < Integer.parseInt(String.valueOf(boardButtons[i + 1].getText())))

                    {
                        boardButtons[i].setText("<");
                    } else {
                        errors =1;
                    }
                }

            }
            if(errors ==0)
            {
                acceptable = true;
            }

            //count number of iterations
            count++;
        }
        alert.setText(String.valueOf(count));

        //////////////////////////////////////////////////
        //remove some numbers from board
        /////////////////////////////////////////////////
        for(int i=1; i<50; i++)
        {
            if(i%2 ==1)//check if it is a light button(odd number on board)
            {
                //add to array of buttons
                Button btn = (Button) findViewById(buttonIDs[i-1]);
                removedButtons[i-1]=btn;//set selected button to removedButtons array
                //delete text from some buttons
                int x = (int) (Math.random() * 2);
                if(x == 1)
                    boardButtons[i-1].setText("");



            }
        }

        ///////////////////////////////////////////////////////////////
        //Create buttons that contains numbers for users to choose from
        //button1 - button27
        //set the text to a number from 1-n
        //*note* button number is one more than array index ( button1.text = avnum[0] and so on)
        //change background color to white when clicked
        //set clicked to true(this way we know that a button has been clicked
        //set curButton to clicked button
        ///////////////////////////////////////////////////////////////
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setText(String.valueOf(avnum[0]));
        onBoard(button1);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (clicked) {
                    currButton.setBackgroundColor(Color.GRAY);
                }
                Button button = (Button) v;
                value = button.getText().toString();
                button.setBackgroundColor(Color.WHITE);

                clicked = true;
                currButton = button;

            }
        });
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setText(String.valueOf(avnum[1]));
        onBoard(button2);
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (clicked) {
                    currButton.setBackgroundColor(Color.GRAY);
                }
                Button button = (Button) v;
                value = button.getText().toString();
                button.setBackgroundColor(Color.WHITE);


                clicked = true;
                currButton = button;

            }
        });
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setText(String.valueOf(avnum[2]));
        onBoard(button3);
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (clicked) {
                    currButton.setBackgroundColor(Color.GRAY);
                }
                Button button = (Button) v;
                value = button.getText().toString();
                button.setBackgroundColor(Color.WHITE);


                clicked = true;
                currButton = button;

            }
        });
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setText(String.valueOf(avnum[3]));
        onBoard(button4);
        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (clicked) {
                    currButton.setBackgroundColor(Color.GRAY);
                }
                Button button = (Button) v;
                value = button.getText().toString();
                button.setBackgroundColor(Color.WHITE);


                clicked = true;
                currButton = button;

            }
        });
        Button button5 = (Button) findViewById(R.id.button5);
        button5.setText(String.valueOf(avnum[4]));
        onBoard(button5);
        button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (clicked) {
                    currButton.setBackgroundColor(Color.GRAY);
                }
                Button button = (Button) v;
                value = button.getText().toString();
                button.setBackgroundColor(Color.WHITE);


                clicked = true;
                currButton = button;

            }
        });
        Button button6 = (Button) findViewById(R.id.button6);
        button6.setText(String.valueOf(avnum[5]));
        onBoard(button6);
        button6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (clicked) {
                    currButton.setBackgroundColor(Color.GRAY);
                }
                Button button = (Button) v;
                value = button.getText().toString();
                button.setBackgroundColor(Color.WHITE);


                clicked = true;
                currButton = button;

            }
        });
        Button button7 = (Button) findViewById(R.id.button7);
        button7.setText(String.valueOf(avnum[6]));
        onBoard(button7);
        button7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (clicked) {
                    currButton.setBackgroundColor(Color.GRAY);
                }
                Button button = (Button) v;
                value = button.getText().toString();
                button.setBackgroundColor(Color.WHITE);


                clicked = true;
                currButton = button;

            }
        });
        Button button8 = (Button) findViewById(R.id.button8);
        button8.setText(String.valueOf(avnum[7]));
        onBoard(button8);
        button8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (clicked) {
                    currButton.setBackgroundColor(Color.GRAY);
                }
                Button button = (Button) v;
                value = button.getText().toString();
                button.setBackgroundColor(Color.WHITE);


                clicked = true;
                currButton = button;

            }
        });
        Button button9 = (Button) findViewById(R.id.button9);
        button9.setText(String.valueOf(avnum[8]));
        onBoard(button9);
        button9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (clicked) {
                    currButton.setBackgroundColor(Color.GRAY);
                }
                Button button = (Button) v;
                value = button.getText().toString();
                button.setBackgroundColor(Color.WHITE);

                clicked = true;
                currButton = button;

            }
        });
        Button button10 = (Button) findViewById(R.id.button10);
        button10.setText(String.valueOf(avnum[9]));
        onBoard(button10);
        button10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (clicked) {
                    currButton.setBackgroundColor(Color.GRAY);
                }
                Button button = (Button) v;
                value = button.getText().toString();
                button.setBackgroundColor(Color.WHITE);


                clicked = true;
                currButton = button;

            }
        });
        Button button11 = (Button) findViewById(R.id.button11);
        button11.setText(String.valueOf(avnum[10]));
        onBoard(button11);
        button11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (clicked) {
                    currButton.setBackgroundColor(Color.GRAY);
                }
                Button button = (Button) v;
                value = button.getText().toString();
                button.setBackgroundColor(Color.WHITE);


                clicked = true;
                currButton = button;

            }
        });
        Button button12 = (Button) findViewById(R.id.button12);
        button12.setText(String.valueOf(avnum[11]));
        onBoard(button12);
        button12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (clicked) {
                    currButton.setBackgroundColor(Color.GRAY);
                }
                Button button = (Button) v;
                value = button.getText().toString();
                button.setBackgroundColor(Color.WHITE);


                clicked = true;
                currButton = button;

            }
        });
        Button button13 = (Button) findViewById(R.id.button13);
        button13.setText(String.valueOf(avnum[12]));
        onBoard(button13);
        button13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (clicked) {
                    currButton.setBackgroundColor(Color.GRAY);
                }
                Button button = (Button) v;
                value = button.getText().toString();
                button.setBackgroundColor(Color.WHITE);


                clicked = true;
                currButton = button;

            }
        });
        Button button14 = (Button) findViewById(R.id.button14);
        button14.setText(String.valueOf(avnum[13]));
        onBoard(button14);
        button14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (clicked) {
                    currButton.setBackgroundColor(Color.GRAY);
                }
                Button button = (Button) v;
                value = button.getText().toString();
                button.setBackgroundColor(Color.WHITE);


                clicked = true;
                currButton = button;

            }
        });
        Button button15 = (Button) findViewById(R.id.button15);
        button15.setText(String.valueOf(avnum[14]));
        onBoard(button15);
        button15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (clicked) {
                    currButton.setBackgroundColor(Color.GRAY);
                }
                Button button = (Button) v;
                value = button.getText().toString();
                button.setBackgroundColor(Color.WHITE);


                clicked = true;
                currButton = button;

            }
        });
        Button button16 = (Button) findViewById(R.id.button16);
        button16.setText(String.valueOf(avnum[15]));
        onBoard(button16);
        button16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (clicked) {
                    currButton.setBackgroundColor(Color.GRAY);
                }
                Button button = (Button) v;
                value = button.getText().toString();
                button.setBackgroundColor(Color.WHITE);


                clicked = true;
                currButton = button;

            }
        });
        Button button17 = (Button) findViewById(R.id.button17);
        button17.setText(String.valueOf(avnum[16]));
        onBoard(button17);
        button17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (clicked) {
                    currButton.setBackgroundColor(Color.GRAY);
                }
                Button button = (Button) v;
                value = button.getText().toString();
                button.setBackgroundColor(Color.WHITE);

                clicked = true;
                currButton = button;

            }
        });
        Button button18 = (Button) findViewById(R.id.button18);
        button18.setText(String.valueOf(avnum[17]));
        onBoard(button18);
        button18.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (clicked) {
                    currButton.setBackgroundColor(Color.GRAY);
                }
                Button button = (Button) v;
                value = button.getText().toString();
                button.setBackgroundColor(Color.WHITE);


                clicked = true;
                currButton = button;

            }
        });
        Button button19 = (Button) findViewById(R.id.button19);
        button19.setText(String.valueOf(avnum[18]));
        onBoard(button19);
        button19.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (clicked) {
                    currButton.setBackgroundColor(Color.GRAY);
                }
                Button button = (Button) v;
                value = button.getText().toString();
                button.setBackgroundColor(Color.WHITE);


                clicked = true;
                currButton = button;

            }
        });
        Button button20 = (Button) findViewById(R.id.button20);
        button20.setText(String.valueOf(avnum[19]));
        onBoard(button20);
        button20.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (clicked) {
                    currButton.setBackgroundColor(Color.GRAY);
                }
                Button button = (Button) v;
                value = button.getText().toString();
                button.setBackgroundColor(Color.WHITE);


                clicked = true;
                currButton = button;

            }
        });
        Button button21 = (Button) findViewById(R.id.button21);
        button21.setText(String.valueOf(avnum[20]));
        onBoard(button21);
        button21.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (clicked) {
                    currButton.setBackgroundColor(Color.GRAY);
                }
                Button button = (Button) v;
                value = button.getText().toString();
                button.setBackgroundColor(Color.WHITE);


                clicked = true;
                currButton = button;

            }
        });
        Button button22 = (Button) findViewById(R.id.button22);
        button22.setText(String.valueOf(avnum[21]));
        onBoard(button22);
        button22.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (clicked) {
                    currButton.setBackgroundColor(Color.GRAY);
                }
                Button button = (Button) v;
                value = button.getText().toString();
                button.setBackgroundColor(Color.WHITE);


                clicked = true;
                currButton = button;

            }
        });
        Button button23 = (Button) findViewById(R.id.button23);
        button23.setText(String.valueOf(avnum[22]));
        onBoard(button23);
        button23.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (clicked) {
                    currButton.setBackgroundColor(Color.GRAY);
                }
                Button button = (Button) v;
                value = button.getText().toString();
                button.setBackgroundColor(Color.WHITE);


                clicked = true;
                currButton = button;

            }
        });
        Button button24 = (Button) findViewById(R.id.button24);
        button24.setText(String.valueOf(avnum[23]));
        onBoard(button24);
        button24.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (clicked) {
                    currButton.setBackgroundColor(Color.GRAY);
                }
                Button button = (Button) v;
                value = button.getText().toString();
                button.setBackgroundColor(Color.WHITE);


                clicked = true;
                currButton = button;

            }
        });
        Button button25 = (Button) findViewById(R.id.button25);
        button25.setText(String.valueOf(avnum[24]));
        onBoard(button25);
        button25.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (clicked) {
                    currButton.setBackgroundColor(Color.GRAY);
                }
                Button button = (Button) v;
                value = button.getText().toString();
                button.setBackgroundColor(Color.WHITE);

                clicked = true;
                currButton = button;

            }


        });

        Button button27 = (Button) findViewById(R.id.button27);
        button27.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.button27) {
                    Intent i = new Intent(singleplayer.this, menu.class);
                    startActivity(i);
                }
            }

        });


    }


    private Runnable updateTimerThread = new Runnable() {

        public void run() {

            timeInMilliseconds = SystemClock.uptimeMillis() - startTime;

            updatedTime = timeSwapBuff + timeInMilliseconds;

            int secs = (int) (updatedTime / 1000);
            int mins = secs / 60;
            secs = secs % 60;
            timerValue.setText("" + mins + ":"
                    + String.format("%02d", secs));
            customHandler.postDelayed(this, 0);
        }

    };

    public void onBoard(Button btn)
    {
        for(int i = 0; i<49; i++)
        {
            if(removedButtons[i]!=null &&removedButtons[i].getText()== btn.getText())
            {
                btn.setBackgroundColor(Color.WHITE);
                btn.setEnabled(false);
            }
        }

    }

    public void win()
    {
        boolean full = true;
        for(int i=0;i<49;i++)
        {
            if(boardButtons[i].getText()=="")
            {
                full = false;
            }

        }
        if(full)
        {
            timeSwapBuff += timeInMilliseconds;
            customHandler.removeCallbacks(updateTimerThread);

            alert.setText("You Win");

        }

    }
}



