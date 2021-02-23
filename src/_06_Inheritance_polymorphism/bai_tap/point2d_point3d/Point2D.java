package _06_Inheritance_polymorphism.bai_tap.point2d_point3d;

import java.util.Arrays;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;
    Point2D(){

    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x , float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float [] arrXY = new float[2];
        arrXY[0]= this.x;
        arrXY[1]= this.y;
        return arrXY;
    }
    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
class TestPoint2D{
    public static void main(String[] args) {
        Point2D n1 = new Point2D();
        n1.setX(3);
        n1.setY(4);
        System.out.println(n1.toString());
        n1.setXY(4.2f,5.1f);
        System.out.println(n1.toString());
        System.out.println(Arrays.toString(n1.getXY()));
    }
}
