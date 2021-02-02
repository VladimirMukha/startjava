import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public Player playerOne;
    public Player playerTwo;
    public boolean isPlayerOne = false;
    public boolean isPlayerTwo = false;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    public void start() {
        int targetNumber = random.nextInt(101);//если тут делать генерацию , то при продолжении игры число перезаписывается .
        System.out.print("Первый игрок " + playerOne.getName() + " введите число: ");
        playerOne.setNumber(scanner.nextInt());
        if (targetNumber == playerOne.getNumber()) {
            isPlayerOne = true;
        }
        if (targetNumber == playerTwo.getNumber()) {
            isPlayerTwo = true;
        }
        if (targetNumber < playerOne.getNumber()) {
            System.out.println("Выбранное  число игроком " + playerOne.getName() + " : больше загаданного");
        } else if (targetNumber > playerOne.getNumber()) {
            System.out.println("Выбранное число   игроком " + playerOne.getName() + " : меньше загаданного ");
        }
        if (isPlayerTwo || isPlayerOne) {
            System.out.println("Есть победитель");
            System.out.println(playerOne.getName() + ":" + isPlayerOne);
            System.out.println(playerTwo.getName() + ":" + isPlayerTwo);
            System.out.println("Игра окончена!");
            return;
        }

        System.out.print(playerTwo.getName() + "  введите число :");
        playerTwo.setNumber(scanner.nextInt());
        if (targetNumber < playerTwo.getNumber()) {
            System.out.println("Выбранное число   игроком " + playerTwo.getName() + " : больше загаданного");
        } else if (targetNumber > playerTwo.getNumber()) {
            System.out.println("Выбранное  число   игроком " + playerTwo.getName() + " : меньше загаданного");
        }
    }
}
