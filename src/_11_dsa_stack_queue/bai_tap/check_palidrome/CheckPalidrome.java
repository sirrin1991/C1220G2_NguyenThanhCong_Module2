package _11_dsa_stack_queue.bai_tap.check_palidrome;

import java.util.*;

public class CheckPalidrome {
    public static void main(String[] args) {
        boolean checkPalidrome = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a String");
        String a = scanner.nextLine();
        String[] b = a.split("");
        Stack<String> arrayStackString = new Stack<>();
        Queue<String> arrayQueueString = new LinkedList<>(Arrays.asList(b));
        arrayStackString.addAll(Arrays.asList(b));
        boolean check = arrayStackString.pop().equals(arrayQueueString.poll());
        for (int i = 0 ; i <b.length;i++){
            if (!check) {
                checkPalidrome = false;
                break;
            }
        }
        System.out.println(checkPalidrome);
    }
}
