import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private static final Scanner scanner = new Scanner(System.in);
    public Player playerOne;
    public Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    Random random = new Random();
    int targetNumber = random.nextInt(100);

    public void startGame() {
        System.out.print("Первый игрок " + playerOne.getName() + " введите число: ");
        playerOne.setNumber(scanner.nextInt());

        if (targetNumber == playerOne.getNumber()) {
            System.out.println("Поздравляем игрока " + playerOne.getName() + " с  победой!!");
            System.out.println("Игра окончена!");
            targetNumber = random.nextInt(100);
            return;
        }
        if (targetNumber < playerOne.getNumber()) {
            System.out.println("Выбранное  число игроком " + playerOne.getName() + " : больше загаданного");
        }else if (targetNumber > playerOne.getNumber()) {
            System.out.println("Выбранное число   игроком " + playerOne.getName() + " : меньше загаданного ");
        }
        System.out.print(playerTwo.getName() + "  введите число :");
        playerTwo.setNumber(scanner.nextInt());

        if (targetNumber == playerTwo.getNumber()) {
            System.out.println("Поздравляем игрока " + playerOne.getName() + " с  победой!!");
            System.out.println("Игра окончена!");
            targetNumber = random.nextInt(100);
            return;
        }
        if (targetNumber < playerTwo.getNumber()) {
            System.out.println("Выбранное число   игроком " + playerTwo.getName() + " : больше загаданного");
        } else if (targetNumber > playerTwo.getNumber()) {
            System.out.println("Выбранное  число   игроком " + playerTwo.getName() + " : меньше загаданного");
        }
    }
}
