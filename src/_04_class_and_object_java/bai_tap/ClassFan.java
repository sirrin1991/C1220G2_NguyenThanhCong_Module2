package _04_class_and_object_java.bai_tap;

public class ClassFan {
    private final byte SLOW = 1;
    private final byte MEDIUM = 2;
    private final byte FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5.0;
    private String color = "blue";
    public ClassFan (){

    }
    public ClassFan(int speed,double radius,String color,boolean on){
        this.speed = speed;
        this.radius = radius;
        this.color = color;
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public boolean isOn() {
        return on;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
//    public void setON(){
//        if(this.on){
//            this.on = false;
//            System.out.println("Tắt quạt");
//        }else {
//            this.on = true;
//            System.out.println("Bật quạt");
//        }
//    }

    public String toString() {
        if (this.on) {
            return
                    "speed= " + this.speed +
                    ", radius= " + this.radius +
                    ", color= " + this.color + '\n' +
                    "Fan is on " ;
        }else {
            return
                    " radius= " + this.radius +
                    ", color= " + this.color + '\n' +
                    "Fan is off" ;
        }
    }
}
class fan {
    public static void main(String[] args) {
        ClassFan fan1 = new ClassFan(3,10,"yellow",true);
        ClassFan fan2 = new ClassFan(2,5,"blue",false);
        System.out.println("fan1 : " + fan1.toString());
        System.out.println("fan2 : " + fan2.toString());
    }
}