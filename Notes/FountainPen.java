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
    
    //Mutator Method
    
}

