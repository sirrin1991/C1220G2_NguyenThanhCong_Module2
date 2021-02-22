package _06_Inheritance_polymorphism.bai_tap.point_and_moveablepoint;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;
    Point(){

    }
    Point(float x , float y){
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
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
