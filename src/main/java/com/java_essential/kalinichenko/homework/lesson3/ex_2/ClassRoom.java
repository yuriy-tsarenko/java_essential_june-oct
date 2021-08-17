package com.java_essential.kalinichenko.homework.lesson3.ex_2;

import javax.sound.midi.Soundbank;

public class ClassRoom {
    Pupil [] p;

    public ClassRoom (Pupil ... p) {
        this.p = p;
    }

    public void showClassRoom() {
        if (p.length <= 4) {
            System.out.println("There are 4 pupils in the classroom: ");
            for (Pupil temp : p) {
                temp.pupilsMethod();
            }
            if (p.length < 4) {
                System.out.println("There is no information about other pupils (another pupil).");
            }
        } else System.out.println("Error: There must be 4 pupils in the classroom");
    }
}
