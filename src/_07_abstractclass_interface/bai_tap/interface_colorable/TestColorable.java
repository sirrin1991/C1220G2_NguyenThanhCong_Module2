package _07_abstractclass_interface.bai_tap.interface_colorable;

public class TestColorable {
    public static void main(String[] args) {
       Shape[] arrShape = new Shape[3];
       arrShape[0] = new Circle(3);
       arrShape[1] = new Square(4);
       arrShape[2] = new Rectangle(3,5);
       for(byte i = 0 ; i <3 ; i++){
           if (arrShape[i] instanceof Square){
               Colorable colorable = (Square)arrShape[i];
               System.out.print("The area of square is "+ arrShape[i].getArea() + ". ");
               colorable.howToColor();
           }else if (arrShape[i] instanceof Circle){
               System.out.println("The area of circle is " + arrShape[i].getArea());
           }else {
               System.out.println("The area of Rectangle is " + arrShape[i].getArea());
           }
       }
    }
}
