package com.java_essential.examples.lesson9.ex007_generics_bounded_type;

/**
 * Ограничения параметров типа
 */
interface Base {
    void init();
}

class Derived implements Base {
    @Override
    public void init() {
        System.out.println("Success!");
    }
}

class Demo {

}

/**
 * T extends Base -  аргумент типа должен являться или быть производным от указанного базового класса.
 */
class MyClass<T extends Base> {

}

public class Main {
    public static void main(String[] args) {
        MyClass<Base> mc1 = new MyClass<>();

        MyClass<Derived> mc2 = new MyClass<>();

        Derived type = new Derived();
        Base type2 = new Derived();

        someWork(type);
        someWork(type2);
        Demo demo = new Demo();
        Object o = new Object();
    //ошибка компиляции
    //        someWork(demo);
    //        someWork(o);
    }

    public static <T extends Base> void someWork(T type) {
        type.init();
    }
}
