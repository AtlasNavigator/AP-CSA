import java.awt.Color;
/**
 * Write a description of class crown here.
 *
 * @author Jose Prieto
 * @version 09082022
 */
public class Crown
{
    // instance variables - replace the example below with your own
    private String metal;
    private String shape;
    private int numberOfJewels;
    private double size;
    private Color color;
    private int durability = 100;

    // This is a horrible practice, but it is being done for education
    public String owner;

    /**
     * Contructor for object of class Crown
     */
    public Crown(String metalType, String crownShape, int numberOfJewels, 
    double size, Color color)
    {
        metal = metalType;
        shape = crownShape;
        this.numberOfJewels = numberOfJewels;
        this.size = size;
        this.color = color;
    }

    public Crown(){
        metal = "Silver";
        shape = "Round";
        numberOfJewels = 5;
        size = 4.4;
        color = new Color(192, 192, 192); //RGB code for silver
    }

    public Crown(Color color){
        this("Silver","Round", 5, 4.4, color);
    }

    // public void crownTest(){
    // kingdom.kingdomTester();
    // }

    //Accessor Methods
    public String getMetal(){
        return metal; //Returns metalType
    }

    public double getSize(){
        return size; //returns size
    }

    //Mutator Methods
    public void setSize(double newSize){
        size  = newSize;
    }

    //Other methods
    public void breakCrown(){
        durability = 0;
        System.out.println("It broke. Oh dear.");
    }

    public void wear(String owner){
        if (durability <= 0){
            System.out.println("Nothing lasts forever, your crown has broken.");
        } else {
            this.owner = owner;
            durability--;
            System.out.println(owner + " now wears the crown!");
        }
    }
}
