package nl.corne;

import java.util.ArrayList;

public class Order {
    public ArrayList<Item> orderedItems = new ArrayList<>();
    private double totalPrice;

    public void addItemOrder(Item item) {
        orderedItems.add(item);
    }

    public void showOrderedItems(Order orderedItems) {
        System.out.println("Your cart contains: ");
        for (int i = 0; i < this.getOrderedItems().size(); i++) {
            Item orderedItem = orderedItems.getOrderedItems().get(i);

            System.out.println("__________________");
            System.out.println("Description: " + orderedItem.getDescription());
            System.out.println("Price: €" + orderedItem.getPrice());
        }
    }

    public void showLastAddedItem(Order orderedItems) {
        int index = orderedItems.getOrderedItems().size() - 1;
        System.out.println("You added: " + orderedItems.getOrderedItems().get(index).getDescription());
    }

    public double calculateTotalPrice(Order orderedItems) {
        for (int i = 0; i < this.getOrderedItems().size(); i++) {
            Item orderedItem = orderedItems.getOrderedItems().get(i);
            totalPrice += orderedItem.getPrice();
        }
        return totalPrice;
    }


    public ArrayList<Item> getOrderedItems() {
        return orderedItems;
    }
};




