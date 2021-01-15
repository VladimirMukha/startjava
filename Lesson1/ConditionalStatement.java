public class ConditionalStatement { 
     public static void main(String[] args) {
        int age = 18;
        if (age > 20) {
            System.out.println("Уже взрослый");
        }
        
        boolean male = true;
        if (male) {
            System.out.println("Мужчина");
        }else if (!male) {
            System.out.println("Женщина");
        }

        double height = 1.70;
        if (height < 1.80) {
            System.out.println("Пригоден для службы в танковых");
        } else {
            System.out.println("Не пригоден");
        }

        char firstLetterOfName = 'M';
        if (firstLetterOfName == 'M') {
            System.out.println("Максим");
        } else if (firstLetterOfName == 'I') {
            System.out.println("Не Максим");
        } else {
            System.out.println("Кто-то еще");
        }
    }
 }

