package com.java_essential.oselskyi.homework.lesson3.task1;

public class BadPupil extends Pupil {
    public BadPupil(String name) {
        super(name);
    }

    @Override
    void study() {
        System.out.print("плохо учится ");
    }

    @Override
    void read() {
        System.out.print("практически не читает ");
    }

    @Override
    void write() {
        System.out.print("ничего не хочет писать ");
    }

    @Override
    void relax() {
        System.out.print("очень много отдыхает ");
    }


}
