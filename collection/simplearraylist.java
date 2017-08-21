/**
nAfi
7-02-16
*/
import java.util.*;  
public class simplearraylist
{  
 public static void main(String args[])
 {  
        ArrayList al=new ArrayList();   //inbuilted array listed
        al.add("Billgates");  
        al.add("Warren buffet");  
        al.add("larry page");  
         al.add("markzucker burg");  
        Iterator itr=al.iterator();   //iterator has to include
        while(itr.hasNext())
        {  
         System.out.println(itr.next());  
        }  
    }  
}  
