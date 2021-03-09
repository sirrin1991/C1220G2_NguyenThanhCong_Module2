package review_oop.exercise1.bank_account;

import java.util.*;

public class AccountManagerController {
    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager(new TreeMap <Long,Account>());
        accountManager.displayMainMenu();
        accountManager.choice();
    }
}
