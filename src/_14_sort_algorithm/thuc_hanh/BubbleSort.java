package _14_sort_algorithm.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array size");
        int length = scanner.nextInt();
        int[] arrayOfInt = new int[length];
        System.out.println("Input a number");
        for(int i = 0;i<length;i++){
            arrayOfInt[i]=scanner.nextInt();
        }

        for (byte i = 0; i < length; i++){
            for (int j = i +1 ; j<length;j++){
                if(arrayOfInt[i]>arrayOfInt[j]){
                    int temp = arrayOfInt[i];
                    arrayOfInt[i]=arrayOfInt[j];
                    arrayOfInt[j]=temp;

                }
            }
            System.out.println(Arrays.toString(arrayOfInt));
            System.out.println("--------------------");
        }

    }
}
