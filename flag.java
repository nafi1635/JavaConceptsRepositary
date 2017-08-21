import java.util.Scanner;
public class flag
{
     public static void main(String[]args)
    {
    double array[]=new double[5];
    int n=0;
    while(n<5)
    {
    int flag=0;
    System.out.println("enter a value :");
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    if(a<=100&&a>=10)
          {
    for(int i=0;i<=n;i++)
        if(array[i]==a)
        {
         flag=1;
         break;
    }
    if(flag==0)
    {
    array[n]=a;
    n++;
    }
    else
    {
    System.out.println("number is present. enter another value :");
    }
    }
    else 
    {
    System.out.println("enter the number in the range :");
    }
    
	     }for(n=0;n<5;n++)System.out.println(array[n]);
	   }}		