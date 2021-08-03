package com.java_essential.kalinichenko.homework.lesson3.ex_2;

public class Pupil {

    void study() {
        System.out.print(" ");
    }

    void read() {
        System.out.print(" ");
    }

    void write() {
        System.out.print(" ");
    }

    void relax() {
        System.out.println(" ");
    }

    void pupilsMethod() {
        study();
        System.out.print(", ");
        read();
        System.out.print(", ");
        write();
        System.out.print(", ");
        relax();
    }
}

class ExcellentPupil extends Pupil {
    @Override
    void study() {
        System.out.print("Excellent study");
    }

    @Override
    void read() {
        System.out.print("Excellent read");
    }

    @Override
    void write() {
        System.out.print("Excellent write");
    }

    @Override
    void relax() {
        System.out.println("Relax a little");
    }
}

class GoodPupil extends Pupil {

    @Override
    void study() {
        System.out.print("Good study");
    }

    @Override
    void read() {
        System.out.print("Good read");
    }

    @Override
    void write() {
        System.out.print("Good write");
    }

    @Override
    void relax() {
        System.out.println("Relax enough");
    }
}

class BadPupil extends Pupil {

    @Override
    void study() {
        System.out.print("Bad study");
    }

    @Override
    void read() {
        System.out.print("Bad read");
    }

    @Override
    void write() {
        System.out.print("Bad write");
    }

    @Override
    void relax() {
        System.out.println("Relax a lot");
    }
}

