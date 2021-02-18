package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("У вас 10 попыток");

        System.out.print("Введите имя первого игрока: ");
        String nameOne = scanner.next();
        System.out.print("Введите имя второго игрока: ");
        String nameTwo = scanner.next();
        System.out.println(nameOne + " and " + nameTwo + " Beginning!!");

        GuessNumber game = new GuessNumber(new Player(nameOne), new Player(nameTwo));
        String answer = "";

        while (!answer.equals("нет")) {
            game.start();

            do {
                System.out.print(" Хотите продолжить игру? [да/нет]:");
                answer = scanner.next();
            } while (!answer.equals("да") && !answer.equals("нет"));
        }
    }
}