package com.startjava.lesson_4.game;

public class Player {
    private String name;
    private int number;
    public int[] playNumberArray;

    public Player(String name) {
        this.name = name;
        playNumberArray = new int[10];
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

