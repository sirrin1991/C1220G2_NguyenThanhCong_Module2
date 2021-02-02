package _03_array_and_method.bai_tap;

import java.util.Scanner;

public class MinInArray {
    public static int minValue(int[] array){
        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input length of array");
        int length = scanner.nextInt();
        int[] arrayNumber = new int[length];
        for(int i=0; i<length;i++){
            System.out.println("Input a number");
            int number = scanner.nextInt();
            arrayNumber[i]=number;
        }
        System.out.println("Min in array is : "+ minValue(arrayNumber));

    }
}
