/**
nAfi
date:17/12/15
*/

public class recursion1
{
	public static void main(String args[])
	{
		int a=10;
		int b=5;
		int c=mystery(a,b);
		System.out.println(c);
	}
	static int mystery(int a,int b)
	{
	if(b==1)
		return a;
	else
		return a+mystery(a,b-1);     //this is a recursion ...a function called itself
	}
}			 
		
	
