package com.java_essential.examples.lesson1.ex_002_access_modifiers;


public class Shape {

    private int lengthSecond;
    private long height;
    public double square;

    public Shape() {
    }

    public int getLength() {
        return lengthSecond;
    }

    public void setLength(int length) {
        this.lengthSecond = length;
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public void viewShape() {
        System.out.println("Height: " + height);
        System.out.println("Length: " + lengthSecond);
    }
}
