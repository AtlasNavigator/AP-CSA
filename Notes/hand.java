import java.lang.Math;
import java.util.Scanner;

/**
 * A basic game of Blackjack, this is dealing with the cards.
 *
 * @author Jose Prieto
 * @version 09122022
 */
public class hand
{
    private int card1;
    private int card2;
    private int total;

    public int getTotal(){
        return total;
    }
    
    public int card1Value(){
        return card1; //Reveals card1 value
    }
    
    public int card2Value(){
        return card2; //Accessor for card2
    }
    
    public hand(){
        card1 = hit();
        card2 = hit();
    }

    public int hit(){ //Hit me
        int card = (int)(Math.random() * 9 + 2); //Generate an int [1, 11]
        total += card;
        return card;
    }

    public boolean bustCheck(){ //Checks if total is bust
        if (total > 21){
            System.out.println("Game over, bust at " + getTotal() + ".");
            return true;
        } else {
            return false;
        }
    }
}
