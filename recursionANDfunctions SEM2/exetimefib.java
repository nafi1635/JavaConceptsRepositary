/**
nAfi
date:22/12/15
*/



import java.util.*;
public class exetimefib
{
	public static void main(String args[])
	{
	long time1=System.nanoTime();
	//System.out.println("enter any number");
	//Scanner s=new Scanner(System.in);
	//int n=s.nextInt();
	
	System.out.println(fib(5));
	long time2=System.nanoTime();
	double seconds=((time2-time1)/Math.pow(10,9));
	System.out.println(seconds);
	
	
	
	}
	static int fib(int n)
	{
	if(n==0||n==1)
		return 1;
	else
	       return fib(n-1)+fib(n-2);
	   }
	}       	
	
	
	
	
