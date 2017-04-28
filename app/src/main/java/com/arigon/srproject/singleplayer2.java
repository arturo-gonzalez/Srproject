package com.arigon.srproject;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;


import static com.arigon.srproject.R.layout.twoplayervs;

/**
 * Created by art on 3/17/2017.
 */

public class singleplayer2 extends AppCompatActivity {

    public static int lsize = 7;
    public static  int wsize = 7;
    boolean clicked = false;
    String value;
    Button currButton;
    check2 c = new check2();
    Button[][] removedButtons = new Button[lsize][wsize];//array of removed buttons
    Button[] choiceButtons = new Button[lsize*wsize];//array of possible buttons
    Integer arr[];
    ////////////////////////////////////////
    ///time
    ///////////////////////////////////////
    private TextView timerValue;
    private long startTime = 0L;
    private Handler customHandler = new Handler();
    long timeInMilliseconds = 0L;
    long timeSwapBuff = 0L;
    long updatedTime = 0L;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(twoplayervs);

        ///////////////////////////////////////////
        //timer
        //////////////////////////////////////////
        timerValue = (TextView) findViewById(R.id.textView1);
        startTime = SystemClock.uptimeMillis();
        customHandler.postDelayed(updateTimerThread, 0);

        //value from menu
        Bundle bundle=getIntent().getExtras();
        final Integer number=bundle.getInt("num");
        lsize=number;
        wsize=number;

        //preparation of the checkerboard
        final SquareButton[][] boardButtons = new SquareButton[lsize][wsize];
        final check2 c = new check2();


