package _03_array_and_method.thuc_hanh;

import java.util.Scanner;

public class ConvertCToF {
    public static double CToF(double c) {
        double f = (9.0 / 5) * c + 32;
        return f;
    }

    public static double FToC(double f) {
        double c = (5.0 / 9) * (f - 32);
        return c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        double temp = 0.0;
        while (check) {
            System.out.println("MENU :");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("3. Exit");
            System.out.println("Nhập lựa chọn");
            byte choice = scanner.nextByte();
            switch (choice) {
                case 1:
                    System.out.println("Nhập nhiệt độ");
                    temp = scanner.nextDouble();
                    System.out.println("Nhiệt độ sau khi chuyển đổi là " + FToC(temp));
                    break;
                case 2:
                    System.out.println("Nhập nhiệt độ");
                    temp = scanner.nextDouble();
                    System.out.println("Nhiệt độ sau khi chuyển đổi là " + CToF(temp));
                    break;
                case 3:
                    System.out.println("bye bye");
                    check = false;
                    break;
                default:
                    System.out.println("Chọn trong danh sách");
            }
        }
    }
}
