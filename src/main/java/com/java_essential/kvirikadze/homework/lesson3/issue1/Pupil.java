package com.java_essential.kvirikadze.homework.lesson3.issue1;

import static java.lang.String.format;

public class Pupil {
    private String name;

    public Pupil(String name) {
        this.name = name;
    }

    void study() {
        System.out.println("Как-то учится");
    }

    void read() {
        System.out.println("Кое-что читает");
    }

    void write() {
        System.out.println("Кое-что пишет");
    }

    void relax() {
        System.out.println("Как-то отдыхает");
    }

    void printAbout() {
        System.out.format("Студент %s:\n", this.name);
        study();
        read();
        write();
        relax();
        System.out.println();
    }

}
