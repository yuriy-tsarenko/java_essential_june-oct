package com.java_essential.kalinichenko.homework.lesson3.ex_2;

public class Main {
    public static void main(String[] args) {
        Pupil pupil1 = new BadPupil();
        Pupil pupil2 = new GoodPupil();
        Pupil pupil3 = new ExcellentPupil();
        Pupil pupil4 = new GoodPupil();

        ClassRoom room = new ClassRoom(pupil1, pupil2, pupil3, pupil4);
        room.showClassRoom();
        System.out.println();
        ClassRoom room2 = new ClassRoom(pupil1, pupil2);
        room2.showClassRoom();
        System.out.println();
        ClassRoom room3 = new ClassRoom(pupil3, pupil4, pupil4);
        room3.showClassRoom();
        System.out.println();
        ClassRoom room4 = new ClassRoom(pupil3, pupil4, pupil4, pupil1, pupil2);
        room4.showClassRoom();
    }

}
