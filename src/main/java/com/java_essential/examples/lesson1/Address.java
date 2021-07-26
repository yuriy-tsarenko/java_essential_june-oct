package com.java_essential.examples.lesson1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Address {

    private Integer index;
    private String country;
    private String city;
    private String street;
    private Integer house;
    private String apartment;
}
