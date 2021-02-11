package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String answer = "";
        Calculator calculator = new Calculator();

        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите математическое выражение: ");

            String[] expression = sc.nextLine().split(" ");
            System.out.println(calculator.calculate(Double.parseDouble(expression[0]),
                    expression[1].charAt(0), Double.parseDouble(expression[2])));

            while (!answer.equals("нет") && !answer.equals("да")) {
                System.out.println("Хотите продолжить вычисления? [да/нет]");
                answer = sc.next();
            }
        } while (!answer.equals("нет"));
    }
}

