package com.java_essential.examples.lesson3.ex012_final_methods;

class ClassC extends ClassB {
    //Попытка переопределить method1 приводит к ошибке компилятора.
//     @Override
//     public void method1() { System.out.println("ClassC.method1"); }

    // Переопределение method2 позволено.
    @Override
    public final void method2() {
        System.out.println("ClassC.method2");
    }
}
