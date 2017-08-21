package newconcept;


/**
 * Write a description of class diffrntvalues here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
class diffrnt
{
    public int a;
    public int b;
    public diffrnt(int a,int b)
      {
          this.a=a;
          this.b=b;
        }
    void showa()
    {
        System.out.println(a);
    }
    void showb()
    {
        System.out.println(b);
        }
    public int changevalues(int x,int y)
    {
        a=x;
        b=y;
      System.out.println(a+""+b);
       return  a;
    }
}
public class diffrntvalues
{
    public static void main(String args[])
    {
        System.out.println("enter any numbers");
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        
        diffrnt o=new diffrnt(a,b);
        System.out.println("this is your values of a,b");
        o.showa();
        o.showb();
        int c=obj.nextInt();
        int d=obj.nextInt();
        System.out.println("this is your changevalues");
        o.changevalues(c,d);
    }
}