import java.lang.Math;
/**
 * Practicing arrays
 *
 * @author Jose Prieto
 * @version 01092023
 */
public class arrayPractice
{
    /** Generate an array with 6 randomly generated integers/
     * (Have the numbers created in a constructor)
     */
    int[] arr;

    public void arrayPractice(){
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
    }
    
    /**
     * Removes the ith number form the list, and replaces last index with 0
     * 
     * For example the array: 2 7 3 1 4 10
     * with the call removeIndex(2) becomes: 2 7 1 4 10 0
     */
    public void removeIndex(int index){
        int[] arr2;
        arr2 = new int[6];
        
        //Not done, finish tomorrow (01/09)
    }
    
    //Part B
    /**
     * Adds num to the array at specified index. To accomodate the change,
     * the last number in the array will be lost.
     * 
     * For example: 2 7 3 1 4 10
     * with the call AddNum(9, 1) becomes: 2 9 7 3 1 4
     */
    
    public void addNum(){
        
    }
}
