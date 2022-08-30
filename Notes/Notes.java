
/**
 * Some basic java notes. It'll basically have all the basic notes I will need.
 *
 * @author Jose Prieto Lechuga
 * @version 08/22/2022
 */
public class Notes
{
    public static void main(){
        System.out.print("Hello");
        System.out.print("World");
        System.out.println("!"); //Carriage return happens AFTER this line
        System.out.print("Hello"); //Hello appears on the 2nd line
    }
    
    public static void method1(){
        System.out.print("a");
        System.out.println("b");
        System.out.print("c");
        System.out.println("d");
        System.out.print("e");
        System.out.println();
        System.out.println();
        System.out.println("Hello");
    }
    
    public static void method2(){
        System.out.println("This is a period - .");
        System.out.println("This is a forward slash - /");
        System.out.println("This is a backslash - \\");
        System.out.println("This is a quotation mark - \"");
        //The backslash is used for escape characters
        
        System.out.println("This is on the first line. \nThis is on the second.");
        System.out.println("\tHere's a tab.");
               
    }
    /*
    * -Printing
    * -Escape Characters
    * -Formatting
    * -Commenting
    * -Documentation
    */
   public static void method3(){
       Practice2.testMethod2();
    }
   
    public static void method4(){
        Practice2.testMethod2();
        System.out.println();
        Practice2.testMethod2();
    }
    
    public static void method5(String name){
        System.out.println("Hello" + name + ".");
        //When you take strings and combine them, it is called...
        //Concatenation
    }
    
    public static void variables(){
        String name; //This is a variable delcaration
        //YOU MUST DECLARE ALL VARIABLES PRIOR TO USE!!!
        
        name  = "Hisenberg"; //This is the instantiation of the variable
        //This is where you actually set the variable.
        
        String goodPerson = "Jesse";
        
        //Data Types
        //Things can be a primative data type or an Object.
        
        //Numbers
        int a = 2147483647 ; //Integer - This is most common
        //int max is 2^31-1 (about 2.1 billion)
        long b = 0; //Max is 2^63-1
        short c = 32767; //Max is 2^15-1
        byte d = 127; //Max is 2^7-1
        
        System.out.println("This is 127+1");
        System.out.println((byte)(d+1));
        
        //Decimals
        double e = 0.0; //THis is the most common for decimals
        float f = 0.0f; //Yes, these exist.
        
        boolean g = false; 
        
        char h = 'h'; //Only a single character. We don't use it.
        
        Integer i = 10;
        Boolean j = true;
        Double k = 0.0;
               
    }
    public static void method6(){
        int a = 9;
        int b = 2;
        
        System.out.println("This is 9 + 2");
        System.out.println(9 + 2);
        System.out.println();
        System.out.println("This is 9 - 2");
        System.out.println(9 - 2);
        System.out.println();
        System.out.println("This is 9 * 2");
        System.out.println(9 * 2);
        System.out.println();
        
        //9 is an int, and 2 is an int, so the result is an int.
        System.out.println("This is 9 / 2");
        System.out.println(9 / 2); //Decimals do not get used.
        System.out.println();        
        
        System.out.println("This is 9 / 2");
        System.out.println((double)9 / 2); 
        System.out.println();        
        
        System.out.println("This is 9 / 2");
        System.out.println((double)(9 / 2));
        System.out.println();        
        
                
    }
    public static void method7(){
        //This number can never change
        final double PI = 3.14; // Notice it is in all caps
        //PI += 1; Cannot do this because PI is final
    }
    public static void weirdMath(){
        // Notice that I used two words for the name of this method
        // We capitalize every first letter (it's called CamelCase)
        System.out.println(14/5);
        System.out.println();
        System.out.println();
        
        System.out.println("What does this do?");
        System.out.println(13 % 12);
        System.out.println(5 % 2);
        System.out.println(150 % 3 == 0); //Is 150 divisible by 3?
        
        //Powers
        System.out.println("This is 2 to the 20th power.");
        System.out.println();        
    }
}
    
