package com.startjava.lesson_2_3.calculator;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        String answer = "";
        while (!answer.equals("���")) {
            answer = "";
            System.out.print("������� ������ �����: ");
            int a = sc.nextInt();
            System.out.print("������� ���� �������������� ��������: ");
            char sign = sc.next().charAt(0);
            System.out.print("������� ������ �����: ");
            int b = sc.nextInt();
            calculator.calculate(a, sign, b);
            while (!answer.equals("���") && !answer.equals("��")) {
                System.out.println("������ ���������� ���������� [��/���]");
                answer = sc.next();
            }
        }
    }
}