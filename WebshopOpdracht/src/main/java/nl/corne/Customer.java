package nl.corne;

public class Customer {
    private String name;
    private String placeOfResidence;

    public Customer(String name, String placeOfResidence) {
        this.name = name;
        this.placeOfResidence = placeOfResidence;
    }
    
    public void browseItems(Articles articles) {
        for (int i = 0; i < articles.getItems().size(); i++) {
            System.out.println("----------------------------------");
            System.out.println("ID: " + articles.getItems().get(i).getId());
            System.out.println("Price: €" + articles.getItems().get(i).getPrice());
            System.out.println("Description: " + articles.getItems().get(i).getDescription());
            System.out.println("----------------------------------");
        }
    };

    public void orderItem(int articleId, Articles articles, Order order) {
        for (int i = 0; i < articles.getItems().size(); i++) {
            if (articleId == articles.getItems().get(i).getId()) {
                order.addItemOrder(articles.getItems().get(i));
            }
        }
    }

    public String getName() {
        return name;
    }

    public String getPlaceOfResidence() {
        return placeOfResidence;
    }
}
