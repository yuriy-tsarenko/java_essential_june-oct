package com.cbs.java_essential.examples.lesson6.static_members.ex006_abstract_class;

public abstract class AbstractClass {
    // Статический фабричный метод.
    public static AbstractClass createChild() {
        ConcreteClass concreteClass = new ConcreteClass();
        concreteClass.setName("Animal");
        return concreteClass;
    }

    public abstract void someWork();
}

