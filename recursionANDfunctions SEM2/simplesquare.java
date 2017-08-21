/**
nAfi
Date:17/12/15
*/
/**public class simplesquare
{
	public static void main(String args[])
	{
		int a=5,b=4,c=2,d=3;
		int x=a*a+b*b;
		int y=c*c+d*d;
		int ans=x*x+y*y;
		System.out.println(ans);
	}
}	*/
//By using functions...

public class simplesquare
{
	public static void main(String args[])
	{
		int a=5,b=4,c=2,d=3;
		
		int p=squaresum(a,b);
		int q=squaresum(c,d);
		int ans=squaresum(p,q);
		System.out.println(ans);
	}	
	static int squaresum(int a,int b)
		{
		int x=a*a;
		int y=b*b;
		int z=x+y;
		return z;
		}	
}		
		
		
