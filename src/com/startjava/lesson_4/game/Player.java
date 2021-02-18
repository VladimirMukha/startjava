package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int index;
    private int[] enteredNumbers;

    public Player(String name) {
        this.name = name;
        enteredNumbers = new int[10];
    }

    public String getName() {
        return name;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int[] getEnteredNumbers() {
        return Arrays.copyOf(enteredNumbers, index);
    }

    public void setEnteredNumber(int enteredNumber) {
        this.enteredNumbers[index] = enteredNumber;
        index++;
    }
}