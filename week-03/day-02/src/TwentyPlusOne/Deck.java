package TwentyPlusOne;

import ParkingLot.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    ArrayList<Card> deck = new ArrayList<>();

    public Deck() {
        for (int i = 0; i < Color.values().length; i++) {
            for (int j = 0; j < Suit.values().length; j++) {
                for (int k = 0; k < Rank.values().length; k++) {
                    deck.add(new Card(i, j, k));
                }
            }
        }
        for (int v = deck.size() - 1; v >= 0; v--) {
            if ((deck.get(v).color.equals("RED")) && ((deck.get(v).suit.equals("SPADES")) | (deck.get(v).suit.equals("CLUBS")))) {
                deck.remove(v);
            } else if ((deck.get(v).color.equals("BLACK")) && ((deck.get(v).suit.equals("HEARTS")) | (deck.get(v).suit.equals("DIAMONDS")))) {
                deck.remove(v);
            }
        }
    }

    public int getDeckL() {
        return deck.size();
    }

    public Card getCard(int i) {
        return deck.get(i);
    }

    public void shuffleDeck() {
        Collections.shuffle(deck);
    }

    public Card pullFirst() {
        Card x = deck.get(0);
        deck.remove(0);
        System.out.println("Card pulled : " + x.color + " " + x.suit + " " + x.rank);
        return x;
    }

    public Card pullLast() {
        Card x = deck.get(deck.size() - 1);
        deck.remove(deck.size() - 1);
        System.out.println("Card pulled : " + x.color + " " + x.suit + " " + x.rank);
        return x;
    }

    public Card pullRandom() {
        Random r = new Random();
        Card x = deck.get(r.nextInt(deck.size() - 1));
        deck.remove(r.nextInt(deck.size() - 1));
        System.out.println("Card pulled : " + x.color + " " + x.suit + " " + x.rank);
        return x;
    }
}