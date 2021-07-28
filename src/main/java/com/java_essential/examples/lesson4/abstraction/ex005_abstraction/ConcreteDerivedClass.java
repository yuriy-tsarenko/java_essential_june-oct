package com.java_essential.examples.lesson4.abstraction.ex005_abstraction;

public class ConcreteDerivedClass extends AbstractBaseClass {

    @Override
    public void simpleMethod() {
        System.out.println("ConcreteDerivedClass.simpleMethod");
    }

    @Override
    public void abstractMethod() {
        System.out.println("ConcreteDerivedClass.abstractMethod();");
    }
}
