package Stringlab;

public class sort
{
	public static void main(String args[])
	{
		
		int a[]={5,2,3,6,1};
		for(int x:a)
		{
			System.out.println(x+"\t");
		}
		for(int i=1;i<a.length;i++)
		{
			for(int j=i;j>0;j--)
			{
				if(a[j-1]>a[j])
				{
					int c=a[j-1];
					a[j-1]=a[j];
					a[j]=c;
				}
			}
		}
		for(int x:a)
		{
			System.out.print(x+"\t");
		}
	}
}
