import java.util.Scanner;
/**
 * Nested for loops practice
 *
 * @author Jose Prieto
 * @version 08312022
 */
public class nestedForLoops
{
   Scanner scanner = new Scanner(System.in); 
   
   public static void practice1(){
       for (int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
