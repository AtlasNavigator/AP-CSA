
/**
 * Write a description of class kingdom here.
 *
 * @author Jose Prieto
 * @version 09082022
 */
public class kingdom
{
    public static final double PI = 3.1416;
    
    public static void kingdomTester(){
        Crown crown  = new Crown("gold", "round", 44, 110.43, null);
        crown.owner = "The king";
        Crown crown2 = new Crown("Iron", "Square", 0, 1.1, null);
        crown2.owner = "You";
    }
}
