package _11_dsa_stack_queue.bai_tap.reserve;


import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseIntergerArray {

    public static void main(String[] args) {
        int amountNumber;
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> number = new Stack<>();
        System.out.println("Input amount of number");
        amountNumber = scanner.nextInt();
        int[] arrayInterger = new int[amountNumber];
        for (int i = 0; i < amountNumber; i++) {
            System.out.println("Input a number");
            int numberOfArray = scanner.nextInt();
            arrayInterger[i] = numberOfArray;
        }
        for (int i = 0; i < amountNumber; i++) {
            number.push(arrayInterger[i]);
        }
        for (int i = 0; i < amountNumber; i++) {
            arrayInterger[i] = number.pop();
        }
        System.out.println(Arrays.toString(arrayInterger));
    }
}
