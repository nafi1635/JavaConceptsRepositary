package project1;


/**
 * Write a description of class offlineceo here.
 * 
 * @nafi
 * @
 */
import java.util.Scanner;
public class offlineceo extends ceo
{
    public static void main(String args[])
    {
    System.out.println("enter User name plz");
    System.out.print("username"+"$"+" ");
    Scanner forname=new Scanner(System.in);
    String username=forname.nextLine();
    switch(username)
    {
         case "nafi":
             
             System.out.print("Pass Word"+"$"+"");
             Scanner password=new Scanner(System.in);
             String pwd=password.nextLine();
             
             if(pwd.equals("frnd")) //for String comparison
                    {
                        System.out.println("Welcome Boss");
                        ceo ceoobject=new ceo();
                        ceoobject.display();
                    }
             else
                    {
                        
                        System.out.println("OOPs..password wrong");
                    }
                    break;
             
         default:
             System.out.println("Wrong username..");
   }      
}
}    
