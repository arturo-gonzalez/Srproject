package com.arigon.srproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by art on 11/18/2016.
 */
public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

    }

    public void click(View v)
    {

        //go to the 7x7 board when button is clicked
        if(v.getId() == R.id.seven)
        {
            Intent i = new Intent(menu.this, board7.class);
            startActivity(i);

        }

        //go to the single player game when button is clicked
        if(v.getId() == R.id.single)
        {
            Intent i = new Intent(menu.this, singleplayer.class);
            startActivity(i);

        }
    }
}
