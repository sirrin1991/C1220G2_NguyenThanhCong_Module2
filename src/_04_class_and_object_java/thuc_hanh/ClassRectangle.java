package _04_class_and_object_java.thuc_hanh;

import java.util.Scanner;

public class ClassRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        Rectangle rectangle2 = new Rectangle();

        System.out.println("Perimeter of the Rectangle : " + rectangle.getPerimeter());
        System.out.println("Area of the Rectangle : " + rectangle.getArea());
    }

}

class Rectangle {
    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    Rectangle() {

    }

    double getArea() {
        return this.width * this.height;
    }

    double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
