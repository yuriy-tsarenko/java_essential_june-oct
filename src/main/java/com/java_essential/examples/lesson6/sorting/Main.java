package com.java_essential.examples.lesson6.sorting;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService service = new UserService();
        List<User> usersById = service.sortUsersById();
        for (User user : usersById) {
            System.out.println(user);
        }

        User userById = service.getUserById(10);
        System.out.println(userById);
    }
}
