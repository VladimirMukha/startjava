public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.sex = 'K';
        wolf.nickName = "Storm";
        wolf.weight = 35;
        wolf.age = 7;
        wolf.color = "Grey";

        System.out.println("1 : " + wolf.sex + " Кличка: " + wolf.nickName + " вес: " + " " + wolf.weight + " возраст: " + wolf.age + " цвет :" + wolf.color);

        wolf.go();

        wolf.sit();

        wolf.run();

        wolf.howl();

        wolf.hunts();
    }
}