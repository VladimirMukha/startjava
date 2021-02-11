package com.startjava.lesson_4.calculator;

public class Calculator {
    public double calculate(double a, char operation, double b) {

        switch (operation) {
            case '+':
                return Math.addExact((int) a, (int) b);
            case '-':
                return Math.subtractExact((int) a, (int) b);
            case '*':
                return Math.multiplyExact((int) a, (int) b);
            case '/':
                return Math.floorDiv((int) a, (int) b);
            case '^':
                return Math.pow(a, b);
            case '%':
                return Math.floorMod((int) a, (int) b);
            default:
                System.out.print("Повторите ввод: ");
                break;
        }
        return -1;
    }
}

