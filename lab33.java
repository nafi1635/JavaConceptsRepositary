import java.util.Scanner;
public class lab33
{
    public static void main(String args[])
    {
        int palin,nafi=0,rem;
        System.out.println("enter ur wish number");
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        palin=num;
        while(num>0)
        {
            rem=num%10;
            num=num/10;
            nafi=nafi*10+rem;
        }

        if(nafi==palin) 
          System.out.println("this is a paliandrome");
        else
        System.out.println("this is not a paliandrome");
    }
}