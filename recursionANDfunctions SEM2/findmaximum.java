/**
nAfi
date:17/12/15
*/





/**public class findmaximum
{
	public static void main(String args[])
	{
	int a=2,b=3,c=4,d=5,x,y;
	int max;
	if(a>b)
		x=a;
	else
		x=b;
	if(c>d)
		y=c;
	else
		y=d;
	if(x>y)
		max=x;
	else
		max=y;
	System.out.println(max);
	}
}	*/
//By using functions
import java.util.Scanner;
public class findmaximum
{
	public static void main(String args[])
	{	
		System.out.println("enter elements");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int d=s.nextInt();
		
		
		//int a=2,b=3,c=4,d=5;
		int max=maxim(maxim(a,b),maxim(c,d));
		System.out.println("your maximum number is"+"  "+max);
	}
	static int maxim(int x,int y)
	{
	
	if(x>y)
		return x;
	else
		return y;	
	}
}		
//Conditional Operator
/**	public class findmaximum
{
	public static void main(String args[])
	{	
	int a=5,b=6;
	System.out.println((a>b)?a:b);
	}
}*/	
	
	
		
		

	
			
							
