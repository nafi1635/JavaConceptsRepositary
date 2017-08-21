import java.util.*;  
class treeset
{  
 public static void main(String args[])
 {  
   
         TreeSet al=new TreeSet();  
         al.add("Ravi");  
         al.add("Vijay");  
         al.add("Ravi");  
         al.add("Ajay");  
         
         Iterator itr=al.iterator();  
         while(itr.hasNext())
         {  
          System.out.println(itr.next());  
        }  
 }  
}  
