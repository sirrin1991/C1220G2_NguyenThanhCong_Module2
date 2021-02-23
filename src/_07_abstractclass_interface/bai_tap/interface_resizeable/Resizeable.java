package _07_abstractclass_interface.bai_tap.interface_resizeable;

public interface Resizeable {
    void resize(double percent);
}
class InterfaceResizeable implements Resizeable{
    private double a = 0.0;

    public InterfaceResizeable(double a) {
        this.a = a;
    }

    @Override
    public void resize(double percent) {
       this.a = a + (a*percent)/100.0;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
}
class Test{
    public static void main(String[] args) {
        InterfaceResizeable ex = new InterfaceResizeable(3.0);
        double random = (int)(Math.random()*100) + 1;
        System.out.println(random);
        System.out.println("Before increase " +ex.getA());
        ex.resize(random);
        System.out.println("After increase "+ex.getA());
    }
}
