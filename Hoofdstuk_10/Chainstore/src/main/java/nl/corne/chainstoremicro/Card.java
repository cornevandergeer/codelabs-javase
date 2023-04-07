package nl.corne.chainstoremicro;

public abstract class Card {

    private String customerName;
    private int customerId;
    private double customerBalance;

    public Card(String customerName, int customerId, double customerBalance) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.customerBalance = customerBalance;
    }

    public abstract boolean pay(int amount);


    @Override
    public String toString() {
        return "Card{" +
                "customerName='" + customerName + '\'' +
                ", customerId=" + customerId +
                ", customerBalance=" + customerBalance +
                '}';
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public double getCustomerBalance() {
        return customerBalance;
    }

    public void setCustomerBalance(double customerBalance) {
        this.customerBalance = customerBalance;
    }
}
