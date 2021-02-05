package _05_access_modifier_static_method.bai_tap;

public class Circle {
    private double radius = 1.0;
    private String color ="red";

    Circle(){

    }

    Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return Math.pow(this.radius,2)*3.14;
    }
    static class TestCircle {
        public static void main(String[] args) {
            Circle circle = new Circle(2.0);
            System.out.println(circle.getArea());

        }
    }

}

