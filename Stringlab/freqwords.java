import java.util.Scanner;
public class freqwords
	{
		public static void main(String args[])
		{
		System.out.println("enter any string");
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String s[]=str.split(" ");
		for(int i=0;i<str.length;i++)
			{
				for(int j=0;j<i;j++)
					{
						if((s[i].compareToIgnoreCase(s[j]))<0)
							{
							String a=s[i];
							s[i]=s[j];
							s
						
		
		
			
