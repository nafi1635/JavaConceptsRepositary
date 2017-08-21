/**
nAfi
date:17/12/15
disciption:example:gcd(120,45)=15
				gcd(45,30)=15
				gcd(30,15)=15
				gcd(15,0)=15
				
*/



import java.util.Scanner;
public class gcdcalc
{
	public static void main(String args[])
	{
	System.out.println("enter numbers");
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	int v=gcd(a,b);
	System.out.println("GCD is"+" "+v);
	}
	static int gcd(int x,int y)
	{
		if(y==0)
			return x;
		else
			return gcd(y,x%y);      //see bottom
	}
}				
	
		
