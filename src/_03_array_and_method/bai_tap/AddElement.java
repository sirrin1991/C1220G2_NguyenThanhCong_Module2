package _03_array_and_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tổng số phần tử của mảng ");
        int size = scanner.nextInt();
        int[] array = new int[size+10];
        for (int i = 0;i < array.length;i++){
            System.out.println("Nhập phần tử thứ "+ (i+1));
            array[i]= scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Nhập phần tử cần chèn");
        int number = scanner.nextInt();
        int index = 0;
        do {
            System.out.println("Nhập vị trí cần chèn");
            index = scanner.nextInt();
            if (index <= 1 || index >=size-1){
                System.out.println("Vị trí cần chèn phải > 1 và < "+ (size-1));
            }
        }while (index <= 1 || index >=size-1);
        for (int i = size-1;i>index;i--){
            array[i]=array[i-1];
        }
        array[index]= number;
        System.out.println(Arrays.toString(array));
    }
}
