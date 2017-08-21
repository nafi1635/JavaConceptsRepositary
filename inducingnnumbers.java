
/**
 * Write a description of class inducingnnumbers here.
 * 
 * @nafi
 * @7/11/15
 */
import java.util.Scanner;
public class inducingnnumbers
{
   public static void main(String args[])
   {
       double array[]=new double[5];
       int n=0;
       while(n<5)
       { 
           int flag=0;
           System.out.println("enter numbers");
           Scanner obj=new Scanner(System.in);
           int s=obj.nextInt();
           if(s<=100&&s>=10)
           {
               for(int i=0;i<=n;i++)
               {
                   if(array[i]==s)
                   {
                       flag=1;
                       break;
                    }
                }
                     if(flag==0)
                     {
                         array[n]=s;
                         n++;
                        }
                        else
                        {
                            System.out.println("room full");
                        }
                    
                }
             else
             {
             System.out.println("enter between range");
            }
        
        }
        for(n=0;n<5;n++)
        System.out.println(array[n]);
    
    }
}

                
               
