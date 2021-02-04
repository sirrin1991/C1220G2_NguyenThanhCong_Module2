package _04_class_and_object_java.bai_tap;
import java.util.Scanner;

public class ClassQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a");
        double a = scanner.nextDouble();
        System.out.println("Input b");
        double b = scanner.nextDouble();
        System.out.println("Input c");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        System.out.println(quadraticEquation.getResult());
    }
}

class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    QuadraticEquation() {

    }

    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double getA() {
        return a;
    }

    double getB() {
        return b;
    }

    double getC() {
        return c;
    }

    double getDiscriminant() {
        return (this.b*this.b) - (4 * this.a * this.c);
    }
    String getResult() {
        if (getDiscriminant() > 0) {
            return "FirstRoot1 : " + (-this.b - Math.sqrt(getDiscriminant()) / (2 * this.a)) +
                    " SecondRoot2 : " + (-this.b + Math.sqrt(getDiscriminant()) / (2 * this.a));
        }else if ( getDiscriminant() == 0){
            return ("FirstRoot1 = SecondRoot2 = " +(-this.b/(2*this.a)));
        } else{
            return "The equation has no solution !!";
        }
    }
}
