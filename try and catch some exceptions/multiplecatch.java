public class multiplecatch
{
	public static void main(String args[])
		{
		
		try {
		int a[]=new int[5];
		a[5]=50/0;
		   
		} 
		catch(ArithmeticException e)
		{
		
		          System.out.println("task 1 complted");
		       }   
		          
		          
		
		catch(ArrayIndexOutOfBoundsException e) 
		{
		
		      System.out.println("task 2 completed");
		     } 
		      
		
		catch (Exception e) 
		{
		
		   System.out.println("command task completed");
		  } 
		   
		
		}
}		
		
