import java.lang.Math;
import java.util.Scanner;
/**
 * It is a number guessing game, something simple and basic.
 *
 * @author Jose Prieto
 * @version 09062022
 */
public class guessGame
{
    static Scanner scanner = new Scanner(System.in);
    //Should allow it to work everywhere in this class

    public static void inputs(){
        /**
         * This is where inputs are asked for and checked.
         */

        int number = generator();

        for (int i = 0; i <= 5; i++){
            int guess = scanner.nextInt();
            int count = i;
            
            System.out.println("Guess a number " + count + "/5");
            if (guess != number){
                System.out.println("Incorrect, try again.");
            } else {
                System.out.println("Congratulations, " + guess + "was the correct number!");
                break;
            }
        }

    }

    public static int generator(){
        int number = (int)(Math.random() * 10 + 1);  
        return number;
        //Generates a random number from 1-100;
    }
}
