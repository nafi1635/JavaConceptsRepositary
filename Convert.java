public class Convert //for Hello class file
{
	public static void main(String args[])
        
	{
		double i,meter;
		int counter=0;
   		{
  			for(i=1;i<=144;i++)
			{
 			meter=i* 0.025;
	  		System.out.println(i+"inches equlas to"+meter+"meters");
 	 		counter++;
 			if(counter==12)
			{
			   System.out.println("");
			   counter=0;
			}
			}

		}
	}
}
