import java.util.Scanner;
public class number
{
	public static void main(String args[])
	{
		int arr[]=new int[5];
		int i=0,j=0,k=0;
		int NoOfElements=0;
		System.out.println("Enter any number: ");
		Scanner s=new Scanner(System.in);
		while(NoOfElements<5)
		{
			int flag=0;
			int m=s.nextInt();
			if((m<=100)&&(m>=10))
			{
				for(j=0;j<NoOfElements;j++)
				{
					if(arr[j]==m)
					{
						
						System.out.println("This number already in array please enter a new number:");
						flag=1;
						break;
					}
				}
				if(flag==0)
				{
					arr[NoOfElements]=m;
					NoOfElements++;
				}
			}
			else
			{
				System.out.println("Range in bitween the 10 to 100 Only: ");
			}
		}
		System.out.println("Array containing Elements are :");
		for(k=0;k<5;k++)
		{
			System.out.println(arr[k]);
		}
	}

}
