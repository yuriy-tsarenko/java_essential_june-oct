package com.cbs.java_essential.examples.lesson6.static_members.ex006_abstract_class;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConcreteClass extends AbstractClass {

    private String name;

    @Override
    public void someWork() {
        System.out.println(this.name);
    }
}
