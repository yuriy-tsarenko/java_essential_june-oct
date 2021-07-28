package com.java_essential.kvirikadze.homework.lesson3.issue1;

import static java.lang.String.format;

public class ClassRoom {
    private Pupil[] pupils = new Pupil[4];
    private String name;

    public ClassRoom(String name, Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4) {
        this.name = name;
        this.pupils[0] = pupil1;
        this.pupils[1] = pupil2;
        this.pupils[2] = pupil3;
        this.pupils[3] = pupil4;
    }

    public ClassRoom(String name, Pupil pupil1, Pupil pupil2, Pupil pupil3) {
        this(name, pupil1, pupil2, pupil3, null);
    }

    public ClassRoom(String name, Pupil pupil1, Pupil pupil2) {
        this(name, pupil1, pupil2, null, null);
    }

    public ClassRoom(String name, Pupil pupil1) {
        this(name, pupil1, null, null, null);
    }

    public void showClassRoom() {
        System.out.format("Учебный класс: %s\n", name);
        for (Pupil pupil: pupils) {
            if (pupil != null) {
                pupil.printAbout();
            }
        }
        System.out.print("---------------------------\n\n");
    }
}
