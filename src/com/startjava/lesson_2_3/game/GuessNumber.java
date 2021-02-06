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
            System.out.print("Первый игрок " + playerOne.getName() + " введите число: ");
            playerOne.setNumber(scanner.nextInt());

            if (targetNumber == playerOne.getNumber()) {
                System.out.println("Победил: " + playerOne.getName());
                break;
            }
            if (targetNumber < playerOne.getNumber()) {
                System.out.println("Выбранное  число игроком " + playerOne.getName() + " : больше загаданного.");

            } else if (targetNumber > playerOne.getNumber()) {
                System.out.println("Выбранное число   игроком " + playerOne.getName() + " : меньше загаданного.");

            }

            System.out.print(playerTwo.getName() + "  введите число :");
            playerTwo.setNumber(scanner.nextInt());
            if (targetNumber == playerTwo.getNumber()) {
                System.out.println("Победил: " + playerTwo.getName());
                break;
            }
            if (targetNumber < playerTwo.getNumber()) {
                System.out.println("Выбранное число   игроком " + playerTwo.getName() + " : больше загаданного.");

            } else if (targetNumber > playerTwo.getNumber()) {
                System.out.println("Выбранное  число   игроком " + playerTwo.getName() + " : меньше загаданного.");
            }
        } while (true);

        System.out.println("Игра окончена!");
    }
}

