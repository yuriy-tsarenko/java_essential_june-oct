package com.java_essential.examples.lesson6.enums.demo;


import static com.java_essential.examples.lesson6.enums.demo.Role.ADMIN;

public class Main {
    public static void main(String[] args) {
        String name = ADMIN.name();
        User user = new User(1, "user", "default",
                "John", "Week", ADMIN);
        System.out.println(user);
    }
}
