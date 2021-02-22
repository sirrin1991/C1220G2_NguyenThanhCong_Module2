package _06_Inheritance_polymorphism.bai_tap.circle_and_cylinder;

public class Cylinder extends Circle {
    private double height;
    Cylinder(){

    }
    Cylinder(double height, double radius , String color){
        super(radius,color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return super.getArea()*this.height;
    }

    @Override
    public String toString() {
        return "A Cylinder with height is "
                + this.height
                + " ,  which is a subclass of "
                + super.toString();
    }

    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        c1.setRadius(3.0);
        c1.setHeight(2.0);
        c1.setColor("Blue");
        System.out.println(c1.getVolume());
        System.out.println(c1.toString());
    }
}
