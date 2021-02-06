package com.startjava.lesson_2_3.game;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public Player playerOne;
    public Player playerTwo;
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

     public void start() {
        int targetNumber = random.nextInt(101) + 1;
        do {
            System.out.print("������ ����� " + playerOne.getName() + " ������� �����: ");
            playerOne.setNumber(scanner.nextInt());

            if (targetNumber == playerOne.getNumber()) {
                System.out.println("�������: " + playerOne.getName());
                break;
            }
            if (targetNumber < playerOne.getNumber()) {
                System.out.println("���������  ����� ������� " + playerOne.getName() + " : ������ �����������");

            } else if (targetNumber > playerOne.getNumber()) {
                System.out.println("��������� �����   ������� " + playerOne.getName() + " : ������ ����������� ");

            }

            System.out.print(playerTwo.getName() + "  ������� ����� :");
            playerTwo.setNumber(scanner.nextInt());
            if (targetNumber == playerTwo.getNumber()) {
                System.out.println("�������: " + playerTwo.getName());
                break;
            }
            if (targetNumber < playerTwo.getNumber()) {
                System.out.println("��������� �����   ������� " + playerTwo.getName() + " : ������ �����������");

            } else if (targetNumber > playerTwo.getNumber()) {
                System.out.println("���������  �����   ������� " + playerTwo.getName() + " : ������ �����������");
            }
        } while (true);

        System.out.println("���� ��������!");
    }
}

