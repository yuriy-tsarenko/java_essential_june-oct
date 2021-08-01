package com.java_essential.examples.lesson6.enums.ex003_enumerations;

/**
 * Перечисляемые типы (enum).
 * Коструктор и методы.
 */
enum Company {
    // Экземпляры.
    WEBCAMP(1000, 25),
    GOOGLE(100, 26),
    SKYNET(10, 38); //, TEST, TEST2(1000, "string"); // - Error
    int value;
    int value2;

    // Конструктор может быть только private.
    Company(int value, int value2) {
        this.value = value;
        this.value2 = value2;
    }

    public int getValue() {
        return value;
    }

    public int getValue2() {
        return value2;
    }
}

public class Main {
    public static void main(String[] args) {
        Company myComp = Company.WEBCAMP;
        System.out.println("Я работаю в компании " + myComp + " и зарабатываю " + myComp.getValue() + "$ в месяц."
                + myComp.value2);
    }
}
