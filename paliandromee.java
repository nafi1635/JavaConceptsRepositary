
/**
 * Write a description of class palindrome here.
 * 
 * @author (your name) 
 * @8/11/15
 */

    import java.util.Scanner;
public class paliandromee
{


    public static void main(String args[])
    {
        int n,temp,remainder,sum=0;
        System.out.println("enter number");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        temp = n; 

        while(n>0)
        {
            remainder=n%10; 
            n= n/10;          
            sum=sum*10 + remainder;                                               
         }
   if (sum==temp)
     System.out.println("The Number Is A Palindrome ");
   else
     System.out.println("The Number Is Not A Palindrome ");
    }
}