
/**
 * Write a description of class multiplicationtable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class multiplicationtable
{
    public static void main(String args[])
    {
        System.out.println("enter any number what you want to know");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=0;i<=n;i++)
        {
            System.out.println(n+"*"+i+"="+(n*i));
        }
    }
}
        