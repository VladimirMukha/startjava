package com.startjava.lesson_4.game;

public class Player {
    private String name;
    private int index;
    private int[] enteredNumber;

    public Player(String name) {
        this.name = name;
        enteredNumber = new int[10];
    }

    public int[] getEnteredNumber() {
        return enteredNumber;
    }

    public void setEnteredNumber(int enteredNumber) {
        this.enteredNumber[index] = enteredNumber;
        index++;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }
}

