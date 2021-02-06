package com.startjava.lesson_2_3.calculator;

public class Calculator {
    public void calculate(double a, char operation, double b) {
        double result = 0;

        switch (operation) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '^':
                double exp = 1;
                for (int i = 0; i < b; i++) {
                    exp *= a;
                }
                System.out.println(exp);
                break;
            case '%':
                System.out.println(a % b);
                break;
        }
    }
}