import java.util.ArrayList;
import java.util.Scanner;
/**
 * It just shows whether if arrayLists can have arrays in them
 *
 * @author Jose Prieto
 * @version 01192023
 */
public class ArrayListTest
{
    //ArrayList OF int arrays
    ArrayList<int[]> test;
    
    //Array containing ArrayLists (made up of integers)
    ArrayList<Integer>[] test1;
    
    //ArrayList containing Boolean ArrayLists
    ArrayList<ArrayList<Boolean>> test2;
    
    //2D array containing ArrayLists of ArrayLists with scanners
    ArrayList<ArrayList<Scanner>>[][] test3;
    
    public static void thing(){
        String[] a = new String[5];
        ArrayList<Float> b = new ArrayList<Float>();
        ArrayList<String[]> c = new ArrayList<String[]>();
        
        //Get the fist item from b
        Float f = b.get(0);
        
        //Get the first item of a
        String thing = a[0];
        
        //Get the first item from c (What data type is it?)
        String[] arr = c.get(0);
        
    }
}
