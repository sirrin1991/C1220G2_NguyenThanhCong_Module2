package _07_abstractclass_interface.bai_tap.interface_resizeable;

public class TestResizeableShape {
    public static void main(String[] args) {
        double random = (int)(Math.random()*100+1);
        Shape[] arrShape = new Shape[3];
        arrShape[0] = new Square(4);
        arrShape[1] = new Circle(3);
        arrShape[2] = new Rectangle(3,5);
        System.out.println("Before increase :");
        for (byte i = 0 ; i<3;i++){
            if ( arrShape[i] instanceof Circle){
                System.out.println("    The area of Circle is " + arrShape[i].getArea());
            }else if (arrShape[i] instanceof Rectangle){
                System.out.println("    The area of Rectangle is " + arrShape[i].getArea());
            }else {
                System.out.println("    The area of square is " + arrShape[i].getArea());
            }
        }
        System.out.println("After increase :");
        for (byte i = 0 ; i<3;i++){
            if ( arrShape[i] instanceof Circle){
                arrShape[i].resize(random);
                System.out.println("    The area of Circle is " + arrShape[i].getArea());
            }else if (arrShape[i] instanceof Rectangle){
                arrShape[i].resize(random);
                System.out.println("    The area of Rectangle is " + arrShape[i].getArea());
            }else {
                arrShape[i].resize(random);
                System.out.println("    The area of square is " + arrShape[i].getArea());
            }
        }
    }
}
