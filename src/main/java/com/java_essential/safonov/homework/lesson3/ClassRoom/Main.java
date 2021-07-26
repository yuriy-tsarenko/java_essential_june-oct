package com.java_essential.safonov.homework.lesson3.ClassRoom;

public class Main {
    public static void main(String[] args) {

        ClassRoom classRoom = new ClassRoom(new Pupil());
        ClassRoom classRoom1 = new ClassRoom(new ExcelentPupil());
        ClassRoom classRoom2 = new ClassRoom(new GoodPupil());
        ClassRoom classRoom3 = new ClassRoom(new BadPupil());
        System.out.println("---------------------------");
        ClassRoom newClass = new ClassRoom(new Pupil(), new ExcelentPupil());

    }
}
