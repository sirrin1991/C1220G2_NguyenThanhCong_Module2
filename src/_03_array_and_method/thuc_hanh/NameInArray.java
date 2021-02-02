package _03_array_and_method.thuc_hanh;

import java.util.Scanner;

public class NameInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] name = {"Tài", "Huy", "Hậu", "Đức", "Đông","Huy"};
        System.out.println("Nhập tên bạn muốn tìm : ");
        String findName = scanner.nextLine();
        boolean check = false;
        for (byte i = 0; i < name.length; i++) {
            if (name[i].equals(findName)) {
                check = true;
                System.out.println(findName + " nằm ở vị trí thứ " + (i + 1));
            }
        }
        if (!check) {
            System.out.println(findName + " không có trong danh sách");
        }
    }
}
