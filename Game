/**
 * 10/11/2014
 * @author DinaSu
 */

import javax.swing.JOptionPane;
import java.util.ArrayList;


public class Game {

    
    private static final int DEAL = 52/2 ; // How many cards to deal.
    private Player FirstPlayer,SecondPlayer,TempForWar; 
    private DeckOfCards gameDeck; //The Game Deck
    private boolean isFirst;

    
    /**
    * The Constructor
    * Gets a deck, shuffles it and initializes the two players.
    */
    public Game(boolean _isFirst){
        init();
        isFirst = _isFirst;
        } 
    
    public Game(){ this(true);   }
    
    
    private void init()
    {
        gameDeck = new DeckOfCards(); //setting up a new deck
        gameDeck.shuffle(); // shuffle deck before starting to deal.
        FirstPlayer = new Player(); 
        SecondPlayer = new Player(); 
        //FirstPlayer.addCard(new Card());
        //SecondPlayer.addCard(new Card());
        TempForWar = new Player();
     }
    
    
    /**
    * Begins the game.
    */
    
    public void gameLogic()
    {
        if (isFirst)
        {
            JOptionPane.showMessageDialog(null,"Welcome to WarGame!");
            beginDeal(); 
        }
        while (determineWinLose() == 0)
            gameMove();
        newGame();
        } 
    
    
    /**
    * Deals cards to both players
    */
    private void beginDeal()
    {   
        for (int i = 0; i < DEAL; i++)
        {
            FirstPlayer.addCard(gameDeck.dealCard());
            SecondPlayer.addCard(gameDeck.dealCard());
        }
        
    }
    
    
    /**
    * Displays a dialogue that shows the player the cards he has in player and asks if the player wants to add a card to his player
    * @return An answer if the player wants to draw another card or to hold
    */
    private int drawCards(){
        int input = JOptionPane.showConfirmDialog(null, FirstPlayer.showHand() + SecondPlayer.showHand() +
                    "Would you like to continue the game?\n", "Draw another card?", 
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return input;
        }
    
    /**
     * function that is handling the state of war between the players
     * meaning if the 2 players had the same card 
     */
    private void War() 
    {   Player tempPlayer = new Player();
        Card First,Second;
        First=FirstPlayer.removeTheCard();
        Second=SecondPlayer.removeTheCard();
        
        for(int i=0;i<3;i++)
        {
            tempPlayer.addCardToBegining(First);
            tempPlayer.addCardToBegining(Second);
        }
        if(First.getCardValue() > Second.getCardValue())
            moveTheCardsTotheWinner(1,tempPlayer);
        if(First.getCardValue() < Second.getCardValue())
            moveTheCardsTotheWinner(2,tempPlayer);
    }
    
    
    /*
    * after war situation is handeled moves all the cards from the temp array list to the wining player
    */
    private void moveTheCardsTotheWinner(int winPlayer,Player tempPlayer)
    {
        for(int i=0;i<tempPlayer.getLastIndex();i++)
            if(winPlayer == 1)
                FirstPlayer.addCardToBegining(tempPlayer.removeTheCard());
            else if (winPlayer == 2)   
                SecondPlayer.addCardToBegining(tempPlayer.removeTheCard());   
    }
    
    /**
    * While the player wants to draw cards, draws.
    * If player busts, displays a message that stops the game and displays the results.
    */
    private void gameMove() 
    {   Card First,Second;
        First=FirstPlayer.removeTheCard();
        Second=SecondPlayer.removeTheCard();
        while (drawCards() == JOptionPane.YES_OPTION && determineWinLose() == 0) 
            { 
                if (First.getCardValue() > Second.getCardValue() )  
                {   FirstPlayer.addCardToBegining(First);
                    FirstPlayer.addCardToBegining(Second);
                }
                else if (First.getCardValue() < Second.getCardValue())
                {   SecondPlayer.addCardToBegining(First);
                    SecondPlayer.addCardToBegining(Second);
                }
                else 
                    War();
            }
            if (drawCards() == JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null, "Thank you for playing!\nBye Bye!","Game Over", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
                }
    }

    
    private int determineWinLose()
    {
      if(FirstPlayer.getLastIndex() <= 0)
        {   
            JOptionPane.showMessageDialog(null, "FirstPlayer won the WarGame!\n" + "FirsPlayer Has no Cards Left\n" +
                                                "SecondPlayr has " + SecondPlayer.getLastIndex() + " Cards left");
            return 1;
        }
      else if (SecondPlayer.getLastIndex() <= 0)
        {   
            JOptionPane.showMessageDialog(null,"SecondPlayr won the WarGame! \n" + "SecondPlayr Has no Cards Left\n" +
                                                "FirsPlayer has " + FirstPlayer.getLastIndex() + " Cards left");
            return 2;
        }
      else return 0;
    }
    
        
        
    /**
    * Asks the player if he wants to play again.
    **/
    private void newGame() 
    {
        int input = JOptionPane.showConfirmDialog(null, "Would you like to play again?\n","Game has ended",JOptionPane.YES_NO_OPTION);
        if (input == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "Thank you for playing! \n\nBye Bye!","Game Over", JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
            }
        else if (input == JOptionPane.YES_OPTION){
            isFirst = false;
            init();
            gameLogic();
            }
    }
}    


    
