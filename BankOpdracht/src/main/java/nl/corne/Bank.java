package nl.corne;

import java.util.ArrayList;

public class Bank {
    private static final Bank rabobank = new Bank();
    private static final Bank ing = new Bank();

    private ArrayList<BankAccount> accounts = new ArrayList<>();

    private Bank() {
    }

    public static Bank getRabobank() {
        return rabobank;
    }

    public static Bank getIng() {
        return ing;
    }

    public void addAccount(BankAccount newAccount) {
        accounts.add(newAccount);
    }

    public void transferMoney(double moneyAmount, BankAccount from, BankAccount to) {
        from.withdraw(moneyAmount);
        to.deposit(moneyAmount);
    }

    public BankAccount getAccount(int index) {
        return accounts.get(index);
    }

}
