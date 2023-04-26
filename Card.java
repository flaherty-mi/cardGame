package cardGame;
import java.util.Arrays;
import java.util.List;

public class Card extends cardMain {
    // string order values
    private String Value, Suit;

    // card constructor
    public Card(String value, String suit) {
        setValue(value);
        setSuit(suit);
    }
    // setting values for card numbers
    public void setValue(String value) {
        List<String> checkValueNames = valueNames();
        if(checkValueNames.contains(Value)) {
            Value = value;
        }
    }
    // setting values for suits
    public void setSuit(String suit) {
        List<String> checkSuitNames = suitNames();
        if(checkSuitNames.contains(Suit)) {
            Suit = suit;
        }
    }
    // correcting print of cards with spaces
    public String toString() {
        return String.format("%s of %s", Value, Suit);
    }
    // method that returns the values for cards
    public static List<String> valueNames() {
        return Arrays.asList("Ace", "Two", "Three", "Four", "Five", "Six", "Seven",
                "Eight", "Nine", "Ten", "Jack", "Queen", "King");
    }
    // method that returns suit values for cards
    public static List<String> suitNames() {
        return Arrays.asList("Hearts", "Diamonds", "Clubs", "Spades");
    }
}

