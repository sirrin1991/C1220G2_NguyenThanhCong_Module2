package _07_abstractclass_interface.bai_tap.interface_resizeable;

public class Square implements Resizeable {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return Math.pow(this.side, 2);
    }

    @Override
    public void resize(double percent) {
        this.side = this.side + (this.side * percent) / 100;
    }
}

class TestSquareResizeable {
    public static void main(String[] args) {
        double random = (int)(Math.random()*100) +1;
        Square square = new Square(3);
        System.out.println("Before increase : \n     The area of square is "
                + square.getArea());
        square.resize(random);
        System.out.println("After increase : \n     The area of square is "
                + square.getArea());
    }
}
