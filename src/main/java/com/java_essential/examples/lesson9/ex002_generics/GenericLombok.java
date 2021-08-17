package com.java_essential.examples.lesson9.ex002_generics;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
public class GenericLombok<T, R, S> {

    public GenericLombok() {
    }

    private T name;
    private R password;
    private S email;
    private S phone;

    public static void main(String[] args) {
        GenericLombok<String, Integer, String> kate = new GenericLombok<>();
        kate.setName("Kate");
        kate.setPassword(1234);
        kate.setEmail("example@gmail.com");
        kate.setPhone("+1234028350923");
        System.out.println(kate);

        GenericLombok<Object, Object, Object> john = GenericLombok.builder()
                .name("John")
                .password(12345)
                .email("example@gmail.com")
                .phone("+1234028350923")
                .build();


        System.out.println(john);
    }

}
