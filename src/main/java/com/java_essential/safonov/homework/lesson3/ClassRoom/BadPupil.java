package com.java_essential.safonov.homework.lesson3.ClassRoom;

public class BadPupil extends Pupil{
    @Override
    public void study() {
        System.out.println("Константин");
    }

    @Override
    public void read() {
        System.out.println("Читает Литературу");
    }

    @Override
    public void write() {
        System.out.println("Пишет записки");
    }

    @Override
    public void relax() {
        System.out.println("Не отдыхвет");
    }
}
