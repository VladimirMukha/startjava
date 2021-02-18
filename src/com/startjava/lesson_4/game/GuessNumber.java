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
            countOne = getCount(playerOne,countOne, k);
            if (targetNumber == playerOne.getEnteredNumbers()[k]) {

                getShowWinner(playerOne, targetNumber, countOne);
                getNumbers(playerOne);

                Arrays.fill(playerOne.getEnteredNumbers(), 0);
                playerOne.setIndex(0);
                playerTwo.setIndex(0);
                break;
            }

            numberCheck(playerOne, targetNumber, k);

            countTwo = getCount(playerTwo,countTwo, k);
            if (targetNumber == playerTwo.getEnteredNumbers()[k]) {

                getShowWinner(playerTwo, targetNumber, countTwo);

                getNumbers(playerTwo);
                Arrays.fill(playerTwo.getEnteredNumbers(), 0);
                playerTwo.setIndex(0);
                playerOne.setIndex(0);
                break;
            }

            numberCheck(playerTwo, targetNumber, k);

            if (k == 9) {
                System.out.println("У " + playerOne.getName() + " закончились попытки.");
                System.out.println("У " + playerTwo.getName() + " закончились попытки.");
                System.out.println("-----------------------------------------------");

                getNumbers(playerOne);
                getNumbers(playerTwo);
                Arrays.fill(playerOne.getEnteredNumbers(), 0);
                Arrays.fill(playerTwo.getEnteredNumbers(), 0);
                playerOne.setIndex(0);
                playerTwo.setIndex(0);
            }
        }
    }

    private int getCount(Player player,int count, int k) {
        System.out.print(player.getName() + " введите число: ");

        player.setEnteredNumber(scanner.nextInt());

        if (player.getEnteredNumbers()[k] != 0) {
            ++count;
        }
        return count;
    }

    private void numberCheck(Player player, int targetNumber, int k) {
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
        System.out.print("ранее введенные числа игроком :");
    }

    private void getNumbers(Player player) {
        for (int numbers : player.getEnteredNumbers()) {
            System.out.print(numbers + " ");
        }
        System.out.println(player.getName());
    }
}