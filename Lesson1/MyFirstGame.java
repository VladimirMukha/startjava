public class MyFirstGame {
     public static void main(String[] args) {
        int secretKey = 30;
        int numberPlayer = 40;
        
        for (int i = 0; i <= 100; i++) {
            if (numberPlayer == secretKey) {
                System.out.println("Вы угадали! " + secretKey);
                break;
            } else if (numberPlayer > secretKey) {
                System.out.println("Введенное вами число больше того, что загадал компьютер! " + numberPlayer);
                numberPlayer--;
            } else if (numberPlayer < secretKey) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер! " + numberPlayer);
                numberPlayer++;
            }
        }
    }
}