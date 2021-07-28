package com.java_essential.kvirikadze.homework.lesson3.issue1;

public class Main {
    public static void main(String[] args) {
        ClassRoom room1 = new ClassRoom("Класс 1",
                new BadPupil("Вася"),
                new GoodPupil("Дима"),
                new ExcellentPupil("Настя"),
                new Pupil("Валера"));
        room1.showClassRoom();

        ClassRoom room2 = new ClassRoom("Класс 2",
                new BadPupil("Коля"),
                new GoodPupil("Кирилл"));
        room2.showClassRoom();

        ClassRoom room3 = new ClassRoom("Класс 3",
                new Pupil("Дмитрий"),
                new ExcellentPupil("Степан"),
                new GoodPupil("Зина"));
        room3.showClassRoom();

        ClassRoom room4 = new ClassRoom("Класс 4",
                new GoodPupil("Катя"));
        room4.showClassRoom();
    }
}
