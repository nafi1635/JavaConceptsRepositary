package lab5;
import java.util.Scanner;

/**
 * this is main class 
 * 
 * @author:smart nafi
 * @8/10/15
 */
public class areas
{
  
 public static void main(String args[])
    {
         System.out.println("Enter radius of circle");
         Scanner obj=new Scanner(System.in);
         double n=obj.nextDouble();
         System.out.println("Enter base and height of traingle");
         double b=obj.nextDouble();
         double h=obj.nextDouble();
         System.out.println("Enter side of square");
         double s=obj.nextDouble();
         System.out.println("Enter length and breadth of rectangle");
         double l=obj.nextDouble();
         double e=obj.nextDouble();
      
         
        areas allareas=new areas();
        circle nafi=new circle(n);
        triangle kafi=new triangle(b,h);
        square mafi=new square(s);
        rectangle jafi=new rectangle(l,e);
        System.out.println("yaaa.. great work MR.nafi you got the pROgram...");
         System.out.println("                             ");
        nafi.display();
        System.out.println("                   ");
 kafi.display();
 System.out.println("                             ");
 
 mafi.display();
  System.out.println("                             ");
 jafi.display();
 
    
  
}
}