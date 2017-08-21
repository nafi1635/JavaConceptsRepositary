/**
nAfi
date:17/12/15
*/



public class starsrecursion 
{
	public static void main(String args[])
	{
	int n=5;
	PrintTriangle(n);
	}
  static void PrintTriangle(int c)
  	{
  		if(c==0)
  			
  			return;
  			
  		else
  			{
  			/**PrintTriangle   this is for reverse printing this output
  			
  			*/
  			for(int i=1;i<=c;i++)
  			{
  			System.out.print("*");
  			}
  			System.out.println(" ");
  			PrintTriangle(c-1);
  			}
  		}
  }		
  			
  			
  			
  			
  		 	 	
