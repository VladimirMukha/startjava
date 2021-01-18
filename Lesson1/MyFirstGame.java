public class MyFirstGame {
     public static void main(String[] args) {
        int targetNumber = 30;
        int playerNumber = 40;
        
        for (int i = 0; i <= 100; i++) {
            if (playerNumber == targetNumber) {
                System.out.println("Вы угадали! " + playerNumber);
                break;
            } else if (playerNumber > targetNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер! " + playerNumber);
                playerNumber--;
            } else if (playerNumber < targetNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер! " + playerNumber);
                playerNumber++;
            }
        }
    }
}