public class Calculator {
    public void calculations(double a, char operation, double b) {
        double result = 0;

        switch (operation) {
            case '+':
                result = a + b;
                System.out.println(result);
                break;
            case '-':
                result = a - b;
                System.out.println(result);
                break;
            case '*':
                result = a * b;
                System.out.println(result);
                break;
            case '/':
                result = a / b;
                System.out.println(result);
                break;
            case '^':
                double tmp = 1;
                for (int i = 0; i < b; i++) {
                    tmp *= a;
                }
                System.out.println(tmp);
                break;
            case '%':
                result = a % b;
                System.out.println(result);
                break;
        }
    }
}