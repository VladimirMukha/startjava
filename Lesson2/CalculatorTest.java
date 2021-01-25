import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        String not = "нет";
        String answer = null;
        while (!not.equals(answer)) {
            System.out.print("Введите первое число: ");
            int a = sc.nextInt();
            System.out.print("Введите знак математической операции: ");
            char sign = sc.next().charAt(0);
            System.out.print("Введите второе число: ");
            int b = sc.nextInt();
            calculator.calculate(a,sign,b);
            System.out.println("Хотите продолжить [да/нет]");
            answer = sc.next();
            if (answer.equals("да")) {
                continue;
            }
            while (!not.equals(answer) && !answer.equals("да")) {
                System.out.println("Хотите продолжить вычисления? [да/нет]");
                answer = sc.next();
            }
        }
    }
}
