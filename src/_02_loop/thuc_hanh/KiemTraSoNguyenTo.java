package _02_loop.thuc_hanh;

import java.util.Scanner;

public class KiemTraSoNguyenTo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println("Không phải số nguyên tố");
        } else {
            boolean check = true ;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if ((number % i) == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(number + " Là số nguyên tố");
            }else {
                System.out.println(number + " Không phải là số nguyên tố");
            }
        }
    }
}
