package cardGame;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class cardManager extends cardMain {
    // using array list of the type: card
    private ArrayList<Card> deck;

    // final int for deck size [52 cards]
    public static final int cardNum = 52;

    // constructor for creating deck
    public cardManager() {
        // use methods from card class to fill values
        List<String> Values = Card.valueNames();
        List<String> Suits = Card.suitNames();

        // initializing deck
        deck = new ArrayList<>();
        for(String Value:Values) {
            for(String Suit:Suits)
                deck.add(new Card(Value, Suit));
        Collections.shuffle(deck);

        for(int i = 0; i < deck.toArray().length; i ++) {
            deck.get(i);
        }
        }
    } // end of cardManager constructior


    public void firstDeal() {
        // do while loop for pulling cards
        
        for(int i = 0; i < deck.toArray().length; i ++) {
            if (i < 3) {
            deck.get(i);
            System.out.println(deck(i));
            }
            else if (i = 4) {
                deck.get(i);
            }
            else {
            } // end if else
        } // end for loop
        
         


    }

} // end of class
