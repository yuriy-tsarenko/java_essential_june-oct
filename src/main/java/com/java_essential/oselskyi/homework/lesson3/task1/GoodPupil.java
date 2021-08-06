package com.java_essential.oselskyi.homework.lesson3.task1;

public class GoodPupil extends Pupil {
    public GoodPupil(String name) {
        super(name);

    }

    @Override
    void study() {
        System.out.print("Хорошо учиться (старается). ");
    }

    @Override
    void read() {
        System.out.print("Читает интересные книги. ");
    }

    @Override
    void write() {
        System.out.print("Пишет немного. ");
    }

    @Override
    void relax() {
        System.out.print("Немного отдыхает. ");
    }


}
