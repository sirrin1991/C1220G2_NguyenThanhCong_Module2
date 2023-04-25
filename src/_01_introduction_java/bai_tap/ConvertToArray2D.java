package _01_introduction_java.bai_tap;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        convertToArray2D(arr);

    }
    public static void convertToArray2D(int[] arr){
        int row;
        int col = 2;
        if (arr.length % 2 == 0) {
            row = arr.length / 2;
        } else {
            row = arr.length / 2 + 1;
        }
        int[][] newArr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            int temp = i / 2;
            if (i % 2 == 0) {
                newArr[temp][0] = arr[i];
            } else {
                newArr[temp][1] = arr[i];
            }
        }
        System.out.println(Arrays.deepToString(newArr));
    }
}
