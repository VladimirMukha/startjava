package com.startjava.lesson_2_3.game;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("¬ведите им€ первого игрока: ");
        String nameOne = scanner.next();
        System.out.print("¬ведите им€ второго игрока: ");
        String nameTwo = scanner.next();
        System.out.println(nameOne + " and " + nameTwo + " Beginning!!");

        GuessNumber game = new GuessNumber(new Player(nameOne), new Player(nameTwo));
        String answer = "";

        do {
            game.start();
            if (!answer.equals("да") && !answer.equals("нет")) {
                System.out.print("’отите продолжить игру? [да/нет]:");
                answer = scanner.next();
            }
        } while (!answer.equals("нет"));
    }
}

