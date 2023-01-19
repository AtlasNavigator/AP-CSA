import java.util.ArrayList;
/**
 * Write a description of class McDonalds here.
 *
 * @author Jose Prieto
 * @version 01192023
 */
public class McDonalds
{
    ArrayList<Franchise> stores;
    public McDonalds(){
        /*
         * Implementation not shown
         */
    }

    public double getTotalRevenue(){
        double total = 0;

        for (Franchise f : stores){
            total += f.getRevenue();
        }
        return total;
    }
}
