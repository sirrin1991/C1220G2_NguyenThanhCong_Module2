package _07_abstractclass_interface.bai_tap.interface_resizeable;

public class Circle implements Resizeable {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public void resize(double percent) {
        this.radius = this.radius + (this.radius * percent) / 100;
    }
}

class TestCircleResizeable {
    public static void main(String[] args) {
        double random = (int) (Math.random() * 100) + 1;
        Circle circle1 = new Circle();
        circle1.setRadius(5);
        Circle circle2 = new Circle(3);
        System.out.println("Before increase : \n" +
                "   the area of Circle 1 is " + circle1.getArea() + "\n" +
                "   the area of Circle 2 is " + circle2.getArea());
        circle1.resize(random);
        circle2.resize(random);
        System.out.println("After increase : \n" +
                "   the area of Circle 1 is " + circle1.getArea() + "\n" +
                "   the area of Circle 2 is " + circle2.getArea());
    }
}
