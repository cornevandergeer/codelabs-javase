package nl.corne.chainstoremicro;

public class RegularCard extends Card {
    public RegularCard(String customerName, int customerId, double customerBalance) {
        super(customerName, customerId, customerBalance);
    }

    public boolean pay(int amount) {
        if (super.getCustomerBalance() - amount > 0) {
            super.setCustomerBalance(super.getCustomerBalance() - amount);
            return true;
        }
        System.out.println("not enough money");
        return false;
    }

    @Override
    public String toString() {
        return "RegularCard {" +
                "customerName='" + super.getCustomerName() + '\'' +
                ", customerId=" + super.getCustomerId() +
                ", customerBalance=" + super.getCustomerBalance() +
                '}';
    }

    // balance can't be negative

    // no discount

}
