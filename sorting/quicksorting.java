/**
nAfi
date:04-01-16
*/

public class quicksorting
{
        public static void main(String args[])
        {
                int arr[]={7,2,1,6,8,5,3,4};
               System.out.println("Array elements are:");
               for(int i=0;i<8;i++)
               {
                System.out.println(arr[i]);
                } 
                int start=0;
                int end=7;
                quicksort(arr,start,end);
           }  
           
           static void quicksort(int arr[],int start,int end)
                {
                        if(start>=end)
                        {
                                return;
                        }
                        else
                         {
                                int pIndex=partition(arr,start,end);
                                quicksort(arr,start,pIndex-1);
                                quicksort(arr,pIndex-1,end);
                         }       
                }  
                
                
               static int partition(int arr[],int start,int end)
               {
                        int pivot=arr[end];
                        int pIndex=start;
                        for(int i=start;i<7;i++)
                        {
                                if(arr[i]<pivot)
                                        {
                                                int temp=pIndex;
                                                pIndex=arr[i];
                                                arr[i]=temp;
                                                pIndex++;
                                         }
                           }
                           int temp=arr[pIndex];
                           
                           arr[pIndex]=arr[end];
                           arr[end]=temp;
                           return pIndex;                     
                         }
 }              
