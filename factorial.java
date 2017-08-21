
import java.util.Scanner;
 
class factorial
{
   public static void main(String args[])
   {
      int n, c, fact = 1;
      System.out.println("Enter an integer to calculate it's factorial");
      Scanner obj= new Scanner(System.in);
      n = obj.nextInt();
      if ( n < 0 )
         System.out.println("plz enter positive only");
      else
      {
         for (c = 1;c <= n;c++ )
            fact = fact*c; 
         System.out.println("Factorial of "+n+" is = "+fact);
      }
   }
}
