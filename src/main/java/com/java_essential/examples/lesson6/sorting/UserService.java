package com.java_essential.examples.lesson6.sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UserService {

    private final List<User> users = UserRepository.loadUsers();

    public User getUserById(Integer id) {
        List<User> users = sortUsersById();
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    public List<User> sortUsersById() {
        Collections.shuffle(users);
        users.sort(new SortUsersById());
        return users;
    }

    public List<User> sortUsersByIdV2() {
        Collections.shuffle(users);
        users.sort(new Comparator<User>() {
            @Override
            public int compare(User user1, User user2) {
                return user2.getId() - user1.getId();
            }
        });
        return users;
    }


    static class SortUsersById implements Comparator<User> {
        @Override
        public int compare(User user1, User user2) {
            return user1.getId() - user2.getId();
        }
    }
}
