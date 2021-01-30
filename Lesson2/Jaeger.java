public class Jaeger {
    private double height;
    private int strength;
    private String mark;
    private double bounce;

    public Jaeger(double height, int strength, String mark, double bounce) {
        this.height = height;
        this.strength = strength;
        this.mark = mark;
        this.bounce = bounce;
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