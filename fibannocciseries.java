

/**
 * Write a description of class fibannocciseries here.
 * 
 * @author nafi
 * @7/11/15
 */
import java.util.Scanner;
public class fibannocciseries
{
    public static void main(String args[])
    {
        System.out.println("enter any number");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=0;i<n;i++)
        
        System.out.println(fib(i));
        
    
}
    static int fib(int a)
    {
    if(a<=1)
    	return a;
    else
   	 return fib(a-1)+fib(a-2);
}
}
    
