package com.java_essential.examples.lesson7.ex008_exceptions;

/**
 * Обработка исключений.
 * <p>
 * Для создания пользовательского исключения, требуется наследование от System.Exception.
 */
class UserException extends Exception {
    public void method() {
        System.out.println("Мое Исключение!");
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            throw new UserException();
        } catch (UserException userException) {
            System.out.println("Обработка исключения 1:");
            userException.method();

            try {
                throw userException;

            } catch (UserException exception) {
                System.out.println("Обработка исключения 2:");
                exception.method();

            }
        } finally {
            System.out.println("Блок finally.");
        }

        System.out.println("Конец кода.");
    }
}
