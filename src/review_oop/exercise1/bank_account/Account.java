package review_oop.exercise1.bank_account;

public class Account {
    private long accountID;
    private String accountName;
    private double accountMoney;
    private final double BANK_INTEREST = 0.035;
    private final double EXPENSES = 0.15;

    public Account(long accountID, String accountName, double accountMoney) {
        this.accountID = accountID;
        this.accountName = accountName;
        this.accountMoney = accountMoney;
    }

    public Account() {
    }

    public Account(long accountID, String accountName) {
        this.accountID = accountID;
        this.accountName = accountName;
        this.accountMoney = 50;
    }

    public long getAccountID() {
        return accountID;
    }

    public void setAccountID(long accountID) {
        this.accountID = accountID;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getAccountMoney() {
        return accountMoney;
    }

    public void setAccountMoney(double accountMoney) {
        this.accountMoney = accountMoney;
    }

    public double getBANK_INTEREST() {
        return BANK_INTEREST;
    }

    public double getEXPENSES() {
        return EXPENSES;
    }

    @Override
    public String toString() {
        return "Account{" +
                "Account's ID=" + accountID +
                ", Account's Name='" + accountName + '\'' +
                ", Account's Money=" + accountMoney +
                '}';
    }
}
