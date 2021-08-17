package com.java_essential.oselskyi.homework.lesson3.task1;

public class ExcelentPupil extends Pupil {
    public ExcelentPupil(String name) {
        super(name);
    }

    @Override
    void study() {
        System.out.print("Очень хорошо учится. ");
    }

    @Override
    void read() {
        System.out.print("Читает много полезных книг. ");
    }

    @Override
    void write() {
        System.out.print("Много пишет. ");
    }

    @Override
    void relax() {
        System.out.print("Редко отдыхает. ");
    }

}
