package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int index;
    private int[] enteredNumber;

    public Player(String name) {
        this.name = name;
        enteredNumber = new int[10];
    }

    public String getName() {
        return name;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int[] getEnteredNumbers() {

        return Arrays.copyOf(enteredNumber, enteredNumber.length);
    }

    public void setEnteredNumbers(int enteredNumber) {
        this.enteredNumber[index] = enteredNumber;
        index++;
    }
}

