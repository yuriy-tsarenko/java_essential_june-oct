package com.java_essential.examples.lesson6.anonymous.ex003_anonymous_classes;

/**
 * Анонимные классы.
 */
interface Interface {
    void method();

    int getNum();

    void setNum(int num);

    String getStr();

    int getPublicField();
}

public class Main {
    public static void main(String[] args) {
        // Объявление анонимного (внутреннего) класса
        Interface instance = new Interface() {
            public int publicField = 3;
            protected String str = "Anonymous class";
            private int num = 10;

            @Override
            public void method() {
                publicField = 1234;
                System.out.println("instance1: publicField = " + getPublicField());
            }

            @Override
            public int getPublicField() {
                return publicField;
            }

            @Override
            public int getNum() {
                return num;
            }

            @Override
            public void setNum(int num) {
                this.num = num;
            }

            @Override
            public String getStr() {
                return str;
            }
        };

        instance.method();
        instance.method();

        System.out.println(instance.getPublicField());
        System.out.println(instance.getNum());
        System.out.println(instance.getStr());

        instance.setNum(1111);
        System.out.println(instance.getNum());
    }
}
