/**
 * 10/11/2014
 * @author DinaSu
 */

import java.util.Random;
import java.util.ArrayList;


public class DeckOfCards {
    private ArrayList<Card> deck; //Array of cards
    private int currentCard; // index of next card to deal    
    private static final int NUMBER_OF_CARDS = 52; //constant number of cards in deck
    private static final Random randomNumbers = new Random(); //random for shuffling

/**
* The constructor
* Takes all the permutations of suites & faces and feeds them into the card array.
*/
    public DeckOfCards(){
        String[] faces = {"Deuce", "Three", "Four", "Five", "Six", "Seven",
        "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
        String[] suites = {"Hearts", "Diamonds", "Clubs", "Spades"};
        deck = new ArrayList<Card>();
        currentCard = 0;
        
        for (int count = 0; count < NUMBER_OF_CARDS  ; count++)
            deck.add( new Card(faces[count % 13], suites[count/13]));
        }
/**
* Shuffles the Deck, using the random number generator to switch cards.
* From Java Book.
*/
    public void shuffle(){
        currentCard = 0;
        if(deck.size() != 0)
            {for ( int first = 0; first < deck.size()-1 ; first++)
               { 
                int second = randomNumbers.nextInt(deck.size()-1);
                Card temp = deck.remove(first); //switches places of cards that were in the place that was generated randomly
                deck.add(first,deck.remove(second));
                deck.add(second,temp);
                } 
            }
        } 
/**
* @return a deck, or if fails, null (Not supposed to go over 52 cards anyway).
*/
    public Card dealCard(){
        if (currentCard < NUMBER_OF_CARDS && deck.size() != 0)
            return deck.remove(currentCard);
        else
            return null;
        } 
}
