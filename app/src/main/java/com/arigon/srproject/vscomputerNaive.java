package com.arigon.srproject;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import static com.arigon.srproject.R.layout.twoplayervs;


/**
 * Created by art on 5/03/2017.
 * This is a naive heuristic ai
 */

public class vscomputerNaive extends AppCompatActivity {

    public int lsize = 7;
    public  int wsize = 7;

    boolean clicked = false;
    String value;
    Button currButton;
    check2 c = new check2();
    //players turn
    int turn = 1;
    boolean gameover= false;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(twoplayervs);
        final TextView alert=(TextView) findViewById(R.id.textView1);//textview that shows message

        //value from menu
        Bundle bundle=getIntent().getExtras();
        final Integer number=bundle.getInt("num");
        alert.setText(number.toString());
        lsize=number;
        wsize=number;


        //preparation of the checkerboard
        final SquareButton[][] boardButtons = new SquareButton[lsize][wsize];

        //exit button
        Button exit = (Button) findViewById(R.id.exitButton);
        exit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v)
            {
                if(v.getId() == R.id.exitButton)
                {
                    Intent i = new Intent(vscomputerNaive.this, menu.class);
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
                if ((wsize%2 == 1) && (wsize * i + j) % 2 == 0
                        || (wsize%2 == 0)&&(wsize*i + j + i%2) % 2 == 0) {
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

        //create a list of numbers to check for avaialbe numbers
        final List<Button> availableButtons = new LinkedList<>(Arrays.asList(numberButtons));
        //final List<Button> availableButtons  = Arrays.asList(numberButtons);



        //setting up click listeners and text for the gameboard
        for(int i = 0; i < boardButtons.length; i++) {
            for (int j = 0; j < boardButtons[i].length; j++) {
                SquareButton b = boardButtons[i][j];
                //if(i % 2 == 0){ changed because it was only placing signs on odd rows
                if ((i % 2 == 0 && j%2==0)||(i % 2 == 1 && j%2==1)) {
                    b.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View v) {
                            SquareButton button = (SquareButton) v;
                            if (clicked&&button.getText().length() == 0 && c.checkIfValid(button, boardButtons, value)) {
                                button.setText(value);
                                clicked = false;
                                currButton.setEnabled(false);
                                changeColor(button);
                                checkForWin(turn, number, boardButtons, numberButtons, availableButtons);
                                turn=2;
                                alert.setText(Integer.toString(availableButtons.size()));
                                if(gameover == false)
                                {
                                    naiveAI2(number, boardButtons, numberButtons);
                                    checkForWin(turn, number, boardButtons, numberButtons, availableButtons);
                                    turn = 1;
                                }

                            }
                            else
                                alert.setText("Not a valid move");
                        }

                    });
                } else {
                    b.setText(randomSign());
                }

            }
        }

        //setting up click listeners and text for the numberboard
        for(int i = 0; i < numberButtons.length; i++)
        {
            Button b = numberButtons[i];
            b.setText(String.valueOf(i+1));

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

    ///////////////////////////////////////////////////////////////////
    //randomString generates a random < or >
    ///////////////////////////////////////////////////////////////////
    public String randomSign(){
        String v;
        int x = (int) (Math.random() * 2);
        if(x == 1)
            v = ">";
        else
            v = "<";

        return v;
    }

    //////////////////////////////////////////////////////////////////
    //Change button color when players click it
    //////////////////////////////////////////////////////////////////
    void changeColor(Button btn)
    {
        btn.setBackgroundColor(0xffff6347);
    }

    ////////////////////////////////////////////////////////////////
    //check if there are four squares of the same color in a row
    //check if board is full
    //check if one player has no moves left
    ////////////////////////////////////////////////////////////////
    public void checkForWin(int turn, int number, SquareButton[][] boardButtons, Button[] numberButtons,  List<Button> availableButtons)
    {
        checkAvailableNumbers(numberButtons,availableButtons);
        lsize=number;
        wsize=number;
        boolean full = true;
        boolean valid = true;
        String message = "";
        if(turn==1)
        {
            message = "Red Wins";
        }
        else if (turn == 2)
        {
            message = "Blue Wins";
        }

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
        //check if a move is possible on any boardButton, set valid to false if so
        for(int i = 0; i < boardButtons.length; i++)
        {
            for(int j = 0; j < boardButtons[i].length; j++) {
                SquareButton b = boardButtons[i][j];
                if(b.getText().toString() == "")
                {
                    if(c.checkAvailable2(b, boardButtons, availableButtons))
                    {
                        valid = false;
                    }
                }

            }

        }
        if(valid)
        {

            AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
            myAlert.setMessage(message)
                    .setPositiveButton("OK",new DialogInterface.OnClickListener(){
                        @Override
                        public void onClick(DialogInterface dialog, int which)
                        {
                            dialog.dismiss();
                            Intent i = new Intent(vscomputerNaive.this, menu.class);
                            startActivity(i);
                        }
                    })
                    .create();
            myAlert.show();
            gameover = true;

        }

    }

    //cretes a list of available buttons (buttons that are still enabled)
    List<Button> checkAvailableNumbers(Button[] numberButtons, List<Button> availableButtons)
    {
        availableButtons.clear();//clear the list
        for(int i = 0; i<numberButtons.length;i++)
        {
            if(numberButtons[i].isEnabled())
            {
                availableButtons.add(numberButtons[i]);//add available numbers to the list
            }
        }
        return availableButtons;
    }

    //test
    public void naiveAI(int number, SquareButton[][] boardButtons,  List<Button> availableButtons)
    {
        int availablespots = 0;
        boolean broke = false;
        for(int i = 0; i<number;i++)
        {
            for(int j = 0; j<number;j++)
            {
                availablespots++;
                for(int k = 0;k<availableButtons.size();k++)
                {
                    if(c.checkIfValid(boardButtons[i][j], boardButtons, availableButtons.get(k).getText().toString())&&((i % 2 == 0 && j%2==0)||(i % 2 == 1 && j%2==1)))
                    {
                        boardButtons[i][j].setText(availableButtons.get(k).getText());
                        availablespots--;
                        if(availablespots%2 == 0)
                        {
                            boardButtons[i][j].setText("");
                            availablespots++;

                        }
                        else if(availablespots%2==1)
                        {
                            availableButtons.remove(k);
                            broke=true;
                            break;
                        }
                    }
                }
                if (broke)
                    break;
            }
            if (broke)
                break;
        }

    }

    public void naiveAI2(int number, SquareButton[][] boardButtons, Button[] numberButtons)
    {
        //get random numbers
        Random rand = new Random();

        int  l = rand.nextInt(number) + 1;
        int w = rand.nextInt(number) + 1;

        int num = (number*number/2)+1;
        int n = rand.nextInt(num) +1;

        SquareButton button = boardButtons[l-1][w-1];
        //place random number on random available square
        if (boardButtons[l-1][w-1].getText().toString().trim().length() == 0 && c.checkIfValid(button, boardButtons, String.valueOf(n)) && numberButtons[n-1].isEnabled())
        {
            button.setText(String.valueOf(n));
            button.setBackgroundColor(0xff1e90ff);
            numberButtons[n-1].setEnabled(false);
            numberButtons[n-1].setBackgroundColor(Color.WHITE);
        }
        else
            naiveAI2(number, boardButtons, numberButtons);

    }


}
