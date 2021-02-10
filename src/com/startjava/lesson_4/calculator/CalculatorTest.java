package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String answer = "";
        Calculator calculator = new Calculator();
        while (!answer.equals("нет")) {
            Scanner sc = new Scanner(System.in);
             answer = "";
            System.out.print("Введите математическое выражение: ");
            String[] expression = sc.nextLine().split(" ");

            double a = Double.parseDouble(expression[0]);
            char operation = expression[1].charAt(0);
            double b = Double.parseDouble(expression[2]);

            System.out.println(calculator.calculate(a, operation, b));

            while (!answer.equals("нет") && !answer.equals("да")) {
                System.out.println("Хотите продолжить вычисления? [да/нет]");
                answer = sc.next();
            }
        }
    }
}

