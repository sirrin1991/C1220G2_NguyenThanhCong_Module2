package _07_abstractclass_interface.bai_tap.interface_resizeable;

public class Rectangle extends Shape implements Resizeable {
    private double width;
    private double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public void resize(double percent) {
        this.length = this.length + (this.length * percent) / 100;
        this.width = this.width + (this.width * percent) / 100;
    }
}

class TestRectangleResizeable {
    public static void main(String[] args) {
        double random = (int) (Math.random() * 100) + 1;
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(4);
        rectangle.setWidth(3);
        System.out.println("Before increase : \n" +
                "   the area of Rectangle  is " + rectangle.getArea());
        rectangle.resize(random);
        System.out.println("After increase : \n" +
                "   the area of Rectangle  is " + rectangle.getArea());
    }
}
