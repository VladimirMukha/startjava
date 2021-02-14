package com.startjava.lesson_4.game;


import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Player playerOne;
    Player playerTwo;
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void start() {
        int targetNumber = random.nextInt(101) + 1;
        int[] arrayOne = new int[10];
        int[] arrayTwo = new int[10];
        int countOne = 0;
        int countTwo = 0;
        for (int k = 0; k < 10; k++) {
            System.out.print(playerOne.getName() + " введите число: ");
            playerOne.setNumber(scanner.nextInt());

            if (playerOne.getNumber() != 0) {
                arrayOne[k] = playerOne.getNumber();
                countOne++;
            }
            playerOne.playNumberArray = Arrays.copyOf(arrayOne, countOne);
            if (targetNumber == playerOne.getNumber()) {
                System.out.println("Игрок " + playerOne.getName() + " угадал число  " + targetNumber +
                        " с " + countOne + " попытки ");
                System.out.println("ранее введенные числа игроком :" + Arrays.toString(playerOne.playNumberArray));
                break;
            }
            if (targetNumber < playerOne.getNumber()) {
                System.out.println("Выбранное  число игроком " + playerOne.getName() + " : больше загаданного.");
            } else if (targetNumber > playerOne.getNumber()) {
                System.out.println("Выбранное число   игроком " + playerOne.getName() + " : меньше загаданного.");
            }
            if (k == 9) {
                System.out.println("У " + playerOne.getName() + " закончились попытки");
            }
            System.out.print(playerTwo.getName() + "  введите число :");
            playerTwo.setNumber(scanner.nextInt());

            if (playerTwo.getNumber() != 0) {
                arrayTwo[k] = playerTwo.getNumber();
                countTwo++;
            }

            playerTwo.playNumberArray = Arrays.copyOf(arrayTwo, countTwo);

            if (targetNumber == playerTwo.getNumber()) {
                System.out.println("Игрок " + playerTwo.getName() + " угадал число  " + targetNumber +
                        " с " + countTwo + " попытки ");
                System.out.println("ранее введенные числа игроком :" + Arrays.toString(playerOne.playNumberArray));
                break;
            }
            if (targetNumber < playerTwo.getNumber()) {
                System.out.println("Выбранное число   игроком " + playerTwo.getName() + " : больше загаданного.");

            } else if (targetNumber > playerTwo.getNumber()) {
                System.out.println("Выбранное  число   игроком " + playerTwo.getName() + " : меньше загаданного.");
            }
            if (k == 9) {
                System.out.println("У " + playerTwo.getName() + " закончились попытки.");
                System.out.println("-----------------------------------------------------");

                System.out.println("Игрок " + playerOne.getName() + Arrays.toString(playerOne.playNumberArray) + "\n");
                System.out.println("Игрок " + playerTwo.getName() + Arrays.toString(playerTwo.playNumberArray));

                Arrays.fill(arrayOne,countOne);
                Arrays.fill(arrayTwo,countTwo);
            }
        }
    }
}





