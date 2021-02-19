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
        restart(playerOne);
        restart(playerTwo);

        for (int i = 0; i < 10; i++) {
            inputNumber(playerOne);

            if (checkNumber(playerOne, i)) {

                break;
            }

            inputNumber(playerTwo);
            if (checkNumber(playerTwo, i)) {

                break;
            }
            if (i == 9) {
                System.out.println("У " + playerOne.getName() + " закончились попытки.");
                showEnteredNumbers(playerOne);
                System.out.println("У " + playerTwo.getName() + " закончились попытки.");
                showEnteredNumbers(playerTwo);
                System.out.println("-----------------------------");


            }

        }
    }

    private void restart(Player player) {
        Arrays.fill(player.getEnteredNumbers(), 0);
        player.setAttempt(0);
    }

    private boolean checkNumber(Player player, int i) {
        int number = player.getEnteredNumbers()[i];
        if (number == targetNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число  " + targetNumber +
                    " с " + player.getAttempts() + " попытки ");
            return true;
        }

        System.out.println(number > targetNumber ? "Выбранное число   игроком " + player.getName() +
                " : больше загаданного." : "Выбранное  число   игроком " + player.getName() + " меньше загаданного.");

        return false;
    }

    private void inputNumber(Player player) {
        System.out.print(player.getName() + " Введите число :");
        player.setEnteredNumber(scanner.nextInt());
    }

    private void showEnteredNumbers(Player player) {
        System.out.print(player.getName() + " ");
        for (int number : player.getEnteredNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}