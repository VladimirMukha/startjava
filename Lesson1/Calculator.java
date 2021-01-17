public class Calculator {
    public static void main(String[] args) {
        int a = 6;
        int b = 3;
        char sign = '/';
        
        if (sign == '+') {
            System.out.println(a + b);
        } else if (sign == '-') {
            System.out.println(a - b);
        } else if (sign == '*') {
            System.out.println(a * b);
        } else if (sign == '/') {
            System.out.println(a / b);
        } else if (sign == '%') {
            System.out.println(a % b);
        } else if (sign == '^') {
            int result = 1;
            for (int i = 0; i < b; i++) {
                result *= a;
            }
            System.out.println(result);
        }
    }
}