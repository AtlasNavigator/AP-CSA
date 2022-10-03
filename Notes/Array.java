
/**
 * Write a description of class Arrays here.
 *
 * @author Jose Prieto
 * @version 10/03/2022
 */
public class Array
{
    /*
     * Public says access level
     * Static says that it is not an instance of a class
     * void states that there is no return type
     * main tells the vm to start
     */
    private String[] myFirstArray;
    private String[] shoppingList;

    public static void main(String[] args){
        System.out.println("Hello world");
    }

    public Array(){  
        myFirstArray = new String[2]; //There are 2 slots.
        myFirstArray[0] = "This"; //Sets the item at index 0 to "This"
        myFirstArray[1] = "That";

        shoppingList = new String[10];
        shoppingList[0] = "Toothpaste";
        shoppingList[1] = "Marshmallows";
        shoppingList[2] = "Mushrooms";
        shoppingList[3] = "Chicken";
        shoppingList[4] = "Noodles";
        shoppingList[5] = "Protein Powder";
        shoppingList[6] = "Drain Cleaner";
    }

    public void printShoppingList(){
        for (int i = 0; i < shoppingList.length; i++){
            System.out.println(shoppingList[i]); //Accesses index i
        }
    }

    public void advancedPrintList(){
        //ENCHANCED for Loop
        //ONLY USE IT WHEN YOU DON'T NEED AN INDEX TO MODIFY THE ARRAY
        for(String item:shoppingList){
            System.out.println(item);  
        }
    }

    public static void ArrayTest(int num){ //You can make an array of anything
        int[] nums;
        Integer[] numsTwo;
        nums = new int[num];

        //Careful here:
        //Can only use if you instantiate and declare in the same line using {}
        int[] test = {1,2,3,4,5,6,7,8}; //This has to be in the same line

        int[] hundred = new int[num];
        for (int i = 0; i < hundred.length; i++){
            hundred[i] = i + 1;
        }
        
        for(int number : hundred){
            System.out.println(number);
        }
        
        //Modifying an array
        test[7] = 1000;
        
        //Accessing an array
        System.out.println(test[0]);
    }
}