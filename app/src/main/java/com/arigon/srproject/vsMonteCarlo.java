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
import java.lang.Math;

import static com.arigon.srproject.R.layout.twoplayervs;


/**
 * Created by art on 3/15/2017.
 */

public class vsMonteCarlo extends AppCompatActivity {

    //the vertical size of the board
    public int lsize = 7;
    //the horizontal size of the board
    public  int wsize = 7;

    boolean clicked = false;
    String value;
    Button currButton;
    check2 c = new check2();
    //players turn
    int turn = 1;




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
                    Intent i = new Intent(vsMonteCarlo.this, menu.class);
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

        //create a list of numbers to check for available numbers
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
                                checkAvailableNumbers(numberButtons,availableButtons);
                                if(checkForWin(turn, number, boardButtons, availableButtons))
                                {
                                    winMessage();
                                }

                                alert.setText(Integer.toString(availableButtons.size()));
                                if(turn ==1) {
                                    turn = 2;
                                }
                                else if(turn==2)
                                {
                                    turn  = 1;
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
        if(turn ==1) {
            btn.setBackgroundColor(0xffff6347);
        }
        else if(turn==2)
        {
            btn.setBackgroundColor(0xff1e90ff);
        }
    }

    ////////////////////////////////////////////////////////////////
    //check if there are four squares of the same color in a row
    //check if board is full
    //check if one player has no moves left
    ////////////////////////////////////////////////////////////////
    public boolean checkForWin(int turn, int number, SquareButton[][] boardButtons, List<Button> availableButtons)
    {

        lsize=number;
        wsize=number;
        boolean full = true;
        boolean valid = true;

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
        return valid;

    }

    public void winMessage()
    {
        String message = "";
        if(turn==1)
        {
            message = "Red Wins";
        }
        else if (turn == 2)
        {
            message = "Blue Wins";
        }
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage(message)
                .setPositiveButton("OK",new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                        dialog.dismiss();
                        Intent i = new Intent(vsMonteCarlo.this, menu.class);
                        startActivity(i);
                    }
                })
                .create();
        myAlert.show();
    }

    //creates a list of available buttons (buttons that are still enabled)
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

    public void MonteCarlo(int player, int number, SquareButton[][] boardButtons, List<Button> availableButtons)
    {
        int opposingPlayer;
        if(player == 1)
        {
            opposingPlayer = 2;
        }else
        {
            opposingPlayer = 1;
        }
        //create tree from current board, adds root node automatically
        StateTree aiTree = new StateTree(new BoardState(boardButtons, availableButtons), player);

        //create child nodes

        //current working node
        StateTree.StateTreeNode curNode = aiTree.root;
        StateTree.StateTreeNode temporary;

        //loops through each space on the BoardState
        for(int i = 0; i < lsize; i++)
        {
            for(int j = 0; j < wsize; j++)
            {
                //check if the current space is not empty, skips to the next space if is is
                if(curNode.game.curBoard[i][j].getText() != "")
                {
                    continue;
                }

                //loops through the numberboard of the BoardState
                for(int k = 0; k < curNode.game.curNumbers.size(); k++)
                {
                    //check if the number is disabled, skips to the next button if it is
                    if(!curNode.game.curNumbers.get(k).isEnabled())
                    {
                        continue;
                    }

                    //check if the number can be placed in that space
                    if(c.checkIfValid(curNode.game.curBoard[i][j],                   //board space
                            curNode.game.curBoard,                                   //board
                            curNode.game.curNumbers.get(k).getText().toString()))    //number
                    {
                        //create the child by cloning parent board data
                        temporary = new StateTree.StateTreeNode(curNode.game, opposingPlayer);
                        temporary.game.curBoard[i][j].setText(curNode.game.curNumbers.get(k).getText());
                        temporary.game.curNumbers.remove(k);

                        //and add the parent (important for back propagation
                        temporary.parent = curNode;

                        //add child
                        curNode.children.add(temporary);

                    }

                }

            }
        }
        //root node should have all possible children by now

        //Monte Carlo officially starts here

        Double uNumber;
        int uChild;
        double temp;
        double valueBackProp;
        for(int loops = 0; loops < 1000; loops++)
        {
            //reset current node to the root
            curNode = aiTree.root;
            valueBackProp = 0;

            //Use UCB1 to traverse child nodes until leaf node is reached
            while(true) {
                //if there are no children in the current Node, start the rollout
                if (curNode.children.isEmpty()) {
                    break;
                }
                //loop through the list of children
                uNumber = UCB1(curNode.children.get(0));
                uChild = 0;



                for (int n = 1; n < curNode.children.size(); n++) {
                    temp = UCB1(curNode.children.get(n));

                    //when it is the first player's "turn", they want the largest UCB1 value
                    if (curNode.player == player && temp > uNumber) {
                        uNumber = temp;
                        uChild = n;
                    }else if(curNode.player == opposingPlayer && temp < uNumber) //the second player wants the smallest UCB1 value
                    {
                        uNumber = temp;
                        uChild = n;
                    }
                }
                //the one with the largest or smallest UCB1 value becomes the current Node
                curNode = curNode.children.get(uChild);
            }


            //when there are no children (at a leaf node), there is a rollout

            //if this is a terminal node, forget it
            if(!checkForWin(curNode.player,number, curNode.game.curBoard, curNode.game.curNumbers)) {

                //if this isn't the first time "visiting" a node, then actions are generated for the child node before we rollout
                if (curNode.visits > 0) {
                    //this code is exactly like the code needed for the root node
                    for (int i = 0; i < lsize; i++) {
                        for (int j = 0; j < wsize; j++) {
                            //check if the current space is not empty, skips to the next space if is is
                            if (curNode.game.curBoard[i][j].getText() != "") {
                                continue;
                            }

                            //loops through the numberboard of the BoardState
                            for (int k = 0; k < curNode.game.curNumbers.size(); k++) {
                                //check if the number is disabled, skips to the next button if it is
                                if (!curNode.game.curNumbers.get(k).isEnabled()) {
                                    continue;
                                }

                                //check if the number can be placed in that space
                                if (c.checkIfValid(curNode.game.curBoard[i][j],              //board space
                                        curNode.game.curBoard,                              //board
                                        curNode.game.curNumbers.get(k).getText().toString()))   //number
                                {
                                    //create the child by cloning parent board data
                                    if (curNode.player == 1)
                                        temporary = new StateTree.StateTreeNode(curNode.game, 2);
                                    else
                                        temporary = new StateTree.StateTreeNode(curNode.game, 1);

                                    //then apply the move
                                    temporary.game.curBoard[i][j].setText(curNode.game.curNumbers.get(k).getText());
                                    temporary.game.curNumbers.get(k).setEnabled(false);

                                    //and add the parent (important for back propagation
                                    temporary.parent = curNode;

                                    //add child
                                    curNode.children.add(temporary);

                                }

                            }

                        }
                    }

                }

                //now there is a rollout, the AI plays the game with itself using random moves, the end result for the game is back propogated to the beginning
                
            }

            //backpropogation, all the nodes that were visited get a their values updated
            while(curNode.parent != null)
            {
                curNode.visits++;
                curNode.score += valueBackProp;
                curNode = curNode.parent;
            }
            curNode.visits++;
            curNode.score += valueBackProp;
        }


            //run until a condition has been met, in this case it's just 1000 loops
    }

    //tweak UCB1 if necessary
    public double UCB1(StateTree.StateTreeNode node)
    {

        return node.score +                                                 //Exploitation
                2 * Math.sqrt(Math.log(node.parent.visits)/node.visits);    //Exploration
    }


}
