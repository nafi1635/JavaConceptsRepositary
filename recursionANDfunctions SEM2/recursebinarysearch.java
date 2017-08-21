public class recursebinarysearch
{
	public static void main(String args[])
	{
		int arr[4]={1,2,3,4,5};
		binarysearch(4,0,5);
				
			
	
	}
	static int binarysearch(int x,int min,int max)
		{
		int mid=(min+max)/2;
		if(arr[mid]==x)
			return mid;
		else
			if(arr[mid]>x)
				binarysearch(x,min,mid-1);
			else
				binarysearch(x,mid,max);
						
		}
	}	
