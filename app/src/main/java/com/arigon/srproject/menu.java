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

        //go to the single player game when button is clicked
        if(v.getId() == R.id.single)
        {
            Intent i = new Intent(menu.this, singleplayer2.class);
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
