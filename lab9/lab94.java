package lab9;

import java.util.Scanner;
/**
 * Write a description of class lab94 here.
 * smart nafi 
 * @version (a version number or a date)
 */
public class lab94
{
  
public static void main(String args[]) 
{
    System.out.println("enter any number");
    Scanner obj=new Scanner(System.in);
    String s1=obj.nextLine();
char chararr[] = s1.toCharArray();
int i=s1.indexOf("a");
System.out.println(i);


System.out.println("Converted value to character array = ");
for(char ch : chararr)
 {
System.out.print(ch);

}
}
}


