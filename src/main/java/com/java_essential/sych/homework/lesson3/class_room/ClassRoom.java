package com.java_essential.sych.homework.lesson3.class_room;

public class ClassRoom {


    public ClassRoom(Pupil pupil) {
        pupil.study();
        pupil.read();
        pupil.write();
        pupil.relax();
    }

    public ClassRoom(Pupil pupil, ExcelentPupil exPupil) {
        pupil.study();
        pupil.read();
        pupil.write();
        pupil.relax();

        exPupil.study();
        exPupil.read();
        exPupil.write();
        exPupil.read();


    }
}
