package _06_Inheritance_polymorphism.bai_tap.triangle;

import java.util.Scanner;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    private double p;
    Triangle(){

    }

    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getPerimeter(){
        return side1+side2+side3;
    }
    public double getArea(){
        p = this.getPerimeter()*(1.0/2.0);
        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }

    @Override
    public String toString() {
        return "The area of a triangle is " + this.getArea() +
                ", and the perimeter is " + this.getPerimeter() +
                ", which is a subclass of " + super.toString();
    }
}
class TestTriangle{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a color of a triangle");
        String color = scanner.nextLine();
        System.out.println("Input side 1");
        double side1 = scanner.nextDouble();
        System.out.println("Input side 2");
        double side2 = scanner.nextDouble();
        System.out.println("Input side 3");
        double side3 = scanner.nextDouble();
        Triangle triangle = new Triangle();
        triangle.setColor(color);
        triangle.setSide1(side1);
        triangle.setSide1(side2);
        triangle.setSide1(side3);
        System.out.println(triangle.toString());
    }
}
