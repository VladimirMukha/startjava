package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String answer = "";
        Calculator calculator = new Calculator();

        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите математическое выражение: ");

            System.out.println(calculator.calculate(sc.nextLine()));

            do {
                System.out.println("Хотите продолжить вычисления? [да/нет]");
                answer = sc.next();
            } while (!answer.equals("нет") && !answer.equals("да"));

        } while (!answer.equals("нет"));
    }
}

