
/**
 * Write a description of class primefactors here.
 * 
 * @nafi
 * @07/11/15
 */
import java.util.Scanner;
public class primefactors
{
 
public static void main(String args[])
{
System.out.println("enter any number");
Scanner s=new Scanner(System.in);
int b=s.nextInt();
int p=2;
while(b>1)
{
if(b%p==0)
{
System.out.println(b);
b=b/p;
}
else
b=b+1;
}
}
}