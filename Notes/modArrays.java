import java.lang.Math;
/**
 * Practicing arrays
 *
 * @author Jose Prieto
 * @version 01092023
 */
public class modArrays
{
    /** Generate an array with 6 randomly generated integers/
     * (Have the numbers created in a constructor)
     */
    int[] arr;

    public modArrays(){
        arr = new int[6]; //Create array with 6 slots
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*10 + 1); //Fill the array with random nums
        }
    }

    /**
     * Prints current contents of array in a single line with a space
     * between each number
     */
    public void print(){
        for (int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    /**
     * Removes the ith number form the list, and replaces last index with 0
     * 
     * For example the array: 2 7 3 1 4 10
     * with the call removeIndex(2) becomes: 2 7 1 4 10 0
     */
    public void removeIndex(int index){
        for (int i = index; i < arr.length - 1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length - 1] = 0;
    }

    //Part B
    /**
     * Adds num to the array at specified index. To accomodate the change,
     * the last number in the array will be lost.
     * 
     * For example: 2 7 3 1 4 10
     * with the call AddNum(9, 1) becomes: 2 9 7 3 1 4
     */

    public void addNum(int num, int index){
        int[] arr2 = new int[arr.length];
        
         for(int i=0, k=0; i < arr.length; i++){
            if(i < index){
                arr2[i] = arr[i];
            } else if (i == index){
                arr2[i] = num;
            } else {
                arr2[i] = arr[i-1];
            }
        }
        arr = arr2;
    }
    
    //Part C:
    /**
     * Finds and removes all entries with the specified num
     */
    public void removeAll(int num){
        int[] testArr = {1, 1, 2, 2, 1, 1, 1, 1, 1, 2, 3};
    }
}
