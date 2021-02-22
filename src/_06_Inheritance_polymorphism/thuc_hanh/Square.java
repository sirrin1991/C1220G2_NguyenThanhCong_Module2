package _06_Inheritance_polymorphism.thuc_hanh;

public class Square extends Rectangle {
    public Square(){

    }
    public Square(double side){
        super(side,side);
    }
    public Square (String color , boolean filled , double side){
        super(color,filled,side,side);
    }
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }
    public double getSide(){
        return getLength();
    }

//    @Override
//    public void setWidth(double width) {
//        setSide(width);
//    }
//
//    @Override
//    public void setLength(double length) {
//        setSide(length);
//    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    public static void main(String[] args) {
        Square square = new Square();
        square.setSide(3);
        System.out.println(square);
        System.out.println(square.getSide());

        square = new Square(2.3);
        System.out.println(square);

        square = new Square("yellow",true,3.0);
        System.out.println(square);
    }
}
