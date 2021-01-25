public class Calculator {
    public void calculate(double a, char operation, double b) {
        double result = 0;

        switch (operation) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '^':
                double exponentiation = 1;
                for (int i = 0; i < b; i++) {
                    exponentiation *= a;
                }
                System.out.println(exponentiation);
                break;
            case '%':
                result = a % b;
                System.out.println(result);
                break;
        }
    }
}