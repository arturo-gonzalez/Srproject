package com.arigon.srproject;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

/**
 * Created by art on 3/15/2017.
 */

public class TwoPlayerVar2 extends AppCompatActivity {

    public static int lsize = 9;
    public static  int wsize = 9;
    //preparation of the checkerboard
    SquareButton[][] boardButtons = new SquareButton[lsize][wsize];
    boolean clicked = false;
    String value;
    Button currButton;
    check2 c = new check2();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twoplayervs);
        final TextView alert=(TextView) findViewById(R.id.textView1);//textview that shows message

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
                } else {
                    b.setBackgroundColor(ContextCompat.getColor(this, R.color.dark));
                }
                row.addView(b);
                boardButtons[i][j] = b;
            }
            row.setWeightSum(wsize);
            gameboard.addView(row, TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.WRAP_CONTENT);
        }

        //preparation of the number board
        TableLayout numberboard = (TableLayout) findViewById(R.id.numberboard);
        int numberRange = lsize*wsize/2;
        int rowRange = (int) Math.ceil(numberRange/4);
        Button[] numberButtons = new Button[numberRange];
        for(int i = 0; i < 4; i++){
            TableRow numrow = new TableRow(this);

            for(int j = 0; j < rowRange; j++){
                Button b = new Button(this);
                b.setLayoutParams(bparams);
                if (i % 2 == j % 2){
                    b.setBackgroundColor(ContextCompat.getColor(this, R.color.grey));
                } else {
                    b.setBackgroundColor(Color.BLUE);
                }
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
                //if(i % 2 == 0){ changed because it was only placing signs on odd rows
                if ((i % 2 == 0 && j%2==0)||(i % 2 == 1 && j%2==1)) {
                    b.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View v) {
                            SquareButton button = (SquareButton) v;
                            if (clicked&&button.getText().length() == 0&&c.checkIfValid(button, boardButtons, value)) {
                                button.setText(value);
                                clicked = false;
                                currButton.setEnabled(false);
                            }
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
            b.setText(String.valueOf(i));

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


}
