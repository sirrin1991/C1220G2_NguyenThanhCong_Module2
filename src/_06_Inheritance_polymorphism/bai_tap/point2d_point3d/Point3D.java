package _06_Inheritance_polymorphism.bai_tap.point2d_point3d;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;
    Point3D(){

    }
    Point3D(float x ,float y , float z){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x , float y , float z){
        super.setXY(x,y);
        this.z = z;
    }

    @Override
    public float[] getXY() {
        float[] arrXYZ = new float[3];
        arrXYZ[0]= super.getX();
        arrXYZ[1]= super.getY();
        arrXYZ[2]= this.z;
        return arrXYZ;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x= " + super.getX() +
                ", y= " + super.getY() +
                " , z= " + this.z +
                '}';
    }

}
class TestPoint3D{
    public static void main(String[] args) {
        Point3D p1 = new Point3D(2,3,4);
        System.out.println(Arrays.toString(p1.getXY()));
        System.out.println(p1.toString());
    }
}
