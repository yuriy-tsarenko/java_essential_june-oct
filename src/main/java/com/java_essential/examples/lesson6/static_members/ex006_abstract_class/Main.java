package com.cbs.java_essential.examples.lesson6.static_members.ex006_abstract_class;

public class Main {
    public static void main(String[] args) {
        AbstractClass instance = AbstractClass.createChild();
        instance.someWork();
    }
}
