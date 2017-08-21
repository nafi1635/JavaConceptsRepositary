
/**
 * Write a description of class calc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class calc
{

public static void main(String[] args) {
int arg1;
int arg2;
int result;
		if (args.length == 1)
			{
				arg1 = Integer.parseInt(args[0]);
				result = arg1 * arg1;
				System.out.println("Square of " + args[0] + " is"+ result);
			}
		else
		 {
				arg1 = Integer.parseInt(args[0]);
				arg2 = Integer.parseInt(args[1]);
				result = arg1 * arg2;
				System.out.println("Product of "+ args[0] +" and " + args[1]+"="+result);
		}
		System.out.println("no of args = " + args.length);
	}	
}
