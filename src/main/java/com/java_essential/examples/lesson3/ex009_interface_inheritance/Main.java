package com.java_essential.examples.lesson3.ex009_interface_inheritance;

/**
 * Наследование.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------SomeClassChild-----------------------------");
        SomeClassChild instance = new SomeClassChild();
        instance.method1();
        // UpCast
        System.out.println("----------------------SomeInterface1-----------------------------");
        SomeInterface1 instanceUp1 = instance;
        instanceUp1.method1();
//         instanceUp1.method2(); // Error
//         instanceUp1.method3(); // Error
        System.out.println("----------------------SomeInterface2-----------------------------");
        // UpCast
        SomeInterface2 instanceUp2 = instance;
        instanceUp2.method2();
        // instanceUp2.method1(); // Error
        // instanceUp2.method3(); // Error
        System.out.println("----------------------SomeInterface3-----------------------------");
        // UpCast
        SomeInterface3 instanceUp3 = instance;
        instanceUp3.method3();
        // instanceUp3.method1(); // Error
        // instanceUp3.method2(); // Error
        System.out.println("----------------------NewInterface-----------------------------");
        NewInterface instanceUp4 = instance;
        instanceUp4.method1();
        instanceUp4.method2();
        instanceUp4.method3();
        System.out.println("----------------------DownCast-----------------------------");
        // DownCast
        SomeClass instanceDown = (SomeClass) instanceUp1;
        instanceDown.method1();
        instanceDown.method2();
        instanceDown.method3();
    }
}
