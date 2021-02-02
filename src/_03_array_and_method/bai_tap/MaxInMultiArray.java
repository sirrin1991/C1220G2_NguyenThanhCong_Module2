package _03_array_and_method.bai_tap;


import java.util.Arrays;
import java.util.Scanner;

public class MaxInMultiArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Row = ");
        int row = scanner.nextInt();
        System.out.println("Col = ");
        int col = scanner.nextInt();
        double[][] arrayNum = new double[row][col];
        for (byte i = 0; i < row; i++) {
            for (byte j = 0; j < col; j++) {
                System.out.println("Input Number");
                double number = scanner.nextDouble();
                arrayNum[i][j] = number;
            }
        }
        int rowOfMax = 0;
        int colOfMax = 0;
        double max = arrayNum[rowOfMax][colOfMax];
        for (byte i = 0; i < row; i++) {
            for (byte j = 0; j < col; j++) {
                if (arrayNum[i][j] > max) {
                    max = arrayNum[i][j];
                    rowOfMax = i;
                    colOfMax = j;
                }
            }
        }
        System.out.println("Max is " + max + " at row : " + (rowOfMax+1) + " and col : " + (colOfMax+1));

    }

}
