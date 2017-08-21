import java.util.Scanner;
public class fibanacci
{
	public static void main(String args[])
	{
	System.out.println("enter any number");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	
	System.out.println(fib(n));
	
	
	}
	static int fib(int n)
	{
	if(n==0||n==1)
		return 1;
	else
	       return fib(n-1)+fib(n-2);
	   }
	}       	
	
	
	
	
