package _03_array_and_method.bai_tap;

import java.util.Scanner;

public class CharacterInString {
    public static void main(String[] args) {
        byte count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a String");
        String str = scanner.nextLine();
        System.out.println("Input a character");
        char k = scanner.next().charAt(0);
        for (byte i = 0 ; i< str.length();i++){
            if(str.charAt(i)==k){
                count++;
            }
        }
        System.out.println(count);
    }
}
