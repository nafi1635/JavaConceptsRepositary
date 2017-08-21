
/**
 * Write a description of class Quadraticequation here.
 * 
 * @author nafi
 * @7/11/15
 */
import java.util.Scanner;
public class Quadraticequation
{
    
	public static void main(String args[])
	{
	 double a,b,c;
	 double det,r1,r2,real,img;
	 System.out.println("Enter any numbers");
	 Scanner obj=new Scanner(System.in);
	 a=obj.nextDouble();
	 b=obj.nextDouble();
	 c=obj.nextDouble();
	 det=b*b-4*a*c;
	 if(det>0)
	 {
	 r1=((-b+Math.sqrt(det))/2*a);
	 r2=((-b-Math.sqrt(det))/2*a);
	 System.out.println("r1   "+r1+"  r2  "+r2);
	 }
	 else if(det==0)
	 {
	 r1=r2=-b/2*a;
	 System.out.println("two roots  "+(r1) + (r2));
        }
     else
      {
	 real=-b/2*a;
	 img=Math.sqrt(-det)/(2*a);
	 
	 System.out.println("roots "+(real+img)+"i"+(real- img)+"i"); 
}
	 }
} 
	 