        //exit button
        Button exit = (Button) findViewById(R.id.exitButton);
        exit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v)
            {
                if(v.getId() == R.id.exitButton)
                {
                    Intent i = new Intent(singleplayer2.this, menu.class);
                    startActivity(i);
                }
            }
        });

        TableLayout gameboard = (TableLayout) findViewById(R.id.gameboard);

        TableRow.LayoutParams bparams = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT);
        bparams.weight = 1.0f;



        for(int i = 0; i < lsize; i++) {

            TableRow row = new TableRow(this);

            for (int j = 0; j < wsize; j++) {
                SquareButton b = new SquareButton(this);
                b.setLayoutParams(bparams);
                b.row = i;
                b.column = j;
                if ((wsize * i + j) % 2 == 0) {
                    b.setBackgroundColor(ContextCompat.getColor(this, R.color.light));
                    b.setTextSize(22);
                } else {
                    b.setBackgroundColor(ContextCompat.getColor(this, R.color.dark));
                    b.setTextSize(22);
                }
                row.addView(b);
                boardButtons[i][j] = b;
            }
            row.setWeightSum(wsize);
            gameboard.addView(row, TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.WRAP_CONTENT);
        }

        //preparation of the number board
        TableLayout numberboard = (TableLayout) findViewById(R.id.numberboard);
        int numberRange = lsize*wsize/2 + 1;
        int rowRange = (int) Math.ceil((double)numberRange/4.0);
        final Button[] numberButtons = new Button[numberRange];
        for(int i = 0; i < 4; i++){
            TableRow numrow = new TableRow(this);

            for(int j = 0; j < rowRange && rowRange*i + j < numberRange; j++){
                Button b = new Button(this);
                b.setLayoutParams(bparams);
                b.setBackgroundColor(ContextCompat.getColor(this, R.color.grey));
                numrow.addView(b);
                numberButtons[rowRange*i + j] = b;
            }
            numrow.setWeightSum(rowRange);
            numberboard.addView(numrow, TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.WRAP_CONTENT);
        }

        //setting up click listeners and text for the gameboard
        for(int i = 0; i < boardButtons.length; i++) {
            for (int j = 0; j < boardButtons[i].length; j++) {
                SquareButton b = boardButtons[i][j];
                if ((i % 2 == 0 && j%2==0)||(i % 2 == 1 && j%2==1))
                {
                    b.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View v) {
                            SquareButton button = (SquareButton) v;
                            //if (clicked  ) {
                           //     choice(numberButtons, button, boardButtons);
                          //  }
                           if (clicked && c.checkIfValid(button, boardButtons, value)) {
                                //button.setText(value);
                                //clicked = false;
                                //currButton.setEnabled(false);
                               choice(numberButtons, button, boardButtons);
                            }
                        }

                    });
                }

            }
        }

        //add numbers
        addNumbers(boardButtons);
        removeNumbers(boardButtons);

        //setting up click listeners and text for the numberboard
        for(int i = 0; i < numberButtons.length; i++)
        {
            Button b = numberButtons[i];
            b.setText(String.valueOf(i+1));
            onBoard(b);
            b.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v){
                    if(clicked)
                    {
                        currButton.setBackgroundColor(Color.GRAY);
                    }
                    v.setBackgroundColor(Color.WHITE);
                    Button button=(Button) v;
                    value = button.getText().toString();
                    clicked = true;
                    currButton = button;
                }

            });

        }



    }


    //add numbers to board
    public void addNumbers(SquareButton[][] boardButtons)
    {

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
            arr = new Integer[((lsize*wsize)/2)+1];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i + 1;
            }
            Collections.shuffle(Arrays.asList(arr));//shuffle array
            int num = 0;
            for(int i =0;i<lsize;i++)
            {
                for(int j = 0; j<wsize; j++)
                {
                    if ((i % 2 == 0 && j%2==0)||(i % 2 == 1 && j%2==1))
                    {
                        boardButtons[i][j].setText(String.valueOf(arr[num]));
                        num++;
                    }
                }
            }
            for(int i =0;i<lsize;i++)
            {
                for(int j = 0; j<wsize; j++)
                {
                    if ((i % 2 == 0 && j%2==1)||(i % 2 == 1 && j%2==0))
                    {
                        //top and bottom rows
                        if ((j - 1< 0)||(j + 2 > wsize)) {
                            if (Integer.parseInt(String.valueOf(boardButtons[i - 1][j].getText())) > Integer.parseInt(String.valueOf(boardButtons[i + 1][j].getText()))) {
                                boardButtons[i][j].setText(">");
                            } else {
                                boardButtons[i][j].setText("<");
                            }
                        }
                        //left and right columms
                        if ((i - 1< 0)||(i + 2 > wsize)) {
                            if (Integer.parseInt(String.valueOf(boardButtons[i][j - 1].getText())) > Integer.parseInt(String.valueOf(boardButtons[i][j + 1].getText()))) {
                                boardButtons[i][j].setText(">");
                            } else {
                                boardButtons[i][j].setText("<");
                            }
                        }
                        //center buttons
                        if ((j - 1>= 0)&&(j + 2 <= wsize)&&(i - 1>= 0)&&(i + 2 <= wsize)) {
                            if (Integer.parseInt(String.valueOf(boardButtons[i][j - 1].getText())) > Integer.parseInt(String.valueOf(boardButtons[i][j + 1].getText())) && Integer.parseInt(String.valueOf(boardButtons[i - 1][j].getText())) > Integer.parseInt(String.valueOf(boardButtons[i + 1][j].getText()))) {
                                boardButtons[i][j].setText(">");
                            }
                            else if (Integer.parseInt(String.valueOf(boardButtons[i][j - 1].getText())) < Integer.parseInt(String.valueOf(boardButtons[i][j + 1].getText())) && Integer.parseInt(String.valueOf(boardButtons[i - 1][j].getText())) < Integer.parseInt(String.valueOf(boardButtons[i + 1][j].getText())))
                            {
                                boardButtons[i][j].setText("<");
                            } else {
                                errors =1;
                            }
                        }
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
    }

    //remove numbers
    public void removeNumbers(SquareButton[][] boardButtons)
    {
        //////////////////////////////////////////////////
        //remove some numbers from board
        /////////////////////////////////////////////////
        for(int i=0; i<lsize; i++)
        {
            for(int j=0; j<wsize;j++)
            {
                if((i % 2 == 0 && j%2==0)||(i % 2 == 1 && j%2==1))//check if it is a light button
                {
                    //add to array of buttons
                    removedButtons[i][j]=boardButtons[i][j];//set selected button to removedButtons array
                    //delete text from some buttons
                    int x = (int) (Math.random() * 2);
                    if(x == 1)
                        boardButtons[i][j].setText("");
                    else
                        boardButtons[i][j].setEnabled(false);
                }            }


        }
    }

    ///////////////////////////////////////////////////////
    //timer
    ////////////////////////////////////////////////////////
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

    /////////////////////////////////////////////
    //if a number is already on the board, disable it
    //////////////////////////////////////////////////////
    public void onBoard(Button btn)
    {
        for(int i = 0; i<lsize; i++)
        {
            for(int j = 0; j<wsize;j++)
            {
                if(removedButtons[i][j]!=null &&removedButtons[i][j].getText()== btn.getText())
                {
                    btn.setBackgroundColor(0xFFA9A9A9);
                    btn.setEnabled(false);
                }
            }

        }
    }

    public void choice(Button[] numberButtons, Button btn, SquareButton[][] boardButtons)
    {
        //if button has a number re-enable button with that number
        for(int i = 0; i<numberButtons.length;i++)
        {
            if(numberButtons[i].getText()==btn.getText())
            {
                numberButtons[i].setBackgroundColor(Color.GRAY);
            }
        }
        btn.setText(value);

        clicked = false;

        win(timerValue.getText(), boardButtons);
    }

    //////////////////////////////////////////
    // check if a player has won
    //display winning message, and time it took to finish
    ////////////////////////////////////////
    public void win(CharSequence timer, SquareButton[][] boardButtons)
    {
        boolean full = true;
        int num = 0;
        int k = 0;

        //check if the board is full
        for(int i=0;i<lsize;i++)
        {
            for(int j = 0; j<wsize;j++)
            {
                if(boardButtons[i][j].getText()=="")
                {
                    full = false;
                }
            }
        }

        /*check if the numbers on the board match the computer generated numbers
        for(int i=0;i<lsize;i++)
        {
            for(int j = 0;j<wsize;j++)
            {
                if((i % 2 == 0 && j%2==0)||(i % 2 == 1 && j%2==1))
                {
                    if(boardButtons[i][j].getText().toString()==arr[k].toString())
                    {
                        num++;
                    }
                    k++;
                }
            }
        }*/

        if(full)
        {
            timeSwapBuff += timeInMilliseconds;
            customHandler.removeCallbacks(updateTimerThread);


            AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
            myAlert.setMessage("Your time was " + timer)
                    .setPositiveButton("OK",new DialogInterface.OnClickListener(){
                        @Override
                        public void onClick(DialogInterface dialog, int which)
                        {
                            dialog.dismiss();
                            Intent i = new Intent(singleplayer2.this, menu.class);
                            startActivity(i);
                        }
                    })
                    .setTitle("You Win!")
                    .create();
            myAlert.show();

            //save score
            //scoreList.add(timer);

        }

    }



}
