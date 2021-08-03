package com.java_essential.examples.lesson7.ex006_exceptions;

import java.io.IOException;

/**
 * Обработка исключений.
 * <p>
 * Для создания пользовательского исключения, требуется наследование от System.Exception.
 */
class UserException extends IndexOutOfBoundsException {
    public UserException() {
    }

    public UserException(String s) {
        super(s);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            someWork();
        } catch (IndexOutOfBoundsException | IOException e) {
            System.out.println("Обработка исключения.");
            e.printStackTrace();
        }
    }

    public static void someWork() throws UserException, IOException {
        throw new UserException();
    }
}
