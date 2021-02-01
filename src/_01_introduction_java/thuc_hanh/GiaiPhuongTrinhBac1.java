package _01_introduction_java.thuc_hanh;


import java.util.Scanner;

public class GiaiPhuongTrinhBac1 {
    public static void main(String[] args) {
        System.out.println("Giai phuong trinh bac nhat");
        System.out.println("Phuong trinh bac nhat co dang 'a*x +b = 0',vui long nhap 'a,b,c'");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a = ");
        double a = scanner.nextDouble();
        System.out.println("Nhap b = ");
        double b = scanner.nextDouble();

        if (a != 0) {
            double answer = (-b) / a;
            System.out.println("Equation pass with x = \n" + answer);
        } else {
            if (b == 0) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }

    }
}
