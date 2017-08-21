    /*
nAfi
date:6-01-16
     */
  import java.util.Scanner;
 public class insertionsort 
 {
      public static void main(String[] args) 
             {
          Scanner scan = new Scanner( System.in );        
          System.out.println("Insertion Sort Test\n");
          System.out.println("Enter number of integer elements");
            int  n = scan.nextInt();
            int arr[] = new int[ n ];
          System.out.println("\nEnter "+ n +" integer elements");
            for (int i = 0; i < n; i++)
                                arr[i] = scan.nextInt();
          sort(arr);
          System.out.println("\nElements after sorting ");        
            for(i = 0; i < n; i++)
                     System.out.print(arr[i]+" ");            
                     System.out.println();                     
 }    
     public static void sort( int arr[] )
       {
             int N = arr.length;
             int i, j, temp;
          for (int i = 1; i< N; i++) 
           {
                j = i;
                temp = arr[i];   
                while (j > 0 && temp < arr[j-1])
                {
                    arr[j] = arr[j-1];
                    j = j-1;
                }
           arr[j] = temp;            
                     }        
        }    
}

