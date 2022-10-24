
/**
 * Write a description of class ArraysOfTheSecondDimension here.
 *
 * @author Jose Prieto
 * @version 10/24/2022
 */
public class ArraysOfTheSecondDimension
{
    int[] arr; //Normal array
    int[][] arr2; //What is arr2? (Is it a 2D array, array of arrays?)
    //It is an array of 1D arrays
    int[][] arr3;
    int[] pixel;
    int[][][] picture;
    int[][][][][][][][][][] tenDArray;
    public ArraysOfTheSecondDimension(){
        arr = new int[10];
        arr2 = new int[10][10];
        arr3 = new int[3][5]; //3 arrays, 5 items within the 3 arrays (3x5 array)
        pixel = new int[3];
        tenDArray = new int[5][5][5][5][5][5][5][5][5][5]; //Normally, 3 at most
    }

    /**
     * Fills the array arr with numbers starting at 1.
     */

    public void fillArr(){
        int count  = 1;

        for (int i = 0; i < arr.length; i++){
            arr[i] = count;
            count++;
        }
    }

    /**
     * Fills the array arr2 with numbers starting at 1.
     */

    public void fillArr2(){
        int count = 1;

        //Row-Major Format
        //Outer for loop iterates all rows
        //Inner for loop iterates all columns
        for (int i = 0; i < arr2.length; i++){
            for (int j = 0; j < arr2.length; j++){
                arr2[i][j] = count;
                count++;
            }            
        } 
    }

    public void fillArr3(){
        int count = 1;

        //Row-Major Format
        //arr3.length is the number of rows
        //arr3[0].length is the number of columns (or the length of one row) 

        for (int i = 0; i < arr3.length; i++){
            for (int j = 0; j < arr3[0].length; j++){
                arr3[i][j] = count;
                count++; 
            }            
        } 
    }

    public void print2DArray(){
        for (int i = 0; i < arr2.length; i++){
            for (int j = 0; j < arr2[0].length; j++){
                System.out.print(arr2[i][j] + " "); //Print 2D array
            }
            System.out.println();
        }
    }

    //Enchanced for loop for printing multidimensional arrays
    public void betterPrint(){
        for(int[] row : arr2){
            for(int num: row){
                System.out.println(num + " ");
            }
            System.out.println();
        }
    }
}
