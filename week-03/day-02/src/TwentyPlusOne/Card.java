package TwentyPlusOne;

import java.util.ArrayList;

public class Card {
    Color[] c = Color.values();
    Suit[] s = Suit.values();
    Rank[] r = Rank.values();
    String color;
    String suit;
    String rank;
    int rankValue;

    public Card(int x, int y, int z) {
        this.color = c[x].toString();
        this.suit = s[y].toString();
        this.rank = r[z].toString();
        this.rankValue = r[z].getValue();
    }
 }