//smart nafi




import java.util.Scanner;
public class Sqrt
{
public static void main(String args[])
	{
		System.out.println("Enter a number: ");
		Scanner s=new Scanner(System.in);
		double a=s.nextDouble();
		double x=calculateSqrt(a);
		System.out.println(x);
	}
	public static double calculateSqrt(double n)
	{
		double rootvalue=1.0;
		for(int i=0;i<n;i++)
		{
			rootvalue=0.5*(rootvalue+(n/rootvalue));

		}
		System.out.println("Root of the given no is : "+rootvalue);
		return rootvalue;
	}
