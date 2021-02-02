package _02_loop.thuc_hanh;

import java.util.Scanner;

public class TimUCLN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = 0;
        int secondNumber = 0;
        System.out.println("Nhập số thứ nhất ");
        firstNumber = scanner.nextInt();
        firstNumber = Math.abs(firstNumber);
        System.out.println("Nhập số thứ hai ");
        secondNumber = scanner.nextInt();
        secondNumber = Math.abs(secondNumber);
        if (firstNumber == 0 && secondNumber == 0) {
            System.out.println("Không có ước chung");
        } else if (firstNumber == 0 || secondNumber == 0) {
            System.out.println("Ước chung lớn nhất là " + Math.abs(firstNumber - secondNumber));
        } else {
            while (firstNumber != secondNumber) {
                if (firstNumber > secondNumber) {
                    firstNumber = firstNumber - secondNumber;
                } else {
                    secondNumber = secondNumber - firstNumber;
                }
            }
            System.out.println("UCLN là " + firstNumber);
        }
    }
}
