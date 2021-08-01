package com.cbs.java_essential.examples.lesson6.nested_classes.ex001_nestedclasses;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Demo {

    private String value;
    private String name;
    private String email;
    private String address;
    private String phone;
}
