package com.java_essential.examples.lesson4.abstraction.ex002_abstraction;


class A {
    public void operation() {
        System.out.println("ConcreteClassA.operation");
    }
}


abstract class AbstractClassA extends A {
    public abstract void method();
}


abstract class AbstractClassB extends AbstractClassA {
    public abstract void print();
}


 class C extends AbstractClassB {

     @Override
     public void method() {
         System.out.println("method");
     }

     @Override
     public void print() {
         System.out.println("print");
     }

     @Override
     public void operation() {
         System.out.println("override operation");
     }
 }

public class Main {
    public static void main(String[] args) {
        AbstractClassB instance = new C();
        AbstractClassA instance2 = new C();
        AbstractClassB classB = (AbstractClassB) instance2;

        classB.method();
        classB.operation();
        classB.print();
    }
}
