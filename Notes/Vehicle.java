
/**
 * Write a description of class Vechicle here.
 *
 * @author Jose Prieto
 * @version 02142023
 */
//Car is a subclass of Vehicle
//Vehicle is a superclass of Car

public abstract class Vehicle //extends Object
{
    String name;
    public Vehicle(String name){
        //Implicit call
        //super(); //This is automatically called unless a different constructor is called.
        this.name = name;  
        System.out.println("The name was assigned.");
    }
    //This abstract method must be defined in every 
    //subclass (because it isn't here)
    public abstract void park();
    public void move(){
        System.out.print(name + "moves");
    }
}
