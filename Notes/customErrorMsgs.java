
/**
 * We learn how to make custom error messages for diagnostic purposes.
 *
 * @author Jose Prieto
 * @author Kyle Wiebe
 * @version 10/05/2022
 */
public class customErrorMsgs
{
    public static void test(){
        int a = 5;
        int b = 0;
        try{
            System.out.println(a/b); //This is an illegal operation
        } catch (ArithmeticException e){
            System.out.println("Divide by zero error: Undefined");
            System.out.println("Error 0x01");
        }
    }

    public static void test2(int a) throws Exception{
        if(a > 10){
            System.out.println("Try a smaller number.");
        } else if (a < 0) {
            throw new Exception("The number in negative.");
        } else {
            throw new Exception ("What the fuck, you did you get here?");
            //This error will spit out if you type in the "correct" int
        }
    }
    
    public static void test3(){
        try{
            test2(9);
        } catch (wiebeException e){
            System.out.println("Mr. Wiebe just spat out an exception. It says: " + e);
        } catch (Exception e){
            System.out.println("You got a generic error.");
        } 
    }
}
