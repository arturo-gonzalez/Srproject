package com.arigon.srproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by art on 11/18/2016.
 */
public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.menu);

    }

    public void click(View v)
    {

        //go to the 2 player board when button is clicked
        if(v.getId() == R.id.two)
        {
            Intent i = new Intent(menu.this, twoplayer.class);
            startActivity(i);

        }
        //go to the ones and zeros  game when button is clicked
        if(v.getId() == R.id.oneszeros)
        {
            Intent i = new Intent(menu.this, oneszeros.class);
            startActivity(i);

        }

        //go to the single player game when button is clicked
        if(v.getId() == R.id.single)
        {
            Intent i = new Intent(menu.this, singleplayer2.class);
            startActivity(i);

        }

        //go to the test game when button is clicked
        if(v.getId() == R.id.test)
        {
            Intent i = new Intent(menu.this, MainActivity.class);
            startActivity(i);

        }

        //go to the two player var  game when button is clicked
        if(v.getId() == R.id.tpvar)
        {
            Intent i = new Intent(menu.this, TwoPlayerVar.class);
            startActivity(i);

        }
        //go to the two player var2  game when button is clicked
        if(v.getId() == R.id.tpvar2)
        {
            Intent i = new Intent(menu.this, TwoPlayerVar2.class);
            startActivity(i);

        }
    }
}
