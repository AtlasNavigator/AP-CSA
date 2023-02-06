import java.util.*;
/**
 * A Java Implementation of the Bubble Sort algorithm.
 * Made by a crazy person who is not (fully) sure they know what they're doing.
 *
 * @author Jose Prieto
 * @version 02022023
 */
public class bubbleSort
{
    public static int[] bubblesort() {
        int[] numbers;
        numbers = new int[1000000];
        for (int i = 0; i < numbers.length; i++){
            int randomNum = (int)(Math.random() * 2147483646);
            numbers[i] = randomNum;
            // System.out.println("1st: Index " + 0 + " is " + numbers[0]);
        }

        boolean swap = true;
        System.out.println("Beginning bubbleSort");
        // System.out.println("2nd: Index " + 0 + " is " + numbers[0]);
        for(int i = numbers.length - 1; i > 0 && swap; i--) {
            swap = false;
            for (int j = 0; j < i; j++) {
                if (numbers[j] > numbers[j+1]) {
                    int temp = numbers[j]; //Temp variable storing swap value
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                    swap = true;
                    // System.out.println("Swap at index " + j);
                }
            }
            // if (i == 1){System.out.println("3th: Index " + 0 + " is " + numbers[0]);}
            System.out.println("Current progress: Index " + i + " to Index 0");
        }
        // System.out.println("3rd: Index " + 0 + " is " + numbers[0]);
        System.out.println(" ");
        System.out.println("It actually finished :)");
        return numbers;
    }
}
