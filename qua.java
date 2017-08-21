import java.util.Scanner;
public class qua
{	
	public static void main(String args[])
	{	
		float a,b;
		int c;
		System.out.println("enter any numbers");
	  	Scanner obj=new Scanner(System.in);
	  	a=obj.nextFloat();
	  	b=obj.nextFloat();
	  	System.out.println("Enter your choice frm 1.addtion	2.substraction 	3.multiplication 	4.Divison");
	  	c=obj.nextInt();
	  		switch(c)
  			  {
	  			case 1:
	  			System.out.println(a+b);
	  			break;
	  			case 2:
	  			System.out.println(a-b);
	  			break;
	  			case 3:
	  			System.out.println(a*b);	
	  			break;
	  			case 4:
	  			{
	  				if(b==0)
	  				System.out.println("Division is not possible");
	  				else  
	  				System.out.println(a/b);
	  			}	
	  	         }	
	  	}
}	  		