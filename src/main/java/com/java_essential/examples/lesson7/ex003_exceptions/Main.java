package com.java_essential.examples.lesson7.ex003_exceptions;

/**
 * Обработка исключений.
 */
public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception("Мое Исключение");
        } catch (Exception e) {
            System.out.println("Обработка исключения.");
            System.out.println(e.getMessage());
        }
    }
}
