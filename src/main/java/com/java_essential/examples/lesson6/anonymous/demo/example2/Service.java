package com.java_essential.examples.lesson6.anonymous.demo.example2;

import com.java_essential.examples.lesson6.anonymous.demo.example1.Vehicle;

public class Service {


    public String getResult() {
        Vehicle ship = new Vehicle() {
            @Override
            public void runEngine() {
                //code
            }

            @Override
            public String createStatistic() {
                //code
                return null;
            }
        };

        return ship.createStatistic();
    }
}
