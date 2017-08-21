import java.util.Scanner;
public class pass
{
    public static void main(String args[])
    {
        int passmarks,marksobtained;
        System.out.println("please enter your marks");
        Scanner obj=new Scanner(System.in);
        marksobtained=obj.nextInt();
        passmarks=35;
        if(marksobtained>=100)
        {
            if(marksobtained>passmarks)
            {
             System.out.println("unfortunately you passed in the exam..you have to study next year");
            }
             else
             {
            System.out.println("luckky...your not passed in the exam...stay at home");
        }
    }
    else
    {
    System.out.println("you are lier...enter correct marks");
}
}
}