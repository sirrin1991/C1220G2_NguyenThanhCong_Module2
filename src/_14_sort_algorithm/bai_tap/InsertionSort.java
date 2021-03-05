package _14_sort_algorithm.bai_tap;

import java.util.*;

public class InsertionSort {
    static void sort(int[] arrayNumbers) {
        int n = arrayNumbers.length;
        for (int i = 1; i < n; ++i) {
            int key = arrayNumbers[i];
            int j = i - 1;

            while (j >= 0 && arrayNumbers[j] > key) {
                arrayNumbers[j + 1] = arrayNumbers[j];
                j = j - 1;
            }
            arrayNumbers[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array's size");
        int size = scanner.nextInt();
        int[] arrayNumbers = new int[size];
        System.out.println("Input numbers");
        for(int i = 0 ;i<size;i++){
            arrayNumbers[i]=scanner.nextInt();
        }
        System.out.println("Before sorted");
        for(int number : arrayNumbers){
            System.out.println(number);
        }
        System.out.println("_______________________");
        System.out.println("After sorted");
        sort(arrayNumbers);
        for(int number : arrayNumbers){
            System.out.println(number);
        }

    }
}

