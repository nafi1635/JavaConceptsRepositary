import java.util.Scanner;
public class Roll
{
    public static void main(String args[])
    {
        int i,n,sum=0;
        Scanner x=new Scanner(System.in);
        n= x.nextInt();
        for(i=0;i<n;i++)
        {
            int r=(int)(Math.random()*6+1);
            {
                sum=sum+r;
                System.out.println(r);
            }
        }
    }
} 
