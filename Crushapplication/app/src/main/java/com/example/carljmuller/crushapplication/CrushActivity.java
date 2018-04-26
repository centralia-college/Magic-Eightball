package com.example.carljmuller.crushapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Random;



public class CrushActivity extends AppCompatActivity {


     Random Dice = new Random();

    // declare an array of string
    String[] eightBall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crush);
       eightBall = getResources().getStringArray(R.array.eightBall_array);
    }

        public void rollDice (View view){
        TextView tv = findViewById(R.id.textbox);
        tv.setText("Magic EightBall says");
            int Roll= Dice.nextInt(eightBall.length);
        TextView diceRoll = findViewById(R.id.Roll);
        diceRoll.setText(String.valueOf(eightBall[Roll]));
    }



}
