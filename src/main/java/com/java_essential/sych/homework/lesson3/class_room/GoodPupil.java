package com.java_essential.sych.homework.lesson3.class_room;

public class GoodPupil extends Pupil {
    public GoodPupil(String name) {
        super(name);

    }

    @Override
    public void study() {
        System.out.println("Добре  вчиться");
    }

    @Override
    public void read() {
        System.out.println("Вміє читати, але повільно");
    }

    @Override
    public void write() {
        System.out.println("Добре  пише");
    }

    @Override
    public void relax() {
        System.out.println("Не проти відпочити");
    }
}
