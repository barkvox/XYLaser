package com.example.joshu.xylaser;


import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Button;

public class cut extends AppCompatActivity {
    //Declare all of the GUI variables
    ImageButton button_N;
    ImageButton button_S;
    ImageButton button_E;
    ImageButton button_W;
    ImageButton button_stop;
    TextView text_name;
    TextView text_currentstate;
    Button n_constraint;
    Button s_constraint;
    Button e_constraint;
    Button w_constraint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cut);
        configButtons();
        configText();
    } // onCreate
    // Start up functions
    public void configText(){
        text_name = (TextView) findViewById(R.id.text_name);
        text_currentstate = (TextView) findViewById(R.id.text_currentStatus);
    }
    public void configButtons(){
        button_N = (ImageButton) findViewById(R.id.button_north);
        button_S = (ImageButton) findViewById(R.id.button_south);
        button_E = (ImageButton) findViewById(R.id.button_east);
        button_W = (ImageButton) findViewById(R.id.button_west);
        button_stop = (ImageButton) findViewById(R.id.button_stop);
        n_constraint = (Button) findViewById(R.id.constraint_n);
        s_constraint = (Button) findViewById(R.id.constraint_s);
        e_constraint = (Button) findViewById(R.id.constraint_e);
        w_constraint = (Button) findViewById(R.id.constraint_w);


    } // configButtons



} // XYlaser class
