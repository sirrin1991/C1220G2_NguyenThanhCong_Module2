package _02_loop.bai_tap;

import java.util.Scanner;

public class HienThiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        System.out.println("Menu");
        System.out.println("1. Draw the rectangle");
        System.out.println("2. Draw the triangle");
        System.out.println("3. Draw the isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Input your choice : ");

        while (check) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1. Draw the rectangle");
                    for (byte i = 0; i < 3; i++) {
                        for (byte j = 0; j < 10; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    System.out.println("2. Draw the triangle");
                    for (byte i = 5; i > 0; i--) {
                        for (byte j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    for (byte i = 0; i < 5; i++) {
                        for (byte j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    for (byte i = 0; i < 5; i++) {
                        for (byte j = 0; j < i; j++) {
                            System.out.print(" ");
                        }
                        for (byte k = i; k < 5; k++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    for (byte i = 0; i < 5; i++) {
                        for (byte j = i; j < 4; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k <= i; k++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    System.out.println("Draw the isosceles triangle");
                    for (byte i = 0; i < 5; i++) {
                        for (byte j = i; j < 4; j++) {
                            System.out.print(" ");
                        }
                        for (byte k = 0; k <= i; k++) {
                            System.out.print("*");
                        }
                        for (byte j = 0; j < i; j++) {
                            System.out.print("*");
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
