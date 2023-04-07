package nl.corne.chainstoremicro;

public class GoldCard extends Card {

    private int discount;
    public GoldCard(String customerName, int customerId, double customerBalance) {
        super(customerName, customerId, customerBalance);
    }

    public boolean pay(int amount) {
        super.setCustomerBalance(super.getCustomerBalance() - (amount - (amount / 100 * discount)));
        return true;
    }

    @Override
    public String toString() {
        return "GoldCard {" +
                "customerName='" + super.getCustomerName() + '\'' +
                ", customerId=" + super.getCustomerId() +
                ", customerBalance=" + super.getCustomerBalance() +
                '}';
    }

    public int getDiscount() {
        return discount;
    }
    public void setDiscount(int discount) {
        if (discount < 1 && discount > 30) {
            throw new IllegalArgumentException();
        }
        this.discount = discount;
    }
    // balance may be negative

    // offered a discount
}
