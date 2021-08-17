package com.java_essential.sych.homework.lesson6.animals;

public enum Animals {
    MOSQUITO(1), WOLF(15), WHALE(35), ELEPHANT(80);

    private int year;

    Animals(int year) {
        this.year = year;
    }


    @Override
    public String toString() {
        return this.name() + ": year = " + year;
    }
}
