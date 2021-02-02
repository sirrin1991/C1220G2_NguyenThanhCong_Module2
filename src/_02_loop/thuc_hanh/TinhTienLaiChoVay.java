package _02_loop.thuc_hanh;

import java.util.Scanner;

public class TinhTienLaiChoVay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = 1.0;
        int month = 1;
        double interset_rate = 1.0;
        System.out.println("Nhập tiền gửi");
        money = scanner.nextDouble();
        System.out.println("Nhập số tháng gửi");
        month = scanner.nextInt();
        System.out.println("Nhập lãi xuất");
        interset_rate = scanner.nextDouble();
        double total = 0.0;
        for (byte i = 0; i < month; i++) {
            total += money * (interset_rate / 100) / 12 * month;
        }
        System.out.println("Tổng tiền lãi là " + total);
    }
}
