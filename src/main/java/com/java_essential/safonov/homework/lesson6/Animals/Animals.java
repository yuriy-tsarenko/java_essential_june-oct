package com.java_essential.safonov.homework.lesson6.Animals;

public enum Animals {

    ANIMALS(1), ANIMALS1(2), ANIMALS2(3), ANIMALS3(4);

    private int year;

    Animals(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return this.name() + ": year = " + year;
    }

}
