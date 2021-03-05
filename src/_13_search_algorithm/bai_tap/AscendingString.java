package _13_search_algorithm.bai_tap;

import java.util.*;

public class AscendingString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a String");
        String string = scanner.nextLine();
        Stack<Character> stackChar = new Stack<>();
        stackChar.push(string.charAt(0));
        for ( int i = 1 ; i < string.length();i++){
            if(string.charAt(i)>=stackChar.peek()){
                stackChar.push(string.charAt(i));
            }
        }
        StringBuilder ascendingString = new StringBuilder();
        for (Character c : stackChar) {
            ascendingString.append(c);
        }
        System.out.println(ascendingString);
    }
}

