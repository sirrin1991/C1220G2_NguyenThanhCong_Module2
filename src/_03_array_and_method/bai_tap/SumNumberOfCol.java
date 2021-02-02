package _03_array_and_method.bai_tap;

import java.util.Scanner;

public class SumNumberOfCol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Row : ");
        int row = scanner.nextInt();
        System.out.println("Input Col : ");
        int col = scanner.nextInt();
        double[][] arrayNum = new double[row][col];
        for (byte i = 0; i < row; i++) {
            for (byte j = 0; j < col; j++) {
                System.out.println("Input a number");
                double number = scanner.nextDouble();
                arrayNum[i][j] = number;
            }
        }
        System.out.println("input the column you want to sum : ");
        int sumCol = scanner.nextInt();
        double sum = 0.0d;
        for (int i = 0; i< row;i++){
            sum += arrayNum[i][sumCol];
        }
        System.out.println("Result : " + sum);
    }
}
