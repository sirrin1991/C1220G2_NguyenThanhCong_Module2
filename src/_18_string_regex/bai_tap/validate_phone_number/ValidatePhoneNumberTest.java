package _18_string_regex.bai_tap.validate_phone_number;

import java.util.Scanner;

public class ValidatePhoneNumberTest {
    public static void main(String[] args) {
        ValidatePhoneNumber validatePhoneNumber = new ValidatePhoneNumber();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Input a phone number");
            String phoneNumber = scanner.nextLine();
            if(validatePhoneNumber.validatePhoneNumber(phoneNumber)){
                break;
            }
        }
    }
}
