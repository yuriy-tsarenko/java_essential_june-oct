package com.java_essential.safonov.homework.lesson3.ClassRoom;

public class ExcelentPupil extends Pupil{
    @Override
    public void study() {
        System.out.println("Сергей");
    }

    @Override
    public void read() {
        System.out.println("Читает журнал");
    }

    @Override
    public void write() {
        System.out.println("Пишет стихи");
    }

    @Override
    public void relax() {
        System.out.println("Отдыхвет на море");
    }
}
