package _01_introduction_java.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        final int rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập USD");
        int money = scanner.nextInt();
        int vnd = money*rate;
        System.out.println("Tiền sau khi chuyển đổi là "+ vnd +" VND");

    }
}
