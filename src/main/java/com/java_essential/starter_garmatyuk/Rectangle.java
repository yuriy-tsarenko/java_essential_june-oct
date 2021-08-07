package com.java_essential.starter_garmatyuk;

public class Rectangle {
    public static void main(String[] args) {
        String star = "*";
        String space = " ";
        int height = 7;
        int width = 14;
        // Прямоугольник
        System.out.println("Прямоугольник");
        for (int i = 1; i < height; i++) {
            for (int j = 1; j < width; j++) {
                System.out.print(star);
            }
            System.out.println();
        }
        //Прямоугольный треугольник rectangular triangle
        System.out.println("Прямоугольный треугольник");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(star);
            }
            System.out.println();
        }

        //reverse Прямоугольный треугольник
        System.out.println("Прямоугольный треугольник II");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (j + i < height) {
                    System.out.print(space);
                } else {
                    System.out.print(star);
                }
            }
            System.out.println();
        }

        // Равносторонний треугольник equilateral triangle
        System.out.println("Равносторонний треугольник");
        int factor = ((width - 1) / 2) + 1;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j < factor || j + factor > width) {
                    System.out.print(space);
                } else {
                    System.out.print(star);
                }
            }
            factor--;
            System.out.println();

        }

        // Равносторонний треугольник equilateral triangle  Optimized
        System.out.println("Равносторонний треугольник Optimized");
        for (int i = 1; i < height; i++) {
            for (int j = 1; j < width; j++) {
                if (j + i > width) {
                    System.out.print(star);
                }
                System.out.print(space);
            }
            System.out.println();
        }

        //Ромб Diamond
        System.out.println("Diamond");

        for (int i = 1; i < height; i++) {
            for (int j = 1; j < height; j++) {
                if (j + i > height) {
                    System.out.print(star);
                }
                System.out.print(space);
            }
            System.out.println();
        }
        for (int i = height; i > 1; i--) {
            for (int j = 1; j < height; j++) {
                if (j + i > height) {
                    System.out.print(star);
                }
                System.out.print(space);
            }
            System.out.println();
        }

    }
}