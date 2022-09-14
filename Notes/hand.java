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

    public hand(){
        card1 = cardGen();
        card2 = cardGen();
    }

    public int cardGen(){
        int card = (int)(Math.random() * 9 + 2); //Generate an int [1, 11]
        total += card;
        return card;
    }

    public void hit(){
        cardGen();
    }

    public boolean bustCheck(){ //Checks if total is bust
        if (total > 21){
            System.out.println("You have bust. Game over, you got " + getTotal() + ".");
            return true;
        // } else if (total == 21){
            // System.out.println("Congratulations, you won! You got 21.");
            // return true;
        // } else 

            // return false;
    }
}
