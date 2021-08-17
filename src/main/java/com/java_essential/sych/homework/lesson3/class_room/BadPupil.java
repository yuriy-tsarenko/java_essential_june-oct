package com.java_essential.sych.homework.lesson3.class_room;

public class BadPupil extends Pupil {
    public BadPupil(String name) {
        super(name);
    }

    @Override
    public void study() {
        System.out.println("Погано вчиться");
    }

    @Override
    public void read() {
        System.out.println("Не вміє читатии");
    }

    @Override
    public void write() {
        System.out.println("Ледь пише");
    }

    @Override
    public void relax() {
        System.out.println("Любить відпочити");
    }
}
