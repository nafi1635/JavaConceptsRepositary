import java.util.Scanner;
public class lab31
{
    public static void main(String args[])
    {
      int ar1[][]= new int[3][3];
      int ar3[][]=new int[3][3];
      
      
      Scanner n = new Scanner(System.in);
      System.out.println("enter the elements to the array");
      for(int i=0;i<3;i++)
      {
         for(int j=0;j<3;j++)
           {
           ar1[i][j] = n.nextInt();
        }
        
       }
         for(int i=0;i<3;i++)
          {
           for(int j=0;j<3;j++)
          {
          System.out.print(ar1[i][j]+" ");
        }
        System.out.println();
       }
      int ar2[][]=new int[3][3];
        Scanner m = new Scanner(System.in);
      System.out.println("enter the elements to the array");
      for(int k=0;k<3;k++)
      {
         for(int l=0;l<3;l++)
           {
           ar2[k][l] = n.nextInt();
        }
        
       }
         for(int k=0;k<3;k++)
          {
           for(int l=0;l<3;l++)
          {
          System.out.print(ar2[k][l]+" ");
        }
        System.out.println();
       }
       
       for(int i=0;i<3;i++)
	{
	for(int j=0;j<3;j++)
	{
		int sum=0;
	for(int k=0;k<3;k++)
	{
		sum=sum+(ar1[i][k]*ar2[k][j]);
	    ar3[i][j]=sum;
	}}
}
	System.out.println("multiplication of matrix:");
	for(int i=0;i<3;i++)
	{
	for(int j=0;j<3;j++)
	{
		System.out.print("  "+ar3[i][j]);
	}
	System.out.println("");
	}
}
    
    
     }

