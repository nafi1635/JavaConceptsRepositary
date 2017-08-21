
/**
 * Write a description of class calculatoroperations here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class calculatoroperations
{
	public static void main(String args[])
		{
		  int a=10,b=5,x,y,z,w;
		  System.out.println("enter what you want operation between 10 and 5 ....1.Addition 2.Substraction 3.Multiplication 4.Divison");
		  Scanner obj=new Scanner(System.in);
		  int c=obj.nextInt();//declares all integers
		  x=a+b;
		  y=a-b;//if you want inputs use Scanners
		  z=a*b;
		  w=a/b;
		  switch(c)  //switch is given
		  {
		     case 1:
		     System.out.println("Addition is  "+x); 
		     break;
		     case 2:
		     System.out.println("Substraction is  "+y);
		     break;
		     case 3:
		     
		     System.out.println("Multiplication is  "+z);
		     break;
		     case 4:
		     System.out.println("division is  "+w);
		   }
		  }     //nafi
}		     
		     