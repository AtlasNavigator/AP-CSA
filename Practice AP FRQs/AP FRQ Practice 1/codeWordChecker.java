import java.util.Scanner;
/**
 * Prompt: 
 * Write to complete CodeWordChecker class. Your implementation
 * must meet all specifications and conform to all examples.
 *
 * From the 2018 AP CSA FRQ #3
 * @author Jose Prieto
 * @version 09/28/2022
 */
public class codeWordChecker
{
    private int min;
    private int max;
    private String str;
    
    public codeWordChecker(int min, int max, String str){
        this.min = min;
        this.max = max;
        this.str = str;
    }
    
    public codeWordChecker(String str){
        /**
         * The default parameters are a minimum of 6 character and a maximum of 20.
         * The user must define a string beforehand.
         */
        
        this.min = 6;
        this.max = 20;
        this.str = str;
    }
    
    public boolean isValid(String str){
        if (min > 6 && max < 20 && !str.equals("$")){
            return true;
        } else {
            return false;
        }
    }
}
