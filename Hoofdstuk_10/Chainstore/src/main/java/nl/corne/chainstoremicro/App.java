package nl.corne.chainstoremicro;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new RegularCard("Jan", 123,1000));
        cards.add(new RegularCard("Kees", 124,500));
        cards.add(new RegularCard("Piet", 125,100));
        cards.add(new GoldCard("Truus", 234,6000));
        cards.add(new GoldCard("Miep", 235,11100));

        System.out.println(cards.get(0).toString());


    }
}
