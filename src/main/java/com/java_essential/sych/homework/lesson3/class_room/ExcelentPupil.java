package com.java_essential.sych.homework.lesson3.class_room;

public class ExcelentPupil extends Pupil {
    public ExcelentPupil(String name) {
        super(name);

    }

    @Override
    public void study() {
        System.out.println("Вундеркінд");
    }

    @Override
    public void read() {
        System.out.println("Майстер спорту по читанню");
    }

    @Override
    public void write() {
        System.out.println("Письменник");
    }

    @Override
    public void relax() {
        System.out.println("Трудоголік");

    }
}
