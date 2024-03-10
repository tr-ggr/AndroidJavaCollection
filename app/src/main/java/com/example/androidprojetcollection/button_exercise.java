package com.example.androidprojetcollection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class button_exercise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_exercise);

        Button btnOne = (Button)findViewById(R.id.btnOne);
        Button btnTwo = (Button)findViewById(R.id.btnTwo);
        Button btnThree = (Button)findViewById(R.id.btnThree);
        Button btnFour = (Button)findViewById(R.id.btnFour);
        Button btnFive = (Button)findViewById(R.id.btnFive);

        final ConstraintLayout constraintlayout = findViewById(R.id.rltLayout);

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(button_exercise.this, btnOne.class));
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Toast is Working!" , Toast.LENGTH_LONG ).show();
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnThree.setVisibility(View.INVISIBLE);
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnFour.setBackgroundColor(Color.RED);
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                constraintlayout.setBackgroundColor(Color.GREEN);
            }
        });

    }


}