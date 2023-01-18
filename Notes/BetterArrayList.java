import java.util.List; //Technically out-of-scope
import java.util.ArrayList;
/**
 * Write a description of class betterArrayList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BetterArrayList
{
    /**
     * <> makes the arrayList only accept a specific data type
     * <String> only allows strings to be added to the arrayList
     */
    List<String> shoppingList; //Think 'arrayList'
    public BetterArrayList(){
        shoppingList = new ArrayList<String>();
    }
    
    public void addStuff(){
        shoppingList.add("eggs");
        shoppingList.add("oranges");
    } 
    
    public void printFirstLetter(){
        for (String s : shoppingList){
            System.out.println(s.substring(0,1));
        } //Prints first letter of items
    }
    
    public void addItem(String name){
        shoppingList.add(name); //Add item typed out
    }
    
    public String changeFirstItem(){
        // String itemChanged = shoppingList.set(0, "EGGS");
        // return itemChanged;
        
        return shoppingList.set(0, "EGGS"); //Better way to do it
    }
}
