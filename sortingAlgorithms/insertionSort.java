import java.util.*;
/**
 * Hopefully performs an insertion sort
 *
 * @author Jose Prieto
 * @version 02072023
 */
public class insertionSort
{
    public void insertionSort(){
        int[] arr;
        arr = new int[10000];
        for (int i = 0; i < arr.length; i++){
            int randomNum = (int)(Math.random() * 2147483646);
            arr[i] = randomNum;
            // System.out.println("1st: Index " + 0 + " is " + numbers[0]);
        }
    }

    public static void main()
    {   
        insertionSort arrayOfNumbers = new insertionSort();
        arrayOfNumbers.arraySort(arr);
    }

    void arraySort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int selected = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > selected) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = selected;
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

}
