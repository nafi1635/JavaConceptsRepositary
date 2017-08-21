import java.util.Scanner;
public class palin
{
	public static void main(String args[])
	{
		System.out.println("enter any string");
		Scanner obj=new Scanner(System.in);
		String str=obj.next();
		StringBuffer str2=new StringBuffer(str);
		
		System.out.println(str2);
		System.out.println(str2.reverse());
		
		
    }		
}		
		
		
