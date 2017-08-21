import java.util.Scanner;
public class stringconcept
{
   public static void main(String[] args)
    {
      System.out.println("enter any string");
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      System.out.println("your string is"+str);
      System.out.println("enter what you have search");
      String str1=s.next();
	int ind= str.indexOf(str1);
	
      if(ind== - 1)
      {
         System.out.println("Hello not found");
      }
      else
      {
    		System.out.println("not found");
    		
    		
      }
   }
}
