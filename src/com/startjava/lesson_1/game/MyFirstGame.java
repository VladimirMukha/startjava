package com.startjava.lesson_1.game;

public class MyFirstGame {
     public static void main(String[] args) {
        int targetNumber = 30;
        int playerNumber = 40;
        
        for (int i = 0; i <= 100; i++) {
            if (playerNumber == targetNumber) {
                System.out.println("�� �������! " + playerNumber);
                break;
            } else if (playerNumber > targetNumber) {
                System.out.println("��������� ���� ����� ������ ����, ��� ������� ���������!! " + playerNumber);
                playerNumber--;
            } else if (playerNumber < targetNumber) {
                System.out.println("��������� ���� ����� ������ ����, ��� ������� ���������!! " + playerNumber);
                playerNumber++;
            }
        }
    }
}