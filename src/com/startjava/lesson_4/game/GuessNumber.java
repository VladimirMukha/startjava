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

            playerOne.setEnteredNumbers(scanner.nextInt());

            if (playerOne.getEnteredNumbers()[k] != 0) {
                ++countOne;
            }
            if (targetNumber == playerOne.getEnteredNumbers()[k]) {

                getShowWinner(playerOne, targetNumber, countOne);

                System.out.println(Arrays.toString(Arrays.copyOf(playerOne.getEnteredNumbers(), countOne)));
                Arrays.fill(playerOne.getEnteredNumbers(), 0);
                playerOne.setIndex(0);
                playerTwo.setIndex(0);
                break;
            }

            lessOrMore(playerOne, targetNumber, k);

            System.out.print(playerTwo.getName() + "  введите число :");
            playerTwo.setEnteredNumbers(scanner.nextInt());

            if (playerTwo.getEnteredNumbers()[k] != 0) {
                countTwo++;
            }
            if (targetNumber == playerTwo.getEnteredNumbers()[k]) {

                getShowWinner(playerTwo, targetNumber, countTwo);

                System.out.println(Arrays.toString(Arrays.copyOf(playerTwo.getEnteredNumbers(), countTwo)));
                Arrays.fill(playerTwo.getEnteredNumbers(), 0);
                playerTwo.setIndex(0);
                playerOne.setIndex(0);
                break;
            }

            lessOrMore(playerTwo, targetNumber, k);

            if (k == 9) {
                System.out.println("У " + playerOne.getName() + " закончились попытки.");
                System.out.println("У " + playerTwo.getName() + " закончились попытки.");
                System.out.println("-----------------------------------------------------");

                System.out.println("Игрок " + playerOne.getName() + Arrays.toString(playerOne.getEnteredNumbers()) + "\n");
                System.out.println("Игрок " + playerTwo.getName() + Arrays.toString(playerTwo.getEnteredNumbers()));
                Arrays.fill(playerOne.getEnteredNumbers(), 0);
                Arrays.fill(playerTwo.getEnteredNumbers(), 0);
                playerOne.setIndex(0);
                playerTwo.setIndex(0);
            }
        }
    }

    private void lessOrMore(Player player, int targetNumber, int k) {
        if (targetNumber < player.getEnteredNumbers()[k]) {
            System.out.println("Выбранное число   игроком " + player.getName() +
                    " : больше загаданного.");
        } else if (targetNumber > player.getEnteredNumbers()[k]) {
            System.out.println("Выбранное  число   игроком " + player.getName() +
                    " : меньше загаданного.");
        }
    }

    private void getShowWinner(Player player, int targetNumber, int count) {
        System.out.println("Игрок " + player.getName() + " угадал число  " + targetNumber +
                " с " + count + " попытки ");
        System.out.println("ранее введенные числа игроком :");
    }
}