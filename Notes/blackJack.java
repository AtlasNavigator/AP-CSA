import java.lang.Math;
import java.util.Scanner;

/**
 * A basic game of Blackjack.
 *
 * @author Jose Prieto
 * @version 09122022
 */
public class blackJack
{
    public static int cardGen(){
    int card = (int)(Math.random() * 11 + 1); //Generate an int [1, 11]
    return card; //Generate a card value
    }
}
