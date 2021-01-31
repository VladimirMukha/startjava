import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        String nameOne = scanner.next();
        System.out.print("Введите имя второго игрока: ");
        String nameTwo = scanner.next();
        System.out.println(nameOne + " and " + nameTwo + " Beginning! ");

        GuessNumber guessNumberOne = new GuessNumber(new Player(nameOne), new Player(nameTwo));

        System.out.print("Первый игрок введите число: ");

        guessNumberOne.playerOne.setNumber(scanner.nextInt());
        int numberOnePlayer = guessNumberOne.playerOne.getNumber();

        System.out.println("Первый игрок ввел: " + numberOnePlayer);
        System.out.print("Второй игрок введите число:  ");

        guessNumberOne.playerTwo.setNumber(scanner.nextInt());
        int numberTwoPlayer = guessNumberOne.playerTwo.getNumber();

        System.out.println("Второй игрок ввел: " + numberTwoPlayer);

        Random random = new Random();
        int targetNumber = random.nextInt(100);
        guessNumberOne.startGame(targetNumber);
    }
}
