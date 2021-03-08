package _15_exception_debug.thuc_hanh;

import java.util.Scanner;

public class UseArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayInteger = new int[100];
        for (int i = 0 ; i < 100 ; i ++){
            arrayInteger[i] = (int) (Math.random()*100 +1);
            System.out.println(arrayInteger[i]);
        }
        try {
            System.out.println("Input a index");
            int index = scanner.nextInt();
            int number = arrayInteger[index];
            System.out.println("The number at " + index + " is " + number);
        }catch (IndexOutOfBoundsException exception){
            System.out.println("Error index");
        }catch (Exception ex){
            System.out.println("Index have to a number");
        }
    }
}
