package _18_string_regex.bai_tap.validate_phone_number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    private static final String PHONENUMBER_REGEX ="^\\(\\d{2}\\)\\-\\([0]\\d{9}\\)$";
    private static Pattern pattern;
    private Matcher matcher;

    public ValidatePhoneNumber() {
    }

    public boolean validatePhoneNumber(String regex){
        ValidatePhoneNumber.pattern = Pattern.compile(PHONENUMBER_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

