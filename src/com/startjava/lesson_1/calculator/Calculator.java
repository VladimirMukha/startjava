package com.startjava.lesson_1.calculator;

public class Calculator {
    public double calculations(double a, char operation, double b ){
        double result = 0;

        switch(operation){
          case '+': result = a+b;
          break;
          case '-': result = a-b;
          break;
          case '*': result = a*b;
          break;
          case '/': result = a/b;
          break;
        }
          return result;
    }
}