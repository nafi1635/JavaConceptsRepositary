import java.util.*;  
class linkedlisthashset
{  
 public static void main(String args[])
 {  
   
         LinkedHashSet al=new LinkedHashSet();  
         al.add("boy");  
         al.add("girl");  
         al.add("girl");  
         al.add("boy");  
  
         Iterator itr=al.iterator();  
         while(itr.hasNext())
         {  
                    System.out.println(itr.next());  
        }  
        }  
}  
