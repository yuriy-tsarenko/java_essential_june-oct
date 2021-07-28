package com.java_essential.examples.lesson3.ex001_inheritance;

/**
 * Наследование.
 */
public class DerivedClass extends BaseClass {

    public String publicField;

    // Конструктор.
    public DerivedClass() {
        // Изменяем все доступные поля унаследованные от базового класса.
       publicField = "DerivedClass.publicField";
       protectedField = "DerivedClass.protectedField";
    }
}
