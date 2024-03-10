package com.example.androidprojetcollection;


// Java code for stack implementation

import java.io.*;
import java.util.*;

class MDASCalculator{
    ArrayList<String> postfix = new ArrayList<>();
    Stack<String> stk = new Stack<String>();

    public MDASCalculator(ArrayList<String> infix){
        for(int i = 0 ; i < infix.size() ; i++){
            if(infix.get(i).matches(".*[+\\-*/].*")){
                while(!stk.empty() && hasHigherPrecedence(stk.peek(), infix.get(i))){
                    postfix.add(stk.pop());
                }
                stk.push(infix.get(i));
            } else {
                postfix.add(infix.get(i));
            }
        }

        while(!stk.empty()){
            postfix.add(stk.pop());
        }
    }

    public String evaluate(){
        Stack<Double> numbers = new Stack<Double>();
        for(int i = 0 ; i < postfix.size() ; i++){
            if(postfix.get(i).matches(".*[+\\-*/].*")){
                Double num2 = numbers.pop();
                Double num1 = numbers.pop();
                switch (postfix.get(i)) {
                    case "+":
                        numbers.push(num1 + num2);
                        break;
                    case "-":
                        numbers.push(num1 - num2);
                        break;
                    case "/":
                        numbers.push(num1 / num2);
                        break;
                    default:
                        numbers.push(num1 * num2);
                }
            } else {
                numbers.push(Double.parseDouble(postfix.get(i)));
            }
        }
        return numbers.pop().toString();
    }

    private boolean hasHigherPrecedence(String var1, String var2){
        if((var1 == "/" && var2 == "*") || (var1 == "*" && var2 == "/") ||var1.equals(var2) || (var1 == "+" && var2 == "-") || (var1 == "-" && var2 == "+") ||(var1 == "/" && var2 == "+") || (var1 == "*" && var2 == "+") || (var1 == "/" && var2 == "-") || (var1 == "*" && var2 == "-")){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<String> test = new ArrayList<>();
        test.add("10");
        test.add("+");
        test.add("2");
        test.add("+");
        test.add("5");
        test.add("*");
        test.add("3");
        test.add("/");
        test.add("10");

        MDASCalculator calc = new MDASCalculator(test);
        System.out.println(calc.postfix.toString());
        System.out.println(calc.evaluate());
    }


}