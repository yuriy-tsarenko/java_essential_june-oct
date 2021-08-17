package com.java_essential.examples.lesson8;


import com.java_essential.examples.lesson8.example.Bike;
import com.java_essential.examples.lesson8.example.Vehicle;

public class Main {
    public static void main(String[] args) {
        FinalDemo demo = new FinalDemo(new Bike(123, "bike", new Vehicle(456, "vehicle")));

        System.out.println(demo);

        demo.setBikeId(765);

        System.out.println(demo);

        demo.getBike().setName("test");

        System.out.println(demo);

    }
}
