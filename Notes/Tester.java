
/**
 * Write a description of class Tester here.
 *
 * @author Jose Prieto
 * @version 02142023
 */
public class Tester
{
    public static void main(){
        Car yourCar = new Car("Your Car", 3, "Trash");
        Car myCar = new KeylessCar("Mr. Wiebe's Awesome Car of Awesome", "Ferrari", 4 );
        yourCar.start();
        myCar.start();
    }
}
