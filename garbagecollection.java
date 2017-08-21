
/**
 * Write a description of class garbagecollection here.
 * 
 * @smart nafi
 * @9/10/15
 */
import java.util.*;
public class garbagecollection
{
    


   public static void main(String s[]) throws Exception
   {
      Runtime rs =  Runtime.getRuntime();
      System.out.println("Free memory in JVM before Garbage Collection = "+rs.freeMemory());
      rs.gc();
      System.out.println("Free memory in JVM after Garbage Collection = "+rs.freeMemory());
   }
}


