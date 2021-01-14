 public class ConditionalStatement{

 public static void main(String [] args) {
        int age = 18;
        double height = 1.70;
        char firstLetterOfName = 'M';
        boolean male = true;

        if (age > 20) {

            System.out.println("Уже взрослый ");

        }
        if (male) {

            System.out.println();

            System.out.println("Мужчина");

        }
        if (!male) {

            System.out.println("Женщина");

        }
        if (height < 1.80) {

            System.out.println("Пригоден для службы в танковых");

        } else {

            System.out.println("Не пригоден");

        }
        if (firstLetterOfName == 'M') {

            System.out.println("Максим");

        } else if (firstLetterOfName == 'I') {

            System.out.println("Не Максим");

        } else {

            System.out.println("Кто-то еще");

        }
  }
 }

