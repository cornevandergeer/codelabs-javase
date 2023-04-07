package nl.corne;

public class BankApp {
    public static void main(String[] args) {

        Bank rabobank = Bank.getRabobank();
        for (int i = 0; i < 10; i++) {
            rabobank.addAccount(new BankAccount());
            rabobank.getAccount(i).setAccountNumber(i + 1);
            rabobank.getAccount(i).deposit(100 * (i + 1));
        }

        Bank ing = Bank.getIng();
        ing.addAccount(new BankAccount());
        ing.getAccount(0).setAccountNumber(1);
        ing.getAccount(0).deposit(5000);

        Bank sns = Bank.getIng();

        System.out.println(sns.getAccount(0).getBalance());

//
//        rabobank.transferMoney(200, rabobank.getAccount(5), rabobank.getAccount(7));
//        double sum = 0;
//        for (int i = 0; i < 10; i++) {
//            sum += rabobank.getAccount(i).getBalance();
//            System.out.println("account number is: " + rabobank.getAccount(i).getAccountNumber()
//                    + " with a balance of: €" + rabobank.getAccount(i).getBalance()
//                    + " and the interest for one year is: €" + rabobank.getAccount(i).calculateInterest());
//        }
//        System.out.println("The total amount in the bank is: €" + sum);
    }
}
