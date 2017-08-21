import java.util.*;  
class hashset
{  
 public static void main(String args[])
 {  
    HashSet al=new HashSet();  
    al.add("cricket");  
    al.add("football");  
    al.add("basketball");  
    al.add("cricket");  
  Iterator itr=al.iterator();  
  while(itr.hasNext())
         {  
                  System.out.println(itr.next());  
           }  
    }  
}  
