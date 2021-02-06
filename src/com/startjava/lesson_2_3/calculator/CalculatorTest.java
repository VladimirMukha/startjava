package com.startjava.lesson_2_3.calculator;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        String answer = "";
        while (!answer.equals("нет")) {
            answer = "";
            System.out.print("¬ведите первое число: ");
            int a = sc.nextInt();
            System.out.print("¬ведите знак математической операции: ");
            char sign = sc.next().charAt(0);
            System.out.print("¬ведите второе число: ");
            int b = sc.nextInt();
            calculator.calculate(a, sign, b);
            while (!answer.equals("нет") && !answer.equals("да")) {
                System.out.println("’отите продолжить вычислени€? [да/нет]");
                answer = sc.next();
            }
        }
    }
}