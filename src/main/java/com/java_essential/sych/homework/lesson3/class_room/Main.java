package com.java_essential.sych.homework.lesson3.class_room;

public class Main {
    public static void main(String[] args) {
        ClassRoom student1 = new ClassRoom(new Pupil("Степан"));
        ClassRoom student2 = new ClassRoom(new ExcelentPupil("Антон"));
        ClassRoom student3 = new ClassRoom(new GoodPupil("Дарина"));
        ClassRoom student4 = new ClassRoom(new BadPupil("Василь"));
        System.out.println("---------------------------");
        ClassRoom newClass = new ClassRoom(new Pupil("Марія"), new ExcelentPupil("Анна"));


    }
}
