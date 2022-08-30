import java.util.Scanner; //Import the scanner util class
/**
 * Have the computer say hello (name)
 * Ask for their favorite game
 * Have the computer tell them their favorite game sucks
 * and insult the user
 * @author Jose Prieto
 * @version 8/25/2022
 */
public class TakingInput
{
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in your name");
        String name = scanner.next();
        System.out.println("Hello, " + name + ".");
        System.out.println();
        System.out.println("Type in your favorite video game");
        String game = scanner.next();
        System.out.println("Dude, " + game + " fucking sucks.");
        System.out.println(name + ", go outside and touch some fucking grass.");
    }
    
    private static void aMethod(){
        System.out.println("Try to run this.");
    }
    
    public static void runThis(){
        aMethod();
    }
    
    public static int methodB(){
        int a = 5;
        a++; //It is the same as a +=1, or a = a + 1;
        System.out.println(a);
        a--;
        System.out.println(a); //decrements a
        
        //Other things
        a *=5;
        a /=10;
        a %= 2;
        
        return a;
    }
    
    /**
     * Asks for a user's name
     * 
     * @return the User's name
     */
    public static String getName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.next();
        return name;
    }
    
    public static int getAge(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = scanner.nextInt();
        return age;
    }
    
    public static void addStuff(){
        //System.out.println(age + 1); //Age is defined in a different method
        
    }
}




