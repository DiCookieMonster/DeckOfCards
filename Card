/**
 * 10/11/2014
 * @author DinaSu
 */


public class Card {
    private int face;
    private String name;
    private String suite;
    
    
    public Card()
    { 
        face=0;
        suite="";
    }
    public Card(String CardFace, String CardSuite){
        face = initializeValueCard(CardFace);
        suite = CardSuite;
        }
    
/**
*
* @param CardFace Gets the number on the card as a String and assigns each a value. 
* @return value of card
*/
    private int initializeValueCard(String CardFace){
        int value=0;
        switch(CardFace){ 
            case "Deuce":
                value = 2;
                name = "Deuce";
                break;
            case "Three":
                value = 3;
                name = "Three";
                break;
            case "Four":
                value = 4;
                name = "Four";
                break;
            case "Five":
                value = 5;
                name = "Five";
                break;
            case "Six":
                value = 6;
                name = "Six";
                break;
            case "Seven":
                value = 7;
                name = "Seven";
                break;
            case "Eight":
                value = 8;
                name = "Eight";
                break;
            case "Nine":
                value = 9;
                name = "Nine";
                break;
            case "Ten":
                value = 10;
                name = "Ten";
                break;
            case "Jack":
                value = 10;
                name = "Jack";
                break;
            case "Queen":
                value = 10;
                name = "Queen";
                break;
            case "King":
                value = 10;
                name = "King";
                break;
            case "Ace":
                value = 11;
                name = "Ace";
                break;
            default:
                System.out.println("The card inputted value is wrong. Card has been set to \"1\".");
                value = 1;
                break;
        }
        return value;
    }
    /**
    * Gets Card value
    * @return the CardFace of the card
    */
    public int getCardValue() { return face; }
    public String getCardName() {return name; }
    /**
    * toString() of the Class
    * @return Name of Card as a String
    */
    public String toString(){ return name + " of " + suite; }
    }
