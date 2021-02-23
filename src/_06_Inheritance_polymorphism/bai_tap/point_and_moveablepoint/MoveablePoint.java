package _06_Inheritance_polymorphism.bai_tap.point_and_moveablepoint;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    MoveablePoint(){

    }
    MoveablePoint(float xSpeed , float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    MoveablePoint(float xSpeed , float ySpeed , float x, float y){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] arrSpeed = new float[2];
        arrSpeed[0]=this.xSpeed;
        arrSpeed[1]= this.ySpeed;
        return arrSpeed;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Speed = (" + this.xSpeed +
                ", " + this.ySpeed +
                ")";
    }
    public MoveablePoint move(){
        this.setX(this.getX()+this.xSpeed);
        this.setY(this.getY()+this.ySpeed);
        return this;
    }


}
class TestMovealePoint{
    public static void main(String[] args) {
        MoveablePoint m1 = new MoveablePoint(3 ,4 ,5 ,6);
        System.out.println(m1.move());
    }
}
