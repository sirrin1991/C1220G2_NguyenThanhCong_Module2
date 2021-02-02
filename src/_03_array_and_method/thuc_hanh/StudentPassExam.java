package _03_array_and_method.thuc_hanh;

import java.util.Scanner;

public class StudentPassExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte amount = 0;
        byte count = 0;
        boolean check;
        do {
            check = false;
            System.out.println("Input Amount of students");
            amount = scanner.nextByte();
            if (amount <= 0 || amount > 30) {
                check = true;
            }
        } while (check);
        byte[] arrayPoint = new byte[amount];
        for ( byte i = 0 ; i < amount;i++){
            System.out.println("Input a point");
            byte point = scanner.nextByte();
            if (0<=point && point<=10){
                arrayPoint[i]=point;
            }else{
                System.out.println("Wrong Point");
                i--;
            }

        }
        for (byte b : arrayPoint) {
            if (b >= 5) {
                count++;
            }
        }
        System.out.println("Number of students passed the final exam is " + count);
    }
}
