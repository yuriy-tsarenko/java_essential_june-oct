package novinska.homework.additional;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть радіус кола, аби дізнатись його площу: ");
        double radius = input.nextDouble();

        MyArea circle = new MyArea();
        System.out.println("Площа вашого кола = " + circle.areaOfCircle(radius));
    }
}
