/**
nAfi
date:21/12/15
*/






import java.util.*;
public class anagram
{
	
	public static void main(String args[])
	{
	System.out.println("enter any string to find anagrams");
	Scanner s=new Scanner(System.in);
	String w=s.nextLine();
	
	printanagram(" ",w);
	
	
	}
	static void printanagram(String prefix,String word)
	{
	 
	    //  int count=0;
	     // int sum=0;	       
		if(word.length()==1)
			{
			System.out.println(prefix+word);
			
			}
		else
		 {

		   
		     for(int i=0;i<word.length();i++)	
		     {
		     	String current=word.substring(i,i+1);
		     	String before=word.substring(0,i);
		     	String after=word.substring(i+1);
		     	printanagram(prefix+current,before+after);
		     //	count++;
		     	
		     	
		     	
		     	}
		   //  sum=sum+count;
		   
		    
		    
		     
		     	
		     	
			
		     	
		     }
		      
		        
		   }
		   		 
		     	
}		     	
