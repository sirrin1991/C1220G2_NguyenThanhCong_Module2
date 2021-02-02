package _03_array_and_method.bai_tap;

import java.util.Scanner;

public class SumNumOfDiagonalLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] arrayNum = new double[5][5];
        for (byte i = 0; i < 5; i++) {
            for (byte j = 0; j < 5; j++) {
                System.out.println("Input a number");
                double number = scanner.nextDouble();
                arrayNum[i][j] = number;
            }
        }
        double sum = 0.0d;
        for (byte i = 0; i < 5; i++) {
            for (byte j = 0; j < 5; j++) {
                if (i == j || (i+j)==arrayNum.length-1){
                    sum += arrayNum[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
