public class Jaeger {
    private double height;
    private int strength;
    private String mark;
    private double bounce;

    public Jaeger() {
        height = 40.5;
        strength = 760;
        mark = "Марк-М2";
        bounce = 20.5;
    }

    public double getBounce() {
        return bounce;
    }

    public void setBounce(double bounce) {
        this.bounce = bounce;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void powerMove() {
        System.out.println("Мощный рывок!");
    }

    public void openFire() {
        System.out.println("Открыт огонь!");
    }

    public void refueling() {
        System.out.println("Идет заправка! 1-2-3 Заправка завершена!");
    }
}