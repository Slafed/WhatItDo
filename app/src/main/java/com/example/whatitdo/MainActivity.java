package com.example.whatitdo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
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

    }
}
