package com.startjava.lesson_4.calculator;

public class Calculator {
    public double calculate(double a, char operation, double b) {
        double result = 0;

        switch (operation) {
            case '+':
                result = Math.addExact((int) a, (int) b);
                break;
            case '-':
                result = Math.subtractExact((int) a, (int) b);
                break;
            case '*':
                result = Math.multiplyExact((int) a, (int) b);
                break;
            case '/':
                result = Math.floorDiv((int) a, (int) b);
                break;
            case '^':
                result = Math.pow(a, b);
                break;
            case '%':
                result = Math.floorMod((int) a, (int) b);
                break;
        }
        return result;
    }
}

