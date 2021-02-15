package com.startjava.lesson_4.game;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void start() {
        int targetNumber = random.nextInt(101) + 1;
        int countOne = 0;
        int countTwo = 0;

        for (int k = 0; k < 10; k++) {
            System.out.print(playerOne.getName() + " введите число: ");

            playerOne.setEnteredNumber(scanner.nextInt());

            if (playerOne.getEnteredNumber()[k] != 0) {
                ++countOne;
            }

            if (targetNumber == playerOne.getEnteredNumber()[k]) {
                System.out.println("Игрок " + playerOne.getName() + " угадал число  " + targetNumber +
                        " с " + countOne + " попытки ");
                System.out.println("ранее введенные числа игроком :" +
                        Arrays.toString(Arrays.copyOf(playerOne.getEnteredNumber(), countTwo)));
                Arrays.fill(playerOne.getEnteredNumber(), 0);
                playerOne.setIndex(0);
                playerTwo.setIndex(0);
                break;
            }

            if (targetNumber < playerOne.getEnteredNumber()[k]) {
                System.out.println("Выбранное  число игроком " + playerOne.getName() + " : больше загаданного.");
            } else if (targetNumber > playerOne.getEnteredNumber()[k]) {
                System.out.println("Выбранное число   игроком " + playerOne.getName() + " : меньше загаданного.");
            }

            System.out.print(playerTwo.getName() + "  введите число :");
            playerTwo.setEnteredNumber(scanner.nextInt());

            if (playerTwo.getEnteredNumber()[k] != 0) {
                countTwo++;
            }
            if (targetNumber == playerTwo.getEnteredNumber()[k]) {
                System.out.println("Игрок " + playerTwo.getName() + " угадал число  " + targetNumber +
                        " с " + countTwo + " попытки ");
                System.out.println("ранее введенные числа игроком :" +
                        Arrays.toString(Arrays.copyOf(playerOne.getEnteredNumber(), countTwo)));
                Arrays.fill(playerTwo.getEnteredNumber(), 0);
                playerTwo.setIndex(0);
                playerOne.setIndex(0);
                break;
            }
            if (targetNumber < playerTwo.getEnteredNumber()[k]) {
                System.out.println("Выбранное число   игроком " + playerTwo.getName() + " : больше загаданного.");

            } else if (targetNumber > playerTwo.getEnteredNumber()[k]) {
                System.out.println("Выбранное  число   игроком " + playerTwo.getName() + " : меньше загаданного.");
            }
            if (k == 9) {

                System.out.println("У " + playerOne.getName() + " закончились попытки.");
                System.out.println("У " + playerTwo.getName() + " закончились попытки.");
                System.out.println("-----------------------------------------------------");

                System.out.println("Игрок " + playerOne.getName() + Arrays.toString(playerOne.getEnteredNumber()) + "\n");
                System.out.println("Игрок " + playerTwo.getName() + Arrays.toString(playerTwo.getEnteredNumber()));
                Arrays.fill(playerOne.getEnteredNumber(), 0);
                Arrays.fill(playerTwo.getEnteredNumber(), 0);
                playerOne.setIndex(0);
                playerTwo.setIndex(0);
            }
        }
    }
}





