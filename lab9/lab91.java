package lab9;
import java.util.Scanner;
import java.lang.String;
import java.lang.StringBuffer;


/**
 * Write a description of class lab91 here.
 * 
 * @smart nafi
 * @version (a version number or a date)
 */
public class lab91
{
public static void main(String args[])
{
  System.out.println("enter any string");
  Scanner obj=new Scanner(System.in);
  String s1=obj.nextLine();
  System.out.println(s1);
  String str=s1;
  String words[]=str.split(" ");
  
 for(String s:words)
 {
     System.out.println(s);
    char chararr[] = s.toCharArray();
System.out.println(chararr);
    
    
    }
    

}

}
  

  

