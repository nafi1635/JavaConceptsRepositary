
/**
 * Write a description of class reversenumber here.
 * 
 * @smart nafi 
 * @9/10/15
 */


import java.util.Scanner;
 
class reverseNumber
{
   public static void main(String args[])
   {
      int n, reverse = 0;
 
      System.out.println("Enter the number to reverse");
      Scanner in = new Scanner(System.in);
      n = in.nextInt();    //take input
 
      while( n != 0 )
      {
          reverse = reverse * 10;    
          reverse = reverse + n%10;
          n = n/10;
      }
 
      System.out.println("Yaa.. got it this is your reversed number "+reverse);
   }
}