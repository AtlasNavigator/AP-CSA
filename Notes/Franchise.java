
/**
 * McDonal
 *
 * @author Jose Prieto
 * @version 01192023
 */
public class Franchise
{
    private int cost;
    private int numberOfCustomers;
    private double revenue;
    private boolean isProfitable;
    
    public Franchise(){
        numberOfCustomers = 0;
        revenue = 0;
        isProfitable = false;
        cost = 100000; //100,000
    }
    
    public int getCost(){return cost;}
    public int numberOfCustomers(){return numberOfCustomers;}
    public double getRevenue(){return revenue;}
    public boolean isProfitable(){return isProfitable;}
    
    
}
