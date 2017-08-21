import java.util.Scanner;
public class exceptionn implements customexception
		{
			public static void main(String args[])
			
			{
			 	try
			 	{
			 	      System.out.println("Enter any string");
	                   Scanner obj=new Scanner(System.in);
	                   String n=obj.nextLine();
	                   System.out.println("enter any string to search in previous");
	                   String i=obj.nextLine();
      				int intIndex = n.indexOf(i);
      								if(intIndex == - 1)
      								{
        			 	
        			 					throw new customexception();
      								}
      					
      								else
      									{
         									System.out.println("Found "+i+" "+ "at index "+ intIndex);
         								}
         			}
         			catch(customexception e)
         			{
         			
         			System.out.println("this is not found");
         			
         			
         			}
         	}
       }  				
