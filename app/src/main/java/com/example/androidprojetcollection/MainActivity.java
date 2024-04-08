package com.example.androidprojetcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLayoutExercise = (Button)findViewById(R.id.btnLayoutExercise);
        Button btnButtonExercise = (Button)findViewById(R.id.btnButtonExercise);
        Button btnCalculatorExercise = (Button)findViewById(R.id.btnCalculatorExercise);
        Button btnConnectThree = (Button)findViewById(R.id.btnConnect3);

        btnLayoutExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LayoutExercise.class));
            }
        });

        btnConnectThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TolentinoMidtermExamProject_Batch1.class));
            }
        });

        btnButtonExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, button_exercise.class));
            }
        });

        btnCalculatorExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, calculatorApp.class));

            }
        });
    }
}