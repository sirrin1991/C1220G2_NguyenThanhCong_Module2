package _02_loop.thuc_hanh;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        System.out.println("Menu");
        System.out.println("1. Draw the square");
        System.out.println("2. Draw the rectangle");
        System.out.println("3. Draw the triangle");
        System.out.println("4. Exit");
        System.out.println("Nhập lựa chọn : ");

        while (check) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1. Draw the square");
                    for (byte i = 0; i < 6; i++) {
                        for (byte j = 0; j < 6; j++) {
                            System.out.print("*  ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    System.out.println("2. Draw the rectangle");
                    for (byte i = 0; i < 3; i++) {
                        for (byte j = 0; j < 6; j++) {
                            System.out.print("*  ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    System.out.println("3. Draw the triangle");
                    for (byte i = 6; i > 0; i--) {
                        for (byte j = 0; j < i; j++) {
                            System.out.print("*  ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 4:
                    check = false;
                    System.out.println("Bye Bye");
                    break;
                default:
                    System.out.println("No");
            }
        }
    }
}
