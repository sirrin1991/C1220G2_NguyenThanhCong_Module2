package _07_abstractclass_interface.thuc_hanh.interface_comparator;

import _07_abstractclass_interface.thuc_hanh.interface_comparable.Circle;

import java.util.Arrays;

public class CircleComparatorTest extends Circle {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle.getRadius());
        }

        CircleComparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle.getRadius());
        }
    }
}
