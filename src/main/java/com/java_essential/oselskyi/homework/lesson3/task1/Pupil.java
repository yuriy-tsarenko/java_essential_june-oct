package com.java_essential.oselskyi.homework.lesson3.task1;


public class Pupil {
    String name;

    public Pupil(String name) {
        this.name = name;
    }

    void study() {
        System.out.print("Учится. ");
    }

    void read() {
        System.out.print("Читает. ");
    }

    void write() {
        System.out.print("Пишет. ");
    }

    void relax() {
        System.out.print("Отдыхает. ");
    }

    void showPupilInfo() {
        System.out.println("Ученик: " + name);
        study();
        read();
        write();
        relax();
        System.out.println("\n");
    }
}
