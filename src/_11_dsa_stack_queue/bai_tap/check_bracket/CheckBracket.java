package _11_dsa_stack_queue.bai_tap.check_bracket;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {
        boolean check = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an expression");
        String expression = scanner.nextLine();
        String[] stringExpression = expression.split("");
        Stack<String> stackString = new Stack<>();
        for (String element : stringExpression) {
            if (element.equals("(")) {
                stackString.push(element);
            }
            if (element.equals(")")) {
                if (stackString.isEmpty()) {
                    check = false;
                    break;
                } else {
                    stackString.pop();
                }
            }
        }
        if(!check || !stackString.isEmpty()){
            System.out.println("Expression is false");
        }else {
            System.out.println("Expression is true");
        }
    }
}
