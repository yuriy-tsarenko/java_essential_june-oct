package com.java_essential.examples.lesson7.ex005_exceptions;

/**
 * Обработка исключений.
 * <p>
 * Для создания пользовательского исключения, требуется наследование от Exception.
 */
class UserException extends Exception {
    public UserException() {
        super();
    }

    public UserException(String message) {
        super(message);
    }
}

class Demo {
    public static void someWork() throws UserException {
        throw new UserException("USER EXCEPTION");
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Demo.someWork();
        } catch (UserException e) {
            e.printStackTrace();
        }
    }
}
