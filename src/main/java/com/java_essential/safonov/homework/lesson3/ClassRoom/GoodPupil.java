package com.java_essential.safonov.homework.lesson3.ClassRoom;

public class GoodPupil extends Pupil{
    @Override
    public void study() {
        System.out.println("Николай");
    }

    @Override
    public void read() {
        System.out.println("Читает комиксы");
    }

    @Override
    public void write() {
        System.out.println("Пишет мемуары");
    }

    @Override
    public void relax() {
        System.out.println("Отдыхвет у подруги");
    }
}
