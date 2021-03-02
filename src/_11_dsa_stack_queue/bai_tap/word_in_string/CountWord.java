package _11_dsa_stack_queue.bai_tap.word_in_string;

import java.util.*;

public class CountWord {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Input a string");
        String string = scanner.nextLine();
        string = string.toLowerCase();
        String[] strings = string.trim().split( " ");
        ArrayList<String> stringArray = new ArrayList<>();
        for (String s : strings) {
            if (!s.equals("")) {
                stringArray.add(s);
                System.out.println(s);
            }
        }

        Map<String , Integer> stringMap = new TreeMap<>();
        for (String s : stringArray) {
            if (stringMap.containsKey(s)) {
                stringMap.replace(s, stringMap.get(s) + 1);
            } else {
                stringMap.put(s, 1);
            }
        }
        System.out.println(stringMap);
    }
}
