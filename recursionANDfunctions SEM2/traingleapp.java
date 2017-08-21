import java.util.Scanner;
class traingleapp
{
	static int theNumber;
	public static void main(String[] args)
		{
			System.out.print("Enter a number: ");
			Scanner s=new Scanner(System.in);
			theNumber = s.nextInt();
			int theAnswer = triangle(theNumber);
			System.out.println("Triangle"+theAnswer);
		}
	public static int triangle(int n)
		{
			if(n==1)
			return 1;
			else
			return( n + triangle(n-1) );
		}	
}		
