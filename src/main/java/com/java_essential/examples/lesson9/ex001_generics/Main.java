package com.java_essential.examples.lesson9.ex001_generics;

/**
 * Универсальные шаблоны.
 * На 8-й строке создаем класс с именем MyClass, параметризированный указателем места заполнения типом - T
 */
class MyClass<T, R> {
    public T field;
    public R fieldTwo;

    public void method() {
        System.out.println("field 1: " + field.getClass().getName());
        System.out.println("field 2: " + fieldTwo.getClass().getName());
    }
}

public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр класса MyClass и в качестве параметра типа (тип MyClass) передаем тип String.
        MyClass<String, Integer> instance1 = new MyClass<>();
        instance1.field = "ABC";
        instance1.fieldTwo = 12345;
        instance1.method();

        //// В качестве параметра типа передавать примитивные типы (int, long, float, double, и так далее) нельзя.
        //MyClass<int> instance2 = new MyClass<int>();
        //instance2.method();
        System.out.println("--------------------------------------");
        // Создаем экземпляр класса MyClass и в качестве параметра типа (тип MyClass) передаем тип Integer.
        MyClass<Integer, String> instance2 = new MyClass<>();
        instance2.field = 1234;
        instance2.fieldTwo = "1234";
        instance2.method();
    }
}
