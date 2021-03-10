package _18_string_regex.bai_tap.validate_class_name;

import _18_string_regex.thuc_hanh.validate_account.ValidateAccount;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class  ValidateClassName {
    private static final String CLASSNAME_REGEX = "^[CAP]\\d{4}[GHIKLM]$";
    private static Pattern pattern ;
    private Matcher matcher;

    public ValidateClassName() {
    }

    public boolean validate(String regex){
        ValidateClassName.pattern = Pattern.compile(CLASSNAME_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
