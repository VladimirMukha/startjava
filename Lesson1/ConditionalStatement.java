public class ConditionalStatement{ 

     public static void main(String[] args) {
       
        int age = 18;
        if (age > 20) {
            System.out.println("��� �������� ");
        }
        boolean male = true;
        if (male) {
            System.out.println("�������");
        }
        if (!male) {
            System.out.println("�������");
        }
        double height = 1.70;
        if (height < 1.80) {
            System.out.println("�������� ��� ������ �    ��������");
        } else {
            System.out.println("�� ��������");
        }
        char firstLetterOfName = 'M';
        if (firstLetterOfName == 'M') {
            System.out.println("������");
        } else if (firstLetterOfName == 'I') {
            System.out.println("�� ������");
        } else {
            System.out.println("���-�� ���");
        }
    }
 }

