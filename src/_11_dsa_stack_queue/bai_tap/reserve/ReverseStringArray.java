package _11_dsa_stack_queue.bai_tap.reserve;

import java.util.*;

public class ReverseStringArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string");
        String string = scanner.nextLine();
        String[] arrayString = string.split("");
        Stack<String> stackString = new Stack<>();
        stackString.addAll(Arrays.asList(arrayString));
        String[] newArrayString = new String[arrayString.length];
        for(int i = 0; i<arrayString.length;i++){
            System.out.println(stackString.peek());
            newArrayString[i] = stackString.pop();
        }


        System.out.println(Arrays.toString(newArrayString));

    }
}
