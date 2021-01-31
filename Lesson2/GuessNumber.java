import java.util.Scanner;

public class GuessNumber {
    private static final Scanner scanner = new Scanner(System.in);
    public Player playerOne;
    public Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    String answer = "";
    public void startGame(int targetNumber) {
        int playerNumberOne = playerOne.getNumber();  //<---лучше делать переменные?
        int playerNumberTwo = playerTwo.getNumber();

        do {
            if (targetNumber == playerOne.getNumber()) { //<----или сразу получать значения через метод?
                System.out.println("Первый игрок выиграл!!!");
                break;
            } else if (targetNumber == playerNumberTwo) {  //<-----переменная
                System.out.println("Второй игрок выиграл!!!");
                break;
            }
            if (playerNumberOne > targetNumber) {
                System.out.println("Выбранное  число первым игроком : больше загаданного");
            }
            if (playerNumberTwo > targetNumber) {
                System.out.println("Выбранное число  вторым игроком : больше загаданного");
            }
            if (playerNumberOne < targetNumber) {
                System.out.println("Выбранное число первым  игроком : меньше загаданного ");

            }
            if (playerNumberTwo < targetNumber) {
                System.out.println("Выбранное  число вторым   игроком : меньше загаданного");
            }

            while (!answer.equals("да") && !answer.equals("нет")) {
                System.out.println("Хотите продолжить игру? [да/нет]");
                answer = scanner.next();
            }
            if (answer.equals("да")) {
                System.out.print("Первый игрок введите число: ");
                playerNumberOne = scanner.nextInt();
                System.out.print("Второй игрок введите число: ");
                playerNumberTwo = scanner.nextInt();
                answer = "";
            }
        } while (!answer.equals("нет"));
    }
}





