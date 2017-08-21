import java.util.Scanner;
public class binarysearch
{
	static int a[]=new int[5];
	static int x;
public static void main(String args[])
	{	
		System.out.println("Enter 5 elements into the array:");
		Scanner obj=new Scanner(System.in);
		for(int i=0;i<5;i++)
		a[i]=obj.nextInt();
		System.out.println("Enter a element to find:");
		Scanner s=new Scanner(System.in);		
		x=s.nextInt();
		binarysearch(x,0,a.length-1);
		
	}
	static void binarysearch(int x,int min ,int max)
	{
		int mid=(min+max)/2;
		if(a[mid]==x)
		{
			System.out.println("The element found at index: "+mid);
		}
		else if(min>max)
		{
			System.out.println("Searchkey not found!!!!!!");
		}
		else
		{
			if(a[mid]>x)
			{
				binarysearch(x,min,mid-1);
			}
			else
			{
				binarysearch(x,mid+1,max);
			}
		}
	}
}
