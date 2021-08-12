package com.java_essential.oksiuta.homework.lesson1.task4;

public class Computer {
    private int pcId;

    public int getPcId() {
        return pcId;
    }

    public void setPcId(int pcId) {
        this.pcId = pcId;
    }

    @Override
    public String toString() {
        return "Computer{"
                + "pcId=" + pcId
                + '}';
    }
}
