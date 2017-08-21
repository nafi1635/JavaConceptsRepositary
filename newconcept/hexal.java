import java.util.Scanner;
public class hexal
{
	public static void main(String args[])
	{
	System.out.println("enter any hexa decimal");
	Scanner s=new Scanner(System.in);
	char n=s.next().charAt(0);
	System.out.println(n);
	char x;
	try
	{
	if((n<10)&&(n>=0))
		{		
		x=n;
		 System.out.println(x);
		}
	else{
			if(n=='A')
				{
				System.out.println("hexadecimal values is "+10);
				}
			else if(n=='B')
				{
				System.out.println("hexadecimal values is "+11);
				}	
			else if(n=='C')
				{
				System.out.println("hexadecimal values is "+12);
				}
			else if(n=='D')
				{
				System.out.println("hexadecimal values is "+13);
				}	
			else if(n=='E')
				{
				System.out.println("hexadecimal values is "+14);
				}	
			else if(n=='F')		
				{
				System.out.println("hexadecimal values is "+15);
				}
	
			else
			{
			throw new NotIntheHexaDecimalValues();
			}
		}
		}
		catch(NotIntheHexaDecimalValues e)
		{
		System.out.println(e);
		
		
		}	
	}
 }			
	
	
	
	
	
	
	
	
	
	
	
