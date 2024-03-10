package com.example.androidprojetcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class calculatorApp extends AppCompatActivity {

    boolean isOperating = false;

    ArrayList<String> expression = new ArrayList<>();
    String input = "";


    boolean displaySequenceSum = false;

    private void inputNumber(String num){

        input += num;

    }

    private void addOperation(String num){
        if(input == "") return;
        if(input != ""){
            expression.add(input);
        }

        input = "";

        if(expression.get(expression.size() - 1).matches(".*[+\\-*/].*")){
            expression.set(expression.size() - 1, num);
        } else {
            expression.add(num);
        }
        Log.i("NumberGenerated", expression.toString());
    }

    private String joinExpression(){
        return String.join(" ", expression);
    }

    private String evaluateExpression(){
        if(expression.size() == 0) return "";
        String secondNumber;
        Double result = Double.parseDouble(expression.get(0));
        for(int i = 1 ; i < expression.size() - 2; i++){
            secondNumber = expression.get(i + 1);
            if(expression.get(i).matches(".*[+\\-*/].*")){
                switch(expression.get(i)){
                    case "+":
                        result += Double.parseDouble(secondNumber);
                        break;
                    case "-":
                        result -= Double.parseDouble(secondNumber);
                        break;
                    case "*":
                        result *= Double.parseDouble(secondNumber);
                        break;
                    default:
                        result /= Double.parseDouble(secondNumber);
                }
            }
        }
        return result.toString();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_app);


        EditText ptMonitor = (EditText)findViewById(R.id.ptMonitor);
        EditText ptExpression = (EditText)findViewById(R.id.ptExpression);
        ptMonitor.setEnabled(false);

        Button btn1 = (Button)findViewById(R.id.btn1);
        Button btn2 = (Button)findViewById(R.id.btn2);
        Button btn3 = (Button)findViewById(R.id.btn3);
        Button btn4 = (Button)findViewById(R.id.btn4);
        Button btn5 = (Button)findViewById(R.id.btn5);
        Button btn6 = (Button)findViewById(R.id.btn6);
        Button btn7 = (Button)findViewById(R.id.btn7);
        Button btn8 = (Button)findViewById(R.id.btn8);
        Button btn9 = (Button)findViewById(R.id.btn9);
        Button btn0 = (Button)findViewById(R.id.btn0);

        Button btnMinus = (Button)findViewById(R.id.btnMinus);
        Button btnPlus = (Button)findViewById(R.id.btnPlus);
        Button btnMultiply = (Button)findViewById(R.id.btnMultiply);
        Button btnPeriod = (Button)findViewById(R.id.btnPeriod);
        Button btnDivide = (Button)findViewById(R.id.btnDivide);
        Button btnClear = (Button)findViewById(R.id.btnClear);

        Button btnEquals = (Button)findViewById(R.id.btnEquals);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(displaySequenceSum){
                    ptMonitor.setText("");
                    displaySequenceSum = false;
                }
                inputNumber("1");
                ptMonitor.setText(input);

                ptExpression.setText(joinExpression());
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(displaySequenceSum){
                    ptMonitor.setText("");
                    displaySequenceSum = false;
                }
                inputNumber("2");
                ptMonitor.setText(input);
                ptExpression.setText(joinExpression());
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(displaySequenceSum){
                    ptMonitor.setText("");
                    displaySequenceSum = false;
                }
                inputNumber("3");

                ptMonitor.setText(input);

                ptExpression.setText(joinExpression());
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(displaySequenceSum){
                    ptMonitor.setText("");
                    displaySequenceSum = false;
                }
                inputNumber("4");

                ptMonitor.setText(input);
                ptExpression.setText(joinExpression());
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(displaySequenceSum){
                    ptMonitor.setText("");
                    displaySequenceSum = false;
                }
                inputNumber("5");

                ptMonitor.setText(input);
                ptExpression.setText(joinExpression());
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(displaySequenceSum){
                    ptMonitor.setText("");
                    displaySequenceSum = false;
                }
                inputNumber("6");

                ptMonitor.setText(input);
                ptExpression.setText(joinExpression());
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(displaySequenceSum){
                    ptMonitor.setText("");
                    displaySequenceSum = false;
                }
                inputNumber("7");

                ptMonitor.setText(input);
                ptExpression.setText(joinExpression());
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(displaySequenceSum){
                    ptMonitor.setText("");
                    displaySequenceSum = false;
                }
                inputNumber("8");

                ptMonitor.setText(input);
                ptExpression.setText(joinExpression());
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(displaySequenceSum){
                    ptMonitor.setText("");
                    displaySequenceSum = false;
                }
                inputNumber("9");

                ptMonitor.setText(input);
                ptExpression.setText(joinExpression());
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(displaySequenceSum){
                    ptMonitor.setText("");
                    displaySequenceSum = false;
                }
                inputNumber("0");

                ptMonitor.setText(input);
                ptExpression.setText(joinExpression());
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addOperation("+");
                ptMonitor.setText(evaluateExpression());
                displaySequenceSum = true;

                ptExpression.setText(joinExpression());


            }
        });

        btnPeriod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(displaySequenceSum){
                    ptMonitor.setText("");
                    displaySequenceSum = false;
                }

                for(int i = 0 ; i < input.length() - 1 ; i++){
                    if(input.charAt(i) == '.'){
                        return;
                    }
                }

                if(input.charAt(input.length() - 1) == '.'){
                    input = input.substring(0, input.length() - 1);
                } else {
                    input += ".";
                }


                ptMonitor.setText(input);
                ptExpression.setText(joinExpression());
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addOperation("-");
                ptMonitor.setText(evaluateExpression());
                displaySequenceSum = true;

                ptExpression.setText(joinExpression());
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addOperation("*");
                ptMonitor.setText(evaluateExpression());
                displaySequenceSum = true;

                ptExpression.setText(joinExpression());
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addOperation("/");
                ptMonitor.setText(evaluateExpression());
                displaySequenceSum = true;

                ptExpression.setText(joinExpression());
            }
        });

        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression.add(input);
                MDASCalculator calculator = new MDASCalculator(expression);


                ptMonitor.setText(calculator.evaluate());
                ptExpression.setText("");
                expression.clear();
                displaySequenceSum = true;
                input = calculator.evaluate();
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ptMonitor.setText("");
                ptExpression.setText("");
                expression.clear();
                displaySequenceSum = false;
                input = "";
            }
        });


    }




}