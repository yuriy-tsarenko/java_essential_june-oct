package com.java_essential.examples.lesson4.abstraction.ex004_abstraction;

public class ConcreteDerivedClass extends AbstractBaseClass {

    protected ConcreteDerivedClass(String someField) {
        super(someField);
    }

    @Override
    public void overriddenMethod() {
        System.out.println("DerivedClass.overriddenMethod();");
    }

    @Override
    public void abstractMethod() {
        System.out.println("DerivedClass.abstractMethod();");
    }
}
