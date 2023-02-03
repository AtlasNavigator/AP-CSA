import java.util.*;
/**
 * A Java Implementation of the Bubble Sort algorithm.
 * Made by a crazy person who is not sure they know what they're doing.
 *
 * @author Jose Prieto
 * @version 02022023
 */
public class bubbleSort
{
    public static int[] bubblesort() {
        int[] numbers;
        numbers = new int[1000000];
        for (int i = 0; i < numbers.length - 1; i++){
            int randomNum = (int)(Math.random() * 32000);
            numbers[i] = randomNum;
        }
        
        boolean swap = true;
        System.out.println("Beginning bubbleSort");
        for(int i = numbers.length - 1; i > 0 && swap; i--) {
            swap = false;
            for (int j = 0; j < i; j++) {
                if (numbers[j] > numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                    swap = true;
                    System.out.println("Swap at index " + j);
                }
            }
        }
        return numbers;
    }
}
