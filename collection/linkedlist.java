/**
nAfi
7-02-16
*/
import java.util.*;  
class linkedlist
{  
 public static void main(String args[])
 {  
         LinkedList al=new LinkedList(); 
         al.add("Mega star"); 
          al.add("Tower star");  
          al.add("Power star");  
           al.add("Mega power star");  
       
  
  Iterator itr=al.iterator();  
  while(itr.hasNext())
  {  
   System.out.println(itr.next());  
  }  
 }  
}  
