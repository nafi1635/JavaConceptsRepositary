import java.util.Scanner;
public class numbersorting
{
	public static void main(String args[])
	{
		
		System.out.println("enter elements to array");
		Scanner s=new Scanner(System.in);
		
		int arr[]=new int[5];
		int currentsize=0;
		for(int k=0;k<arr.length;k++)
			{
				int n=s.nextInt();
				arr[currentsize]=n;
				currentsize++;
				if(currentsize==arr.length)
				break;
				
				
			}
		
		
		
		
		//for(int number : arr)
		//{
		//System.out.println(number);
		//}
		for(int i=0;i<arr.length;i++)
			{
				for(int j=i;j>0;j--)
				{
					if(arr[j-1]>arr[j])
						{
							int c=arr[j-1];
							arr[j-1]=arr[j];
							arr[j]=c;
						}
				}
			
			}
		for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]+"\t");
				
				
			}	
		System.out.println("2nd maximum number is"+" "+arr[1]);
		System.out.println("2nd minimum number is"+" "+arr[4]);
		
		
		
			
					
					
					
					
						
	}
}		
		
		
