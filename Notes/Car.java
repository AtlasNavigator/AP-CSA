
/**
 * Write a description of class Car here.
 *
 * @author Jose Prieto
 * @version 02142023
 */
public class Car extends Vehicle
{
    int numberOfWheels;
    String brand;
    public Car(String name, int wheels, String brand){
        // initialize instance variables
        super(name);
        this.brand = brand;
        numberOfWheels = wheels;
        System.out.println("The brand name and wheels were assigned.");
    }
    public void start(){
        System.out.println("You turn the key and " + name + "starts.");
    }
    @Override //A fancy way of saying that it overrides the abstract method
    //(Or another method that is already defined)
    public void park(){
        System.out.println("You lock the car on your way out");
    }
}
