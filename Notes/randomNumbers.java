import java.lang.Math;
/**
 * Today, we cover random numbers. Nothing else to see here...
 *
 * @author Jose Prieto
 * @version 09022022
 */
public class randomNumbers
{
    public static void random(){
        //Random number between [0, 1)
        double num = Math.random();
        System.out.println(num);
        
        //Random number between [0, 10)
        double num2 = Math.random() * 10;
        System.out.println(num2);
        
        //Random number between [0, 9]
        int num3 = (int)(Math.random() * 10); 
        //Recasting to remove end of decimal
        System.out.println(num3);
        
        //Random number between [44, 100]
        int num4 = (int)(Math.random() * 57 + 44); //57 different possibilities
        System.out.println(num4);
        
        //Random number between [156, 648]
        int num5 = (int)(Math.random() * 493 + 156);
        System.out.println(num5); // 493 possibilities
    }
}
