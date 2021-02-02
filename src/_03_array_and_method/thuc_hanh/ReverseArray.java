package _03_array_and_method.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("Nhập độ dài của mảng :");
            size = scanner.nextInt();
        } while (size >= 20 || size <= 0);
        array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Nhập các phần tử thứ " + (i + 1) + " của mảng");
            array[i] = scanner.nextInt();
        }
        for (int value : array) {
            System.out.println(value);
        }
        for (byte i = 0; i< array.length/2;i++){
            int temp =array[i];
//            temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = temp;
        }
        for (int value : array) {
            System.out.println(value);
        }

    }
}
