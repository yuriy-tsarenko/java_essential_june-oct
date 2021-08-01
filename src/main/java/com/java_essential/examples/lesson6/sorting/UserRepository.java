package com.java_essential.examples.lesson6.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserRepository {

    public static List<User> loadUsers() {
        List<User> users = new ArrayList<>(1000);
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            int nextInt = random.nextInt(10000);
            users.add(new User(nextInt, "user" + i, "default",
                    "John" + i, "Week", "+123243666",
                    "@example.com", "office", i * 15));
        }
        return users;
    }
}
