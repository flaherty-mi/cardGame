package cardGame;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Card extends cardMain {
    public static final int cardNum = 52;
    public Card() {
        ArrayList<String> Value = new ArrayList<>();
        Value.add("Ace");
        Value.add("Two");
        Value.add("Three");
        Value.add("Four");
        Value.add("Five");
        Value.add("Six");
        Value.add("Seven");
        Value.add("Eight");
        Value.add("Nine");
        Value.add("Ten");
        Value.add("Jack");
        Value.add("Queen");
        Value.add("King");

        ArrayList<String> Suit = new ArrayList<>();
        Suit.add("Hearts");
        Suit.add("Diamonds");
        Suit.add("Clubs");
        Suit.add("Spades");
        // String[] Suit = {"Hearts", "Diamonds", "Clubs", "Spades"};

        Card[] deck = new Card[cardNum];

        for(int count = 0; count< deck.length; count++) {
            deck[count] = new Card(Value.get(count % 13), Suit.get(count / 13));
            System.out.println(deck[count]);
        } // end for loop
        System.out.println("this is working");
        ///
        //         List<Card> deckMix = Arrays.asList(deck);
        //             Collections.shuffle(deckMix);
        //             deckMix.toArray(new Card[0]);
        //             System.out.print(deckMix);
        // /

    } // end of card method
} // end of class

