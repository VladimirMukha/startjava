public class Wolf {
    private char sex;
    private String nickName;
    private double weight;
    private int age;
    private String color; 

    public char getSex() {
       return sex;
    }

    public String getNickName() {
       return nickName;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else
            this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void go() {
    }

    public void sit() {
    }

    public void run() {
    }

    public void howl() {
    }

    public void hunts() {
    }
}