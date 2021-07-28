package com.java_essential.examples.lesson4.interfaces.ex006_interfaces;

import java.time.LocalTime;

/**
 * Наследование абстрактных классов от интерфейсов.
 */
interface Interface {
    void someTask(int secondDuration);

    void execute();

    static void someWork() {
        System.out.println("some work");
    }
}

abstract class AbstractClass implements Interface {

    // Реализация абстрактного метода из интерфейса, в абстрактном классе не обязательна.
    @Override
    public abstract void someTask(int secondDuration);

    @Override
    public final void execute() {
        System.out.println("some work...");
    }
}

class Competition extends AbstractClass {

    @Override
    public void someTask(int secondDuration) {
        int secondCurrent = LocalTime.now().getSecond();
        int endOfTask = secondCurrent + secondDuration;
        int count = 0;
        while (endOfTask > LocalTime.now().getSecond()) {
            execute();
            count++;
        }
        System.out.println("task executed, the total number of iterations is: " + count);
    }
}

public class Main {
    public static void main(String[] args) {
        Interface instance = new Competition();
        instance.someTask(5);
    }
}
