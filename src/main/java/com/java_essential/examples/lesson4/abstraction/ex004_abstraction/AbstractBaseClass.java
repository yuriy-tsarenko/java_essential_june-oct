package com.java_essential.examples.lesson4.abstraction.ex004_abstraction;

public abstract class AbstractBaseClass {

    private final String someField;

    public AbstractBaseClass(String someField) {
        this.someField = someField;
    }

    public void simpleMethod() {
        System.out.println("AbstractBaseClass.simpleMethod");
    }

    public void overriddenMethod() {
        System.out.println("AbstractBaseClass.overriddenMethod");
    }

    public abstract void abstractMethod();
}
