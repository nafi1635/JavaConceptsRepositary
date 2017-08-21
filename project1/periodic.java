package project1;


/**
 * Write a description of class periodic here.
 * 
 * @nAfi sMart
 * @5/11/15
 */
import java.util.Scanner;
public class periodic
{
    public static void main(String args[])
    {
        System.out.println("enter number ");
        Scanner obj=new Scanner(System.in);
        int i=obj.nextInt();
        switch(i)
        {
        case 1:
            System.out.println("enter another number");
            Scanner in=new Scanner(System.in);
            int j=obj.nextInt();
            switch(j)
            {
            case 1:
            System.out.println("ya this is working");
            default:
        System.out.println("out of box");
        }
        default:
        System.out.println("out of box");
        
    }
}
}

            
        