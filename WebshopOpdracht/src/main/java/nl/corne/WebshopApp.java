package nl.corne;

import java.util.Scanner;

public class WebshopApp {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Articles articles = new Articles();

        articles.addItem(new Item(1, 50, "een broek"));
        articles.addItem(new Item(2, 20, "een shirt"));
        articles.addItem(new Item(3, 40, "twee schoenen"));
        articles.addItem(new Item(4, 75, "een jas"));
        articles.addItem(new Item(5, 10, "een muts"));
        articles.addItem(new Item(6, 4, "twee sokken"));


        System.out.println("Please enter your name: ");
        String customerName = scan.nextLine();
        System.out.println("Where do you live?: ");
        String customerResidence = scan.nextLine();
        Customer customer = new Customer(customerName, customerResidence);
        System.out.println("Welcome " + customerName + " from " + customerResidence);

        while (true) {
            System.out.println("Do you want to see all the items? (yes/no)");
            String response = scan.nextLine();
            if (response.equals("yes")) {
                customer.browseItems(articles);
                break;
            }
            if (response.equals("no")) {
                System.out.println(":-(");
                System.exit(1);
            }
        }
        Order order;
        while (true) {
            System.out.println("Do you want to place an order? (yes/no)");
            String response = scan.nextLine();
            if (response.equals("yes")) {
                order = new Order();
                break;
            }
            if (response.equals("no")) {
                System.out.println(":-(");
                System.exit(1);
            }
        }

        exit:
        while (true) {
            System.out.println("What item do you want to order? (Item ID)");
            int id = scan.nextInt();
            customer.orderItem(id, articles, order);
            scan.nextLine();
            order.showLastAddedItem(order);

            while (true) {
                System.out.println("Do you want to add another item to your order? (yes/no)");
                String response = scan.nextLine();
                if (response.equals("yes")) {
                    break;
                }
                if (response.equals("no")) {
                    order.showOrderedItems(order);
                    double total = order.calculateTotalPrice(order);
                    System.out.println("The total price is: €" + total);
                    break exit;
                }
                System.out.println("I did not understand that");
            }
        }

    }
}
