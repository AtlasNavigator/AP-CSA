
/**
 * Write a description of class KeylessCar here.
 *
 * @author Jose Prieto
 * @version 02142023
 */
public class KeylessCar extends Car
{
    //Please note that the order is different here.
    //Try to keep consistent, but this is to show that it can be different
    public KeylessCar(String name, String brand, int wheels){
        //Initialize instance variables
        super(name, wheels, brand);
    }
    
    public void start(){
        System.out.println("You push the button and the car starts");
    }
}
