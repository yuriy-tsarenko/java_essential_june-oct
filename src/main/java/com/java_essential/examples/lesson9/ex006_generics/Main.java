package com.java_essential.examples.lesson9.ex006_generics;

/**
 * Плохой пример. Так делать не рекомендуется.
 */
class MyClass<T> {
    public T add(T a, T b) {
        if (a instanceof Integer) {
            return (T) (Object) ((Integer) a + (Integer) b);
        }

        if (a.getClass().equals(Double.class)) {
            return (T) (Object) ((Double) a + (Double) b);
        }

        return (T) (Object) 0;
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass<Integer> my = new MyClass<>();
        int sum = my.add(2, 3);

        System.out.println(sum);
    }
}
