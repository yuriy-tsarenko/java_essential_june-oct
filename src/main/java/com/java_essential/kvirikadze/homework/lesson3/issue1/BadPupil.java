package com.java_essential.kvirikadze.homework.lesson3.issue1;

public class BadPupil extends Pupil {
    public BadPupil(String name) {
        super(name);
    }

    void study() {
        System.out.println("Плохо учится");
    }

    void read() {
        System.out.println("Мало читает");
    }

    void write() {
        System.out.println("Ничего не записывает");
    }

    void relax() {
        System.out.println("Все время отдыхает");
    }

}
