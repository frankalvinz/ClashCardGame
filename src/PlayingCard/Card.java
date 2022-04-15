package PlayingCard;

/**
 *
 * @author me
 */
public class Card {
    // fields for class
    public String face; // card number ace, deuce....
    public String suit;// signs of card hearts diamond ....
    public int cardId;// for card ID which is get from user
    public int cardValue;//

    // constructor for the class
    public Card(String faceOfcard, String suitOfcard, int id, int cV) {
        face = faceOfcard;
        suit = suitOfcard;
        cardId = id;
        cardValue = cV;

    }
    // only for get details of the class

    public String toString() {
        return cardId + ":- " + face + " of " + suit;// for get this kind of output "Ace of Heart"
    }// toString ends here

}
