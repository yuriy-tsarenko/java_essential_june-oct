package com.java_essential.examples.lesson3.ex011_final_class;

final class FinalClass {
    public int firstValue;
    public int secondValue;
}

// Попытка наследования от FinalClass приводит к ошибке компилятора.
class DerivedClass { //extends FinalClass {   // Error
}

public class Main {
    public static void main() {
        FinalClass instance = new FinalClass();
        instance.firstValue = 100;
        instance.secondValue = 200;

        System.out.println("x = " + instance.firstValue + "y = " + instance.secondValue);
    }
}