package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class Calculator {

    public double calculate(String string) {
        String[] expression = string.split(" ");
        double a = Double.parseDouble(expression[0]);
        char sign = expression[1].charAt(0);
        double b = Double.parseDouble(expression[2]);

        switch (sign) {
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
                System.out.print("Повторите ввод!");
                break;
        }
        return 0;
    }
}

