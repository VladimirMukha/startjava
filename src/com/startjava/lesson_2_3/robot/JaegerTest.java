package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
         Jaeger jaegerM4 = new Jaeger(32.5, 500, "Mark7", 100);

        System.out.println("�������� �� ������������. - ����� ������: " + jaegerM4.getMark() + " ������ ������: "
                + jaegerM4.getHeight() + " ����: " + jaegerM4.getStrength() + " ������: " + jaegerM4.getBounce());

        jaegerM4.powerMove();
        jaegerM4.openFire();

        System.out.println("---------------------------------------------------------------------");
        jaegerM4.setHeight(35.5);
        jaegerM4.setMark("����-4");
        jaegerM4.setStrength(1000);
        jaegerM4.setBounce(100);

        System.out.println("����� ������: " + jaegerM4.getMark() + " ������ ������: " + jaegerM4.getHeight() +
                " ����: " + jaegerM4.getStrength() + " ������: " + jaegerM4.getBounce());

        jaegerM4.openFire();
        jaegerM4.powerMove();
        jaegerM4.setStrength(1300);
        jaegerM4.setBounce(300);

        System.out.println("������: " + jaegerM4.getBounce() + " ����: " + jaegerM4.getStrength());
        System.out.println("--------------------------------------------------------------------");

       Jaeger jaegerM6 = new Jaeger(50.2, 600, "Mark1", 15.2);

        System.out.println("�������� �� ������������: ����� ������: " + jaegerM6.getMark() +
                " ������  ������: " + jaegerM6.getBounce() + " ������ ������ " + jaegerM6.getHeight() +
                "���� ������ :" + jaegerM6.getStrength());
        System.out.println("--------------------------------------------------------------------");

        jaegerM6.setHeight(39.5);
        jaegerM6.setBounce(120);
        jaegerM6.setStrength(1100);
        jaegerM6.setMark("����-6");

        System.out.println("����� ������: " + jaegerM6.getMark() + " ������  ������: " + jaegerM6.getBounce() +
                " ������ ������ " + jaegerM6.getHeight());

        jaegerM6.openFire();
        jaegerM6.powerMove();
        jaegerM6.refueling();
        jaegerM6.setStrength(1400);
        jaegerM6.setBounce(150);

        System.out.println("����: " + jaegerM6.getStrength() + " ������ ������ : " + jaegerM6.getBounce());
    }
}