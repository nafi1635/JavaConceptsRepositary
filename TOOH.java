import java.util.Scanner;  //TOWER OF HANOI
public class TOOH
{
	public static void main(String args[])
	{
		System.out.println("enter wish number : enter if you only have intrest to know this");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		TOH(num,'A','B','C');   //TOH  it is a function
	}
	
	 
	static void TOH(int n,char start,char use,char dest)  
	{
		if(n==1)     // 
		{
			System.out.println(start+"-->"+dest);
		}
		else
		{
		TOH(n-1,start,dest,use);
		TOH(1,start,use,dest);
		TOH(n-1,use,start,dest);
		}
		
	} //no of moves is equals to (2^n)-1
	
	
}                                                              //nafi
