package com.example.joshu.xylaser;

import android.media.Image;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Button;

public class XYlaser extends AppCompatActivity implements View.OnClickListener {
    //Declare all of the GUI variables
    private ImageButton button_N;
    private ImageButton button_S;
    private ImageButton button_E;
    private ImageButton button_W;
    private ImageButton button_stop;
    private TextView text_name;
    private TextView text_currentstate;
    private TextView text_speed;
    private Button n_constraint;
    private Button s_constraint;
    private Button e_constraint;
    private Button w_constraint;
    private SeekBar speed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xylaser);
        configButtons();
        configText();
        configSpeed();
        readSpeed();
    } // onCreate

    // Start up functions
    public void configSpeed(){
        speed = (SeekBar) findViewById(R.id.speed);
    }

    public void readSpeed(){
        speed.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                text_speed.setText((i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }// ReadSpeed
    public void configText(){
        text_name = (TextView) findViewById(R.id.text_name);
        text_currentstate = (TextView) findViewById(R.id.text_currentStatus);
        text_speed = (TextView) findViewById(R.id.text_speed);

    }
    public void configButtons(){
        button_N = (ImageButton) findViewById(R.id.button_north);
        button_S = (ImageButton) findViewById(R.id.button_south);
        button_E = (ImageButton) findViewById(R.id.button_east);
        button_W = (ImageButton) findViewById(R.id.button_west);
        button_stop = (ImageButton) findViewById(R.id.button_stop);

        button_N.setImageResource(R.drawable.arrow_up_green);
        button_S.setImageResource(R.drawable.arrow_down_green);
        button_E.setImageResource(R.drawable.arrow_right_green);
        button_W.setImageResource(R.drawable.arrow_left_green);
        button_stop.setImageResource(R.drawable.arrow_up_green);

        n_constraint = (Button) findViewById(R.id.constraint_n);
        s_constraint = (Button) findViewById(R.id.constraint_s);
        e_constraint = (Button) findViewById(R.id.constraint_e);
        w_constraint = (Button) findViewById(R.id.constraint_w);

        button_N.setOnClickListener(this);
        button_S.setOnClickListener(this);
        button_E.setOnClickListener(this);
        button_W.setOnClickListener(this);
        button_stop.setOnClickListener(this);

    } // configButtons

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_north:
                configButtons();
                text_currentstate.setText("North");
                button_N.setImageResource(R.drawable.arrow_up_red);
                break;
            case R.id.button_south:
                configButtons();
                text_currentstate.setText("South");
                button_S.setImageResource(R.drawable.arrow_down_red);
                break;
            case R.id.button_east:
                configButtons();
                text_currentstate.setText("East");
                button_E.setImageResource(R.drawable.arrow_right_red);
                break;
            case R.id.button_west:
                configButtons();
                text_currentstate.setText("West");
                button_W.setImageResource(R.drawable.arrow_left_red);
                break;
            case R.id.button_stop:
                configButtons();
                text_currentstate.setText("Stop");
                button_stop.setImageResource(R.drawable.arrow_up_red);
                break;
        }
    }

} // XYlaser class
