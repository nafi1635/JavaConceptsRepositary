
/**
 * Write a description of class Dicerandom here.
 * 
 * @nafi 
 * @6/11/15
 */
import java.util.Scanner;
public class Dicerandom
{
   public static void main(String args[])
   {
       System.out.println("Enter any number");
       Scanner obj=new Scanner(System.in);
       int n=obj.nextInt();
       if(n<10&&n>0)
       {
           for(int i=0;i<n;i++)
           {
               
               int r=(int) (Math.random()*6+1);
               System.out.println(r);
                
            }
            
            
        }
        
        else
        {
            System.out.println("enter in between in range yar..");
        }
    }
}
       