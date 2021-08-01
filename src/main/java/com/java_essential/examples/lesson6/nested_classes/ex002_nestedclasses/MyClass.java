package com.cbs.java_essential.examples.lesson6.nested_classes.ex002_nestedclasses;

/**
 * Вложенные классы.
 */
class MyClass {
    private static int field = 0;

    class Nested {
        public void method(int a) {
            field = a;

            System.out.println(field);
        }
    }
}
