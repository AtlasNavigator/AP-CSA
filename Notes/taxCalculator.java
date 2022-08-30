import java.util.Scanner; //Import scanner
/**
 * This is a tax calculator. We assume a flat tax rate of 20%.
 * There is a $10,000 standard deduction.
 * There is a $2,000 deduction per dependant.
 * Gross income should be entered to the nearest penny.
 * The total amount is printed in decimal form.
 * 
 * @author Jose Prieto
 * @version 1.0
 */
public class taxCalculator
{
   static Scanner scanner = new Scanner(System.in);
   
   public static float taxes(){
       System.out.println("Enter your gross income:");
       float grossIncome = scanner.nextFloat();
       
       System.out.println("Enter your amount of dependants:");
       float dependants = scanner.nextFloat();
       
       float taxableAmount = grossIncome - 10000 - 2000 * dependants;
       //Calculate taxable income
       
       float incomeTax = taxableAmount * 0.10f;
       return incomeTax;
    }
      
}
