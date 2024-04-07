package com.example.androidprojetcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;


public class TolentinoMidtermExamProject_Batch1 extends AppCompatActivity {


    static TextView[][] Fields = new TextView[5][5];
    static String currentPlayer = "One";

    //HERE




    //HERE






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tolentino_midterm_exam_project_batch1);
        //here
        TextView btnR1C1  = (TextView)findViewById(R.id.btnR1C1);
        TextView btnR1C2 = (TextView)findViewById(R.id.btnR1C2);
        TextView btnR1C3  = (TextView)findViewById(R.id.btnR1C3);
        TextView btnR1C4  = (TextView)findViewById(R.id.btnR1C4);
        TextView btnR1C5  = (TextView)findViewById(R.id.btnR1C5);

        TextView btnR2C1  = (TextView)findViewById(R.id.btnR2C1);
        TextView btnR2C2 = (TextView)findViewById(R.id.btnR2C2);
        TextView btnR2C3  = (TextView)findViewById(R.id.btnR2C3);
        TextView btnR2C4  = (TextView)findViewById(R.id.btnR2C4);
        TextView btnR2C5  = (TextView)findViewById(R.id.btnR2C5);

        TextView btnR3C1  = (TextView)findViewById(R.id.btnR3C1);
        TextView btnR3C2  = (TextView)findViewById(R.id.btnR3C2);
        TextView btnR3C3  = (TextView)findViewById(R.id.btnR3C3);
        TextView btnR3C4  = (TextView)findViewById(R.id.btnR3C4);
        TextView btnR3C5  = (TextView)findViewById(R.id.btnR3C5);

        TextView btnR4C1  = (TextView)findViewById(R.id.btnR4C1);
        TextView btnR4C2  = (TextView)findViewById(R.id.btnR4C2);
        TextView btnR4C3  = (TextView)findViewById(R.id.btnR4C3);
        TextView btnR4C4  = (TextView)findViewById(R.id.btnR4C4);
        TextView btnR4C5  = (TextView)findViewById(R.id.btnR4C5);

        TextView btnR5C1  = (TextView)findViewById(R.id.btnR5C1);
        TextView btnR5C2 = (TextView)findViewById(R.id.btnR5C2);
        TextView btnR5C3 = (TextView)findViewById(R.id.btnR5C3);
        TextView btnR5C4  = (TextView)findViewById(R.id.btnR5C4);
        TextView btnR5C5 = (TextView)findViewById(R.id.btnR5C5);

        Button btnReset = (Button)findViewById(R.id.btnReset);

        TextView txtPlayer = (TextView)findViewById(R.id.txtPlayer);

        txtPlayer.setText("Player " + currentPlayer + "'s turn");


        for(int i = 0 ; i < 5 ; i++){
            for(int j = 0 ; j < 5 ; j++){
                Fields[i][j] = findViewById(getResources().getIdentifier("btnR" + (i + 1) + "C" + (j+1), "id", getPackageName()));
            }
        }


        btnR1C1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(addToken(0)){

                    if(Checker()){
                        txtPlayer.setText(currentPlayer + " Won!");
                        btnR1C1.setClickable(false);
                        btnR1C2.setClickable(false);
                        btnR1C3.setClickable(false);
                        btnR1C4.setClickable(false);
                        btnR1C5.setClickable(false);
                    } else {
                        txtPlayer.setText(changeTurn());
                    }

                }
            }
        });

        btnR1C2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(addToken(1)){
                    if(Checker()){
                        txtPlayer.setText(currentPlayer + " Won!");
                        btnR1C1.setClickable(false);
                        btnR1C2.setClickable(false);
                        btnR1C3.setClickable(false);
                        btnR1C4.setClickable(false);
                        btnR1C5.setClickable(false);
                    } else {
                        txtPlayer.setText(changeTurn());
                    }
                };
            }
        });

        btnR1C3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(addToken(2)){
                    if(Checker()){
                        txtPlayer.setText(currentPlayer + " Won!");
                        btnR1C1.setClickable(false);
                        btnR1C2.setClickable(false);
                        btnR1C3.setClickable(false);
                        btnR1C4.setClickable(false);
                        btnR1C5.setClickable(false);
                    } else {
                        txtPlayer.setText(changeTurn());
                    }
                };
            }
        });

        btnR1C4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(addToken(3)){
                    if(Checker()){
                        txtPlayer.setText(currentPlayer + " Won!");
                        btnR1C1.setClickable(false);
                        btnR1C2.setClickable(false);
                        btnR1C3.setClickable(false);
                        btnR1C4.setClickable(false);
                        btnR1C5.setClickable(false);
                    } else {
                        txtPlayer.setText(changeTurn());
                    }
                };
            }
        });

        btnR1C5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(addToken(4)){
                    if(Checker()){
                        txtPlayer.setText(currentPlayer + " Won!");
                        btnR1C1.setClickable(false);
                        btnR1C2.setClickable(false);
                        btnR1C3.setClickable(false);
                        btnR1C4.setClickable(false);
                        btnR1C5.setClickable(false);
                    } else {
                        txtPlayer.setText(changeTurn());
                    }
                };

            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResetGame();
                btnR1C1.setClickable(true);
                btnR1C2.setClickable(true);
                btnR1C3.setClickable(true);
                btnR1C4.setClickable(true);
                btnR1C5.setClickable(true);
                txtPlayer.setText("Player " + currentPlayer + "'s turn");


            }
        });
    }

    public String changeTurn(){

        if(currentPlayer == "One"){
            currentPlayer = "Two";
        } else {
            currentPlayer = "One";
        }

        return "Player " + currentPlayer + "'s turn";

    }

    public int playerColor(){
        if(currentPlayer == "One"){
            return Color.BLUE;
        } else {
            return Color.RED;
        }
    }

    public void ResetGame(){
        for(int i = 0 ; i < 5 ; i++){
            for(int j = 0 ; j < 5 ; j++) {
                Fields[i][j].setText("X");
                Fields[i][j].setBackgroundColor(Color.WHITE);
                currentPlayer = "One";
            }
        }
    }

    public boolean addToken(int column) {
        if (Fields[0][column].getText().equals(currentPlayer)) return false;

        for (int i = 4; i >= 0; i--) {
            if (Fields[i][column].getText().equals("X")) {
                Fields[i][column].setBackgroundColor(playerColor());
                Fields[i][column].setText(currentPlayer);
                Log.d("CLICKED", "NI SULOD!");
                return true;
            }

        }
        return false;
    }

    public boolean Checker() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                //Horizontal check
                if (j > 0 && j < 4 && Fields[i][j - 1].getText().equals(currentPlayer)
                        && Fields[i][j + 1].getText().equals(currentPlayer)
                        && Fields[i][j].getText().equals(currentPlayer)) {
                    Log.d("Win", "Horizontal at Index: i - " + i + " j - " + j );
                    return true;
                }

                //Vertical check
                if (i > 0 && i < 4 && Fields[i + 1][j].getText().equals(currentPlayer)
                        && Fields[i - 1][j].getText().equals(currentPlayer)
                        && Fields[i][j].getText().equals(currentPlayer)) {
                    Log.d("Win", "Vertical at Index: i - " + i + " j - " + j  );
                    return true;
                }

                //Diagonal check
                if (i > 0 && i < 3 && j > 0 && j < 3) {
                    //top-left to bottom-right
                    if (Fields[i - 1][j - 1].getText().equals(currentPlayer)
                            && Fields[i][j].getText().equals(currentPlayer)
                            && Fields[i + 1][j + 1].getText().equals(currentPlayer)) {
                        Log.d("Win", "(top-left to bottom-right) at Index: i - " + i + " j - " + j );
                        return true;
                    }
                }

                if (i < 3 && i > 0 && j < 3 && j > 0) {
                    //bottom-left to top-right
                    if (Fields[i + 1][j - 1].getText().equals(currentPlayer)
                            && Fields[i][j].getText().equals(currentPlayer)
                            && Fields[i - 1][j + 1].getText().equals(currentPlayer)) {
                        Log.d("Win", "(bottom-left to top-right) at Index: i - " + i + " j - " + j );
                        return true;
                    }
                }
            }
        }
        return false;
    }






}