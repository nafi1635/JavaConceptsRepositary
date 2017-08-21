import java.util.Scanner;
public class primne
{
    public static void main(String args[])
    {
        System.out.println("enter number");
        Scanner n=new Scanner(System.in);
        int s=n.nextInt();
        
        int p=2;
        
        while(s>=1)
        {
            if(s%p==0)
            {
             System.out.println(p);
             s=s/p;
           
            }
             else
             {
                p=p+1;
            }
           
            
            
            
            
            
            
            
        }
        
        
         int sum=0;
             sum=sum+p;
            System.out.println(sum);
            
    }
}
               
        
        
