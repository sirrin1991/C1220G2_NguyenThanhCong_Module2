package _06_Inheritance_polymorphism.bai_tap.triangle;

public class Shape {
    private String color ;
    Shape(){

    }
    Shape(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor() ;
    }

}
class TestShape{
    public static void main(String[] args) {
        Shape s1 = new Shape();
        s1.setColor("blue");
        System.out.println(s1.toString());
        Shape s2 = new Shape("red");
        System.out.println(s2.toString());
    }
}
