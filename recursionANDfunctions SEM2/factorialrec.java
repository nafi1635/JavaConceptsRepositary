/**
nAfi
date:17/12/15
*/

/**import java.util.Scanner;
public class factorialrec
{
	
	public static void main(String args[])
	{
	System.out.println("enter any number");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int fact=1;
	for(int i=1;i<=n;i++)
	{
		 fact=fact*i;
		
	}
	System.out.println(fact);
   }
 } 
 */
 //BY using recusion
 import java.util.Scanner;
public class factorialrec
{
	
	public static void main(String args[])
	{
	System.out.println("enter any number");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	System.out.println(fact(n));
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
	
 

		
		
		
	
	
		
