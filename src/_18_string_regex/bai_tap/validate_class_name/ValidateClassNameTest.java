package _18_string_regex.bai_tap.validate_class_name;

import java.util.Scanner;

public class ValidateClassNameTest {
    public static void main(String[] args) {
        ValidateClassName validateClassName = new ValidateClassName();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Input a class name");
            String className = scanner.nextLine();
            if(validateClassName.validate(className)){
                break;
            }
        }
    }
}
