package com.java_essential.examples.lesson6.enums.demo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Role {
    USER(1), ADMIN(2), SUPER_ADMIN(3), MODERATOR(4);

    private int code;
}
