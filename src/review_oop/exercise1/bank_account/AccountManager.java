package review_oop.exercise1.bank_account;

import java.util.*;

public class AccountManager {
    Map<Long, Account> accountMap = new TreeMap<>();
    Scanner scanner = new Scanner(System.in);

    public AccountManager(Map<Long, Account> accountMap) {
        this.accountMap = accountMap;
    }

    public Map<Long, Account> getAccountMap() {
        return accountMap;
    }

    public void setAccountMap(Map<Long, Account> accountMap) {
        this.accountMap = accountMap;
    }

    public void addNewAccount() {
        System.out.println("input an account's ID");
        long accountID = Long.parseLong(scanner.nextLine());
        System.out.println("Input account's money");
        double accountMoney = Double.parseDouble(scanner.nextLine());
        System.out.println("Input an account's name");
        String accountName = scanner.nextLine();
        accountMap.put(accountID, new Account(accountID, accountName, accountMoney));
    }

    public void showAccountMap() {
        System.out.println("______________________________");
        Set<Long> keySet = accountMap.keySet();
        for (Long key : keySet) {
            System.out.println(key + "-" + accountMap.get(key));
        }
        System.out.println("______________________________");

    }

    public void sendMoneyToAccount() {
        System.out.println("Input an account's ID");
        long accountID = Long.parseLong(scanner.nextLine());
        if (accountMap.containsKey(accountID)) {
            System.out.println("Input money");
            double money = Double.parseDouble(scanner.nextLine());
            if (money < 0) {
                System.out.println("Warning: The money can't less than 0 ");
                return;
            }
            double accountMoney = accountMap.get(accountID).getAccountMoney() + money;
            accountMap.get(accountID).setAccountMoney(accountMoney);
        } else {
            System.out.println("Do not have this account's ID");
        }
    }

    public void withdrawMoney() {
        System.out.println("Input an account's ID");
        long accountID = Long.parseLong(scanner.nextLine());
        if (accountMap.containsKey(accountID)) {
            System.out.println("Input money");
            double money = Double.parseDouble(scanner.nextLine());
            if (checkMoney(money, accountMap.get(accountID))) {
                double accountMoney = accountMap.get(accountID).getAccountMoney();
                double expenses = accountMap.get(accountID).getEXPENSES();
                double tempMoney = accountMoney - money -expenses;
                accountMap.get(accountID).setAccountMoney(tempMoney);
            } else {
                System.out.println("Warning : incorrect money");
            }
        } else {
            System.out.println("Do not have this account's ID");

        }
    }

    public void transfer() {
        System.out.println("Input an account's ID");
        long accountID = Long.parseLong(scanner.nextLine());
        if (accountMap.containsKey(accountID)) {
            System.out.println("Input an account's ID");
            long accountID2 = Long.parseLong(scanner.nextLine());
            if (accountMap.containsKey(accountID2)) {
                System.out.println("Input money");
                double money = Double.parseDouble(scanner.nextLine());
                if (checkMoney(money, accountMap.get(accountID))) {
                    double tempMoney = accountMap.get(accountID).getAccountMoney() - money;
                    accountMap.get(accountID).setAccountMoney(tempMoney);
                    tempMoney = accountMap.get(accountID2).getAccountMoney() + money;
                    accountMap.get(accountID2).setAccountMoney(tempMoney);
                } else {
                    System.out.println("Warning : incorrect money");
                }
            } else {
                System.out.println("Do not have this account's ID");
            }
        } else {
            System.out.println("Do not have this account's ID");
        }
    }

    public void maturity(){
        System.out.println("Input an account's ID");
        long accountID = Long.parseLong(scanner.nextLine());
        if (accountMap.containsKey(accountID)){
            double accountMoney = accountMap.get(accountID).getAccountMoney();
            double interest = accountMap.get(accountID).getBANK_INTEREST();
            accountMoney = accountMoney + accountMoney*interest;
            accountMap.get(accountID).setAccountMoney(accountMoney);
        }
    }

    public boolean checkMoney(double money, Account account) {
        return !(money < 0) && !(money > account.getAccountMoney());
    }

    public void displayMainMenu() {
        System.out.println("Menu :\n" +
                "1.Add new Account\n" +
                "2.Send money to the account\n" +
                "3.Transfer\n" +
                "4.Withdraw Money\n" +
                "5.Show List \n" +
                "6.Maturity\n" +
                "7.Exit");
    }

    public void choice() {
        boolean check= true;
        int choice;
        do {
            System.out.println("Input your choice : ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addNewAccount();
                    displayMainMenu();
                    choice();
                    break;
                case 2:
                    sendMoneyToAccount();
                    displayMainMenu();
                    choice();
                    break;
                case 3:
                    transfer();
                    displayMainMenu();
                    choice();
                    break;
                case 4:
                    withdrawMoney();
                    displayMainMenu();
                    choice();
                    break;
                case 5:
                    showAccountMap();
                    displayMainMenu();
                    choice();
                    break;
                case 6:
                    maturity();
                    displayMainMenu();
                    choice();
                    break;
                case 7:
                    System.out.println("-------Good Bye-------");
                    System.exit(0);
                default:
                    System.out.println("Warning : Error choice");
                    System.out.println("________________________");
                    check = false;
                    displayMainMenu();
                    choice();
            }
        } while (check);
    }
}
