package com.arigon.srproject;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;

/**
 * Created by art on 11/18/2016.
 */
public class menu extends AppCompatActivity {

    private Integer m_Text;
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
            AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
            // Set up the input
            final EditText input = new EditText(this);
            // Specify the type of input expected; this, for example, sets the input as a password, and will mask the text
            input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
            myAlert.setView(input);
            myAlert.setMessage("Choose board size")
                    .setPositiveButton("OK",new DialogInterface.OnClickListener(){
                        @Override
                        public void onClick(DialogInterface dialog, int which)
                        {
                            m_Text = Integer.valueOf(input.getText().toString());
                            dialog.dismiss();
                            Intent i = new Intent(menu.this, TwoPlayerVar2.class);
                            i.putExtra("num", m_Text);
                            startActivity(i);
                        }
                    })
                    .create();
            myAlert.show();


        }

        //go to the single player game when button is clicked
        if(v.getId() == R.id.ai)
        {

            Intent i = new Intent(menu.this, vscomputer.class);
            startActivity(i);

        }
    }
}
