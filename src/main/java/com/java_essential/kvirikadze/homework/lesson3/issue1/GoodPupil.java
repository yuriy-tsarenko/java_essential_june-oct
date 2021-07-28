package com.java_essential.kvirikadze.homework.lesson3.issue1;

public class GoodPupil extends Pupil {
    public GoodPupil(String name) {
        super(name);
    }

    void study() {
        System.out.println("Неплохо учится");
    }

    void read() {
        System.out.println("Немало читает");
    }

    void write() {
        System.out.println("Почти все записывает");
    }

    void relax() {
        System.out.println("Мало отдыхает");
    }

}
