package com.java_essential.examples.lesson2;

public class Computer {

    private final Integer id;

    private final String model;

    public Computer(Integer id, String model) {
        this.id = id;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Computer{"
                + "id="
                + id
                + ", model='"
                + model
                + '\''
                + '}';
    }
}
