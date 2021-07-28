package com.java_essential.kvirikadze.homework.lesson3.issue1;

public class ExcellentPupil extends Pupil {
    public ExcellentPupil(String name) {
        super(name);
    }

    void study() {
        System.out.println("Замечательно учится");
    }

    void read() {
        System.out.println("Много читает");
    }

    void write() {
        System.out.println("Все записывает");
    }

    void relax() {
        System.out.println("Практически не отдыхает");
    }

}
