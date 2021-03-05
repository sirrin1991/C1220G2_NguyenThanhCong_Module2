package _13_search_algorithm.bai_tap;

import java.util.*;

public class ConsecutiveString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string");
        String string = scanner.nextLine();
        Stack<Character> characters = new Stack<>();
        int tempSize = 0;
        Stack<Character> tempStack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            characters.push(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) >= characters.peek()) {
                    characters.push(string.charAt(j));
                } else {
                    break;
                }
            }
            if (tempSize < characters.size()) {
                tempStack.clear();
                tempSize = characters.size();
                for (Character c : characters) {
                    tempStack.push(c);
                }
                characters.clear();
            }
            i = i + tempSize - 1;
        }
        StringBuilder consecutiveString = new StringBuilder();
        for (Character c : tempStack) {
            consecutiveString.append(c);
        }
        System.out.println(consecutiveString);
    }
}
