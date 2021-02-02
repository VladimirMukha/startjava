import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        String nameOne = scanner.next();
        System.out.print("Введите имя второго игрока: ");
        String nameTwo = scanner.next();
        System.out.println(nameOne + " and " + nameTwo + " Beginning! ");

        GuessNumber game = new GuessNumber(new Player(nameOne), new Player(nameTwo));
        String answer = "";

        do {
            game.start();
            answer = "";// <--ничего на ум не идет как  обойтись без этого((
            while (!answer.equals("да") && !answer.equals("нет")) {
                System.out.print("Хотите продолжить игру? [да/нет]:"); //<-- "Эта надпись должна быть после каждого хода 
               answer = scanner.next();                                //или в конце игры? а если после каждорго хода то я не понял как ее 
            }                                                          // можно в клинить в цикл в методе старт с класса GuessNumberTest
        } while (!answer.equals("нет"));
    }
}
