package com.java_essential.examples.lesson4.abstraction.ex003_abstraction;

abstract class AbstractClassA {
    public abstract void operationA();
}


abstract class AbstractClassB extends AbstractClassA {
    public abstract void operationB();
}


abstract class ConcreteClass extends AbstractClassB {
    @Override
    public void operationA() {
        System.out.println("ConcreteClass.operationA");
    }
}

class ConcreteClassChild extends ConcreteClass {

    @Override
    public void operationB() {
        System.out.println("ConcreteClassChild.operationB");
    }
}

public class Main {
    public static void main(String[] args) {
        AbstractClassA instance = new ConcreteClassChild();
        AbstractClassB instance1 = (AbstractClassB) instance;
        instance1.operationA();
        instance1.operationB();
    }
}
