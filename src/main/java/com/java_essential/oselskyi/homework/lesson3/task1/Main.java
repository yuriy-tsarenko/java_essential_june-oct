package com.java_essential.oselskyi.homework.lesson3.task1;

public class Main {


    public static void main(String[] args) {
        ClassRoom classRoom = new ClassRoom("7Б: ", new GoodPupil("Даша"),
                new ExcelentPupil("Света"));
        ClassRoom classRoom5 = new ClassRoom("5A: ",
                new GoodPupil("Соня"), new ExcelentPupil("Иван"),
                new BadPupil("Саша"), new Pupil("Коля"));

        classRoom.showInfoAboutClassroom();
        classRoom5.showInfoAboutClassroom();

    }
}
