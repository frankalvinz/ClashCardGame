package PlayingCard;

import java.util.Random;

/**
 *
 * @author me
 */
public class deckOfcard {
    public Card[] deck; // declare a array of Card data type (Card is a class which is  a self define data type)
    private int currentCard;
    private static final int NUMBER_OF_CARD = 52; // constant for number of cards in one deck
    private static final Random rNo = new Random(); // for get the random number

    // constructor of the class
    public deckOfcard() {
        // array for named all the faces of the deck
        String[] face = {"King", "Queen", "Jack", "Ten", "Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Deuce", "Ace"};
        // array for named all the suit/ shapes of the deck
        String[] suit = {"Heart", "Diamond", "spade", "club"};
        int id = 11;// for get the ID , Id Starts from 11
        int cV = 13;// for set the value of card..king has 13 and then lesser than king
        deck = new Card[NUMBER_OF_CARD];// so that only 52 card can be save
        currentCard = 0;

        for (int i = 0; i < deck.length; i++) {
            deck[i] = new Card(face[i % 13], suit[i / 13], id, cV); // for getting the card from all the suit of all the faces
            id++;// for plus the Id
            cV--;// for decrease the value of card than it greater cards
            if (cV == 0) {
                cV = 13;
            }
        }
    }
    // for shuffle the cards

    public void shuffle() {
        currentCard = 0;
        for (int first = 0; first < deck.length; first++) {
            int second = rNo.nextInt(NUMBER_OF_CARD); // variable which have to generate a random number
            //shuffling process
            //example:
            // a=temp
            //a==b
            //b==temp

            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }// ending of for loop

    }// shuffle function ends here

    public Card dealCard() {
        if (currentCard < deck.length) {
            return deck[currentCard++];// for getting the card from the deck and if card is more than 52 (length of deck)then it will null
        } else {
            return null;
        }

    }//card deal Card ends here
}
