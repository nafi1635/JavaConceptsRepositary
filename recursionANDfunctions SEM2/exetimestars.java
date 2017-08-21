/**
nAfi
date:22/12/15
*/



public class exetimestars 
{
	public static void main(String args[])
	{
	long time1=System.nanoTime();
	int n=40;
	PrintTriangle(n);
	long time2=System.nanoTime();
	double seconds=(time2-time1)/Math.pow(10,9);
	System.out.println(seconds);
	
	
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
  			
  			
  			
  			
  		 	 	
