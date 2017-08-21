/**
nAfi
date:22/12/15
*/




import java.util.*;
public class exetimefact
{
	
	public static void main(String args[])
	{
	long time1=System.nanoTime();
	//System.out.println("enter any number");
	//Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	System.out.println(fact(n));
	long time2=System.nanoTime();
	double seconds=((time2-time1)/(Math.pow(10,9)));
	System.out.println(seconds);
	
	
	}
static int fact(int n)
	{
	int v;
	if(n==1)
		return 1;
		
	else
		return n*fact(n-1);
	}			
}	
	
