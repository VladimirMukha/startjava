import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        POINT:
        while (true) {
            System.out.print("Введите первое число: ");
            int a = sc.nextInt();
            System.out.print("Введите знак математической операции: ");
            char sign = sc.next().charAt(0);
            System.out.print("Введите второе число: ");
            int b = sc.nextInt();
            calculator.calculations(a, sign, b);

            while (true) {
                System.out.println("Хотите продолжить вычисления? [да/нет]");
                String answer = sc.next();
                if (answer.equals("нет")) {
                    break POINT;
                } else if (answer.equals("да")) {
                    continue POINT;
                }
            }
        }
    }
}

