package _03_array_and_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        int[] array2 = new int[5];
        int[] array3 = new int[10];
        for (byte i = 0; i < array.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + " của mảng 1");
            array[i] = scanner.nextInt();
        }
        for (byte i = 0; i < array2.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + " của mảng 2");
            array2[i] = scanner.nextInt();
        }
        for (byte i = 0; i < array3.length;i++){
            if(i<array3.length/2){
                array3[i]= array[i];
            }else{
                array3[i]= array2[i-5];
            }
        }
        System.out.println(Arrays.toString(array3));
    }
}
