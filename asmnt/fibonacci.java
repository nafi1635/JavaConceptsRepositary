package asmnt;

import java.util.Scanner;
public class fibonacci
{
	public static void main(String args[])
{	int n;
	System.out.println("Enter how many fibonacci no u want:");
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
	System.out.println("fibonacci series is ");
	for(int i=1;i<=n;i++)
	System.out.println(fibsr.fib(i));
}
}
