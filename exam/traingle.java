import java.util.Scanner;
public class traingle
{
	public static void main(String args[])
		{
			System.out.println("enter any numbers of traingle");
			Scanner obj=new Scanner(System.in);
			int a=obj.nextInt();
			int b=obj.nextInt();
			int c=obj.nextInt();
			if((a!=0)&&(b!=0)&&(c!=0))
				{
					if (a+b>c)
					 { 
					 System.out.println("yes this is traingle");
					 } 
					else if(b+c>a)
					 { 
					 System.out.println("this is traingle");
	                           	}
	                           	else if(a+c>b)
	                           	{
	                           	System.out.println("yes this is");
	                           	}
	                           	else
	                           	{
	                           	System.out.println("not");
	                           	}
	                       }
	              else
	                   {
	                   System.out.println("you entered 0 lengths");
	                   }
	       }
}    
	                            	
		  
	                   			
					
			
			
