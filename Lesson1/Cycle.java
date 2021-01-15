public class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.print(i + " ");
        }

        int i = 6;
        System.out.println();
        while (i >= -6) {
            System.out.print(i + " ");
            i -= 2;
        }
        
        int number = 10;
        int result = 0;
        do {
            if (number % 2 == 1) {
                result += number;
            }
            number++;
        } while (number < 20);
        System.out.println("\n" + result);
    }
}