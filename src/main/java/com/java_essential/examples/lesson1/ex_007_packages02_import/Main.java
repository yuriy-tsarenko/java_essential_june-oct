package com.java_essential.examples.lesson1.ex_007_packages02_import;

import com.java_essential.examples.lesson1.ex_004_method_calling.Car;
import com.java_essential.examples.lesson1.ex_006_packages01.Animal;
import com.java_essential.examples.lesson1.ex_006_packages01.Dog;
// TODO: avoid star import
//import com.cbs.java_essential.examples.lesson1.ex_006_packages01.*;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Car", 100, 2020, 250);
        Dog dog = new Dog();
        Animal animal = new Animal();
    }
}
