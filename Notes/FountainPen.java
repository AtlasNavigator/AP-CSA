import java.util.Scanner;
/**
 * Something something class constructor
 *
 * @author Jose Prieto
 * @version 09092022
 */
public class FountainPen
{
    private double nibSize;
    private String inkColor; //Color of ink
    private String material;
    private String nibType;
    private String inkStorage;
    private double inkCapacity;
    private double inkLevel;

    /**
     * Constructor for fountainPen
     */
    public FountainPen(String material, String nibType, String inkStorage, String inkColor,
    double nibSize, double inkCapacity, double inkLevel){
        this.material = material;
        this.nibType = nibType;
        this.inkStorage = inkStorage;
        this.inkColor = inkColor;
        this.nibSize = nibSize;
        this.inkCapacity = inkCapacity;
        this.inkLevel = inkLevel;
    }

    public FountainPen (){
        this("Plastic", "Steel", "Eyedropper", "Black", 0.5, 1.0, 0.9); 
        //Predetermined constructor 
        //it's my Zebra fountain pen and is slightly used
    }

    //Accessor Method
    public double getInkLevel(){
        return inkLevel;
    }

    public double getInkCapacity(){
        return inkCapacity;
    }

    public double getNibSize(){
        return nibSize;
    }

    public String getInkColor(){
        return inkColor;
    }

    public String getInkStorage(){
        return inkStorage;
    }

    public String getNibType(){
        return nibType;
    }

    public String getMaterial(){
        return material;
    }

    //Mutator Methods
    
    public void setInkLevel(double newLevel){
        inkLevel = newLevel;
    }

    public void setInkCapacity(double newCapacity){
        inkCapacity = newCapacity;
    }

    public void setNibSize(double newNib){
        nibSize = newNib;
    }

    public void setInkColor(String newInkColor){
        inkColor = newInkColor;
    }

    public void setInkStorage(String newInkStorage){
        inkStorage = newInkStorage;
    }

    public void setNibType(String newNibType){
        nibType = newNibType;
    }

    public void setMaterial(String newMaterial){
        material = newMaterial;
    }

    //Personal Methods for my Pen!

    public void penUpgrade(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the nib shop, what nib would you like?");
        nibType = scanner.next();
        System.out.println();
        System.out.println("Would you like to change our your ink reservoir?");
        String answer = scanner.next();
        if (answer.toLowerCase().equals("yes") ){ //Checks if it is equal
            System.out.println("What would you like?");
            inkStorage = scanner.next();
        } else {
            System.out.println("Thank you for stopping by, have a good day!");
        }
    }

    public void write(){
        if (inkLevel <= 0){
            System.out.println("You're out of ink, please refill the pen.");
        } else {
            inkLevel -= 0.1;
            System.out.println("Write amazing things!");           
        }
    }
    
    public void inkRefill(){
        Scanner scanner = new Scanner(System.in);
        inkLevel = 0;
        System.out.println("You need to refill your pen. Would you like to do that?");
        String answer = scanner.next();
        if (answer.toLowerCase().equals("yes")){
            setInkLevel(1);
            System.out.println("Alright, your ink level is now at " + inkLevel + ".");
        } else {
            System.out.println("Just be aware your boss won't be too happy.");
        }        
    }
}

