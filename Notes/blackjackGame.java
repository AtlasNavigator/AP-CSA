import java.util.Scanner;
/**
 * This is the blackjack game.
 *
 * @author Jose Prieto
 * @version 09152022
 */
public class blackjackGame
{   
    Scanner scanner = new Scanner(System.in);

    private boolean winCheck(int total){
        if (total == 21){
            System.out.println("Congratulations, you won! You got 21.");
            return true;
        } else {
            return false;
        }
    }
    
    public static void game(){ //This is the game's method
        /**
         * Helps differentiate between the player and dealer's hands.
         */
        hand player = new hand();  //Player's hand
        hand dealer  = new hand(); //Dealer's hand
        
        System.out.println("#################  WELCOME TO BLACKJACK!  #################");
        //Game welcome message
        
        /**
         * Player initial hand
         */
        
        System.out.println("");
        System.out.println("-------- PLAYER --------"); //Player hand
        System.out.println("Card 1: " + player.card1Value()); //Print card 1 for player
        System.out.println("Card 2: " + player.card2Value()); //Print card 2 for player
        System.out.println("Total: " + player.getTotal()); //Print player total
        
        /**
         * Dealer's hand from POV of player
         */
        
        System.out.println("");
        System.out.println("-------- DEALER --------"); //Dealer's initial card
        System.out.println("Card 1: " + dealer.card1Value()); //Print dealer's 1st card
        System.out.println("Card 2: Undefined"); //Do not reveal card 2
        
        //Begin the actual game
        
    }
}
