package com.java_essential.oselskyi.homework.lesson3.task1;


public class ClassRoom {
    Pupil[] pupils = new Pupil[4];
    String numberOfClassRoom;

    public ClassRoom(String numberOfClassRoom, Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4) {
        this.numberOfClassRoom = numberOfClassRoom;
        pupils[0] = pupil1;
        pupils[1] = pupil2;
        pupils[2] = pupil3;
        pupils[3] = pupil4;

    }

    public ClassRoom(String numberOfClassRoom, Pupil pupil1, Pupil pupil2, Pupil pupil3) {
        this.numberOfClassRoom = numberOfClassRoom;
        pupils[0] = pupil1;
        pupils[1] = pupil2;
        pupils[2] = pupil3;
    }

    public ClassRoom(String numberOfClassRoom, Pupil pupil1, Pupil pupil2) {
        this.numberOfClassRoom = numberOfClassRoom;
        pupils[0] = pupil1;
        pupils[1] = pupil2;

    }

    public void showInfoAboutClassroom() {
        System.out.println("Класс - " + numberOfClassRoom);
        for (Pupil pupil :
                pupils) {
            if (pupil != null) {
                pupil.showPupilInfo();
            }
        }
        System.out.println("-------------------");
    }

}
