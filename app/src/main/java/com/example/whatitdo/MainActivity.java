package com.example.whatitdo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void check (View v){
        // check box
        CheckBox anything = (CheckBox) findViewById(R.id.checkBox);

        TextView t1 = (TextView) findViewById(R.id.whatItDo1);

        if(anything.isChecked()){
            t1.setText("ayyy, what is up gamer?");
        }
        else {
            t1.setText("awww, click it again");
        }

        // radio button
        RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton1);
        RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton2);

        TextView t2 = (TextView) findViewById(R.id.whatItDo2);

        if(rb1.isChecked()){
            t2.setText("stinky");
        }
        else if(rb2.isChecked()){
            t2.setText("super stinky");
        }

        // switch
        Switch s1 = (Switch) findViewById(R.id.switch1);

        TextView t3 = (TextView) findViewById(R.id.whatItDo3);

        if(s1.isChecked()){
            t3.setText("wax on");
        }
        else {
            t3.setText("wax off");
        }
    }
}
