package _06_Inheritance_polymorphism.bai_tap.circle_and_cylinder;

public class Circle {
    private double radius;
    private String color;
    Circle(){

    }
    Circle(double radius,String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return Math.pow(this.radius,2)*Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius = "
                + this.radius
                + " And color is " + this.color;
    }
}
class TestCircle{
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setColor("red");
        c1.setRadius(3.0);
        System.out.println(c1.toString());
        System.out.println(Math.round(c1.getArea()*100.0)/100.0);
    }
}
