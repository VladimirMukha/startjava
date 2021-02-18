package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);
    private int targetNumber;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void start() {
        targetNumber = random.nextInt(101) + 1;

        for (int i = 0; i < 10; i++) {
            if (checkNumberAndWinner(playerOne, i)) {
                getShowEnteredNumbers(playerOne);
                Arrays.fill(playerOne.getEnteredNumbers(), 0);
                playerOne.setIndex(0);
                playerTwo.setIndex(0);
                break;
            }
            if (checkNumberAndWinner(playerTwo, i)) {
                getShowEnteredNumbers(playerTwo);
                Arrays.fill(playerTwo.getEnteredNumbers(), 0);
                playerTwo.setIndex(0);
                playerOne.setIndex(0);
                break;
            }

            if (i == 9) {
                System.out.println("У " + playerOne.getName() + " закончились попытки.");
                System.out.println("У " + playerTwo.getName() + " закончились попытки.");
                System.out.println("-------------------------------");

                getShowEnteredNumbers(playerOne);
                getShowEnteredNumbers(playerTwo);
                Arrays.fill(playerOne.getEnteredNumbers(), 0);
                Arrays.fill(playerTwo.getEnteredNumbers(), 0);
                playerOne.setIndex(0);
                playerTwo.setIndex(0);
            }
        }
    }

    private boolean checkNumberAndWinner(Player player, int i) {
        System.out.print(player.getName() + " введите число: ");
        player.setEnteredNumber(scanner.nextInt());
        int number = player.getEnteredNumbers()[i];

        if (number == targetNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число  " + targetNumber +
                    " с " + player.getIndex() + " попытки ");
            System.out.print("ранее введенные числа игроком :");
            return true;
        }
        if (targetNumber < number) {
            System.out.println("Выбранное число   игроком " + player.getName() +
                    " : больше загаданного.");
        } else if (targetNumber > number) {
            System.out.println("Выбранное  число   игроком " + player.getName() +
                    " : меньше загаданного.");
        }
        return false;
    }

    private void getShowEnteredNumbers(Player player) {
        System.out.print(player.getName() + " ");

        for (int number : player.getEnteredNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}