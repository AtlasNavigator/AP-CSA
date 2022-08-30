import java.util.Scanner;
/**
 * It's about control statements.
 *
 * @author Jose Prieto
 *
 * @version 08302022
 */
public class control
{
    public static String grade (int percentage){
        /*
         *  if (criteria){
         *      what it does when true
         *  } 
         */

        if (percentage >= 90){
            return "A";
            // && means AND
            // || means OR
        } else if (percentage >= 80 && percentage < 90){
            return "B";
        } else if (percentage >= 70 && percentage < 80){
            return "C";
        } else if (percentage >= 60 && percentage < 70){
            return "D";
        }
        return "F";
    }

    public static void gradeThis(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What score did you get?");
        int perct = scanner.nextInt();
        String grade = grade(perct);
        System.out.println("You have a " + grade(perct));
    }

    public static void main(String[] args){
        // FOR LOOP BABY!!!
        // In this case, the code runs for 5 times.
        
        for (int i = 0; i < 5; i++){
            gradeThis();
            // i++ //You don't need to put the iterator inside, not recommended.
        }
    }
}
