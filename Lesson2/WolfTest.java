public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setSex = 'K';
        wolf.setNickName = "Storm";
        wolf.setWeight = 35;
        wolf.setAge = 7;
        wolf.setColor = "Grey";

        System.out.println("1 : " + wolf.getSex + " Кличка: " + wolf.getNickName + " вес: " + " " + wolf.getWeight + " возраст: " + wolf.getAge + " цвет :" + wolf.getColor);

        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunts();
    }
}