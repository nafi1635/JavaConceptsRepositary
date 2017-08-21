public class mergesorting
{
	public static void main(String args[])
	{
		int arr[]={27,10,12,15};
		int high=arr.length-1;
		int low=0;
		mergesort(arr,low,high);
		for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);				
			}	
	}
			
	static void mergesort(int arr[],int low,int high)
			{
				if(low==high)
					{
						return;
					}
				else
					{
						int mid=(low+high)/2;
						mergesort(arr,low,mid);
						mergesort(arr,mid+1,high);
						merge(arr,low,mid,high);
						
					}
			
			}
			
	static void merge(int arr[],int low,int mid,int high)
			{
			int i,j,k;
			int n1=mid-low+1;
			int n2=high-mid;
			int L[]=new int[n1];
			int R[]=new int[n2];
			for(i=0;i<n1;i++)
				L[i]=arr[low+i];
			for(j=0;j<n2;j++)
				R[j]=arr[mid+1+j];
				i=0;
				j=0;
				k=low;
			while(i<n1&&j<n2)
				{
					if(L[i]<=R[j])
						{
							arr[k]=L[i];
							i++;
							k++;
						}
					else
					{
						arr[k]=R[j];
						j++;
						k++;			
					}
				}
				while(i<n1)
					{
						arr[k]=L[i];
						i++;
						k++;
					}
				while(j<n2)
					{
						arr[k]=R[j];
						j++;
						k++;
					}			
			}	
}				
