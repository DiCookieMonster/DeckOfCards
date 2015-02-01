/**
 * 10/11/2014
 * @author DinaSu
 */

import java.util.ArrayList;


public class Player {
    
    private ArrayList<Card> player;
    


    /* Basic constructor */

    public Player(){
        player = new ArrayList<Card>(); //initializing the player
        }
    
    /**
    * Adding a Card to the Hand
    * @param newCard adds the new Card. 
    */
    public void addCard(Card newCard)  {  player.add(newCard);  } 
    public void addCardToBegining(Card newCard) {  player.add(0,newCard); }
    public int getLastIndex() { return player.size()-1;  }
    
    public Card removeTheCard()
    {   Card tempCard;
        if(player.isEmpty())
            tempCard= null;
        else
            tempCard=player.remove(player.size()-1);
        return tempCard;
    } 
    
    /**
    * The toString() of Cards.
    * @return A string that represents the Cards in Hand
    */
    public String showHand(){ // it's like the toString() of Hand.
        String str = "";
        str += player.remove(player.size() - 1).toString()+ ".\n";
        return str;
    }
         
}
