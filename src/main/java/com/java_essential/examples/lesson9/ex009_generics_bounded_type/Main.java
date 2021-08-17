package com.java_essential.examples.lesson9.ex009_generics_bounded_type;

/**
 * Ограничения параметров типа
 */
interface Interface1 {
    /* ... */
}

interface Interface2<U> extends Interface1 {
    /* ... */
}

class Derived1<T> implements Interface1, Interface2<T> {
    T field;
}

class Derived2<T> implements Interface2<T> {
    /* ... */
}

// where T : Interface, Interface<object>  -  Аргумент типа должен являться или реализовывать указанный интерфейс.
// Можно установить несколько ограничений интерфейса. Ограничивающий интерфейс также может быть универсальным.

class MyClass1<T extends Interface1> {
    /* ... */
}

class MyClass2<T extends Interface2<Object>> {
    /* ... */
}

public class Main {
    public static void main(String[] args) {
        //  Аргумент типа подходит, т.к., Interface<object> наследуется от Interface
        MyClass1<Interface1> my1 = new MyClass1<>();
        MyClass2<Interface2<Object>> my2 = new MyClass2<>();

        MyClass2<Interface2<Object>> my3 = new MyClass2<>();
        MyClass2<Interface2<Object>> my4 = new MyClass2<>();
        Derived1<String> derived1 = new Derived1<>();
        String field = derived1.field;
    }
}
