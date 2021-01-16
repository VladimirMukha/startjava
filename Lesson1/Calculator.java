public class Calculator {
    public static void main(String[] args) {
      int a = 15;
      int b = 100; 
      char sign = '-';
      if (sign == '+') {
        System.out.println(a + b );
      } else if (sign == '-') {
         System.out.println(a - b);
      }
     
      sign = '*';
      if (sign == '*') {
        System.out.println(a * b);
      } else if (sign == '/') {
        System.out.println(a / b);
      }
     
      sign = '^';
      if (sign == '%') {
         System.out.println(a % b);
      } else if (sign == '^') {
         System.out.println(a ^ b);
      }
   }
}
