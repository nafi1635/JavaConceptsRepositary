package lab9;


/**
 * 
 * Write a description of class string here.
 * 
 * @smart nafi
 * @10/10/15
 */
import java.lang.String;
import java.lang.StringBuffer;

public class string

{
    public static void main(String args[])
    {
        String s1=new String("hello boss...ur great..");  //we declared this strigs
        String s2=new String("im SURE it will great to come out from the class..");
        int I=s1.length();
        System.out.println(I);//this will find the length
        String s3;
        s3=s2.toUpperCase();  
        System.out.println(s3); //this will in uppercase
        s3=s2.toLowerCase();
        System.out.println(s3);
        char c=s2.charAt(17);  //find place at 17 number
        System.out.println(c);
        char ca[]=s2.toCharArray();    //numberth place
        System.out.println(ca);
        s1.equals(s2);
        System.out.println(s1);
        s1.compareTo(s2);//this will find index it means seaching how many times a exsits
        System.out.println(s1);
        s2.compareToIgnoreCase(s1);
        System.out.println(s2);
        int i=s2.indexOf('a');
        System.out.println(i);
        String s4=s1.substring(8);
        System.out.println(s4);
        String s5= s1.replace("l", "x");
        System.out.println(s5);
        System.out.println(s1.trim());
        String arr[]=s2.split("");
        
        
    
        
        
        
      
        
    }
}