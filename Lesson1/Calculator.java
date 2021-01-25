public class Calculator {
    
    public bouble calculations(double a, char operation, double b ){
        double result = 0;

        switch(operation){
          case '+': result = a+b;
          break;
          case '-': result = a-b;
          break;
          case '*': result = a*b;
          break;
          case '/': result = a/b;
          break;
        }
    }
}