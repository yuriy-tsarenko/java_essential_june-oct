package com.java_essential.starter_garmatyuk;

public class SumMin {
    public static void main(String[] args) {
        //Дано два числа exampleA и exampleB (exampleA<exampleB) выведите суму всех чисел, расположенных между данными
        // числами на экран.
        int exampleA = 1;
        int exampleB = 10;
        int sum = 0;
        for (int i = exampleA + 1; i < exampleB; i++) {
            sum += i;
        }
        System.out.println(sum);

        //Дано два числа exampleA и exampleB (exampleA<exampleB) выведите все нечетные значения,
        //расположенные между данными числами.
            for (int i = exampleA; i < exampleB; i += 2) {
                if ((exampleA & 1) == 0) { // почему подсвечивает?
                    exampleA++;
            }
                System.out.println(i);
        }
    }
}
