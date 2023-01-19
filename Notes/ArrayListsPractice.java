import java.util.ArrayList;
/**
 * Learning array lists.
 *
 * @author Jose Prieto
 * @version 01182023
 */
public class ArrayListsPractice
{
    ArrayList list;
    public ArrayListsPractice(){
        list = new ArrayList();
    }
    
    public void test1(){
        list.add(new Integer(1)); //Bad idea, don't do this.
        list.add(new Object());
        list.add(true);
    }
    
    public void forLoop(){
        for (int i = 0; i < list.size(); i++){
            System.out.println("Here is something");
        }
        for (Object o : list){
            System.out.println("Here is something");
        }
    }
    
    public Object remove (int index){
        return list.remove(index);
    }
}
