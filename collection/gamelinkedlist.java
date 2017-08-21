/**
nAfi
7-02-16
*/
import java.util.*;  
class gamelinkedlist
{  
public static void main(String args[])
{  
  
        ArrayList al=new ArrayList();  
        al.add("bz flag");  
        al.add("0ad");  
        al.add("armagatron");  
        al.add("2048");  
          
        System.out.println("element at 2nd position: "+al.get(2));  
          
        ListIterator itr=al.listIterator();  //it used to traversing elements forward and backword
          
        System.out.println("traversing elements in forward direction...");  
        while(itr.hasNext())
        {  
                 System.out.println(itr.next());  
         }  
          
          
                System.out.println("traversing elements in backward direction...");  
                        while(itr.hasPrevious())
                        {  
                                System.out.println(itr.previous());  
                        } 
       }
}                        
