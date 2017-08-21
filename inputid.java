import java.util.Scanner;
public class inputid
{
    public static void main(String args[])
    {   
        int i=1;
        while(i==1)
        {
        System.out.println("enter ur id");
        Scanner input=new Scanner(System.in);
        String id=input.next();
        System.out.println("enter ur name");
        String name=input.next();
        System.out.println("ID"+": "+id);
        System.out.println("NAME"+": "+name);
        System.out.println("now u enter ur net password:");
        String psd=input.next();
        System.out.println("please enter correct password");
    }
    }
}