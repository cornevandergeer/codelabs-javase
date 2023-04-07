package nl.corne;

public class BankAccount {
    public static final double INTEREST_RATE = 0.05;
    private int accountNumber;
    private double balance;


    public BankAccount() {
    }

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double calculateInterest() {
        return this.balance * INTEREST_RATE;
    }

    public void deposit(double money) {
        this.balance += money;
    }

    public void withdraw(double money) {
        if (canWithdraw(money)) {
            this.balance -= money;
        } else {
            throw new IllegalArgumentException("you broke!");
        }
    }

    public boolean canWithdraw(double money) {
        if (this.getBalance() - money < 0) {
            return false;
        } else {
            return true;
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}
