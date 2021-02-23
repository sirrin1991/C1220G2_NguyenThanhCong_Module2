package _07_abstractclass_interface.bai_tap.interface_colorable;

public class Square extends Shape implements Colorable {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public Square() {
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}

class TestSquare {
    public static void main(String[] args) {
        Square square = new Square(3);
        System.out.println("The area of square is " + square.getArea());
        square.howToColor();
    }
}
