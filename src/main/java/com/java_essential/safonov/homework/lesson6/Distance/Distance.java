package com.java_essential.safonov.homework.lesson6.Distance;


public class Distance {
    public static double distance;

    public void print() {
        System.out.println("Длина " + distance);
    }


    public static class Converter {

        public double from_MOfKm(double km) {
            distance = km / 1000;
            return distance;
        }

        public double from_SmOfM(double m) {
            distance = m / 100;
            return distance;
        }

        public double from_MmOfSm(double sm) {
            distance = sm / 10;
            return distance;
        }
    }
}
