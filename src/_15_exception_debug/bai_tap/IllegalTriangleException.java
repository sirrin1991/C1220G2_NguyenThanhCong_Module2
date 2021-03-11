package _15_exception_debug.bai_tap;

import java.util.Scanner;

public class IllegalTriangleException extends Exception {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a");
        double a = scanner.nextDouble();
        check(a);
        System.out.println("Input b");
        double b = scanner.nextDouble();
        check(b);
        System.out.println("Input c");
        double c = scanner.nextDouble();
        check(c);
        checkABC(a,b,c);
    }
    static void check(double a) throws IllegalTriangleException {
        if(a<=0){
            throw new IllegalTriangleException();
        }
    }

    static void checkABC(double a, double b ,double c) throws IllegalTriangleException {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException();
        }
    }
}
