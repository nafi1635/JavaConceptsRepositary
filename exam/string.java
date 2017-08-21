/**
nAfi 
date:4/12/15
*/



import java.util.Scanner;
class string
{
	public static void main(String args[])
		{
		System.out.println("enter any string");
		Scanner obj=new Scanner(System.in);
		String str=obj.nextLine();
		System.out.println("1.splitting those 3.reverse fo those 2.sorting of those 4.sorting of reverse");
		int n=obj.nextInt();
		String stra[]=str.split(" ");
		switch(n)
		{
		case 1:
		{
	       
	       System.out.println("splitting of those");
	       
	       
	       for(String x:stra)
	       	{
	       		System.out.println(x);
	       	}
	       break;	
	       }
	       	
	       case 2:
	       {		
	       	
	       	
	       	
	       System.out.println("sorting of those");
	       
	       	
	       		
	       for(int i=1;i<stra.length;i++)
		{
			for(int j=i;j>0;j--)
			{
				if((stra[j-1].compareToIgnoreCase(stra[j]))>0)
				{
					String c=stra[j-1];
					stra[j-1]=stra[j];
					stra[j]=c;
				}
			}
		}
	        for(String x:stra)
	       	{
	       		System.out.println(x);
	       	}
	       break;	
	      } 	
	      
	      case 3:
	      {
               System.out.println("reverse of those");
              char ch1[];
              for(int i=0;i<stra.length;i++)
		{
			ch1=stra[i].toCharArray();
				for(int j=ch1.length-1;j>=0;j--)
				{
					System.out.print(ch1[j]);


	     			}
				System.out.print("  ");


	     	}



			break;
			}
		case 4:
		{
		for(int i=1;i<stra.length;i++)
		{
			for(int j=i;j>0;j--)
			{
				if((stra[j-1].compareToIgnoreCase(stra[j]))>0)
				{
					String c=stra[j-1];
					stra[j-1]=stra[j];
					stra[j]=c;
				}
			}
		}
		char ch1[];
              for(int i=0;i<stra.length;i++)
		{
			ch1=stra[i].toCharArray();
				for(int j=ch1.length-1;j>=0;j--)
				{
					System.out.print(ch1[j]);


	     			}
				System.out.print("  ");


	     	}

		
		}
		default : 
			{
			System.out.println("invalid fromat");
			
			
			}
			

		}
	}
}

