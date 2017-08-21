import java.util.Scanner;
public class binary
{
	public static void main(String args[])
	{
		System.out.println("enter any number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int [3];
		int i=0;
		while(n>0)
		{	
			
			arr[i]=n%10;
			n=n/10;
			i++;
		}	
		for(int j=i-1;j>=0;j--)
		{
			System.out.println(arr[j]);
		}				
		//char na=(char)n;
		//System.out.println(na);
		
		
		////char nn[]=(char)n.toCharArray();
	////	for(char w:nn)
		//{
		//System.out.println(w);
		
		
		//}
		
		 
	int ch[]={0,1};
	for(int k=0;k<arr.length;k++)
	{
	
	if((ch[0]==arr[k])&&(ch[1]==arr[k])
			{
			System.out.println("yes");
			
			
			}
		}	
		
		
		
		
		
		
	}	
}
		
