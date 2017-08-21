import java.util.*;
public class stringreversecap
	{
		public static void main(String args[])
			{
				System.out.println("enter any string");
				Scanner s=new Scanner(System.in);
				String str=s.nextLine();
				char ch[];
				for(int i=0;i<str.length();i++)
					{
					 ch=str.toCharArray();
					for(int j=ch.length-1;j>0;j--)
						{
							System.out.print(ch[j]);
							
						}
						
						
						
						
						
					}
				
			}
	}						
							
							
				
				
				
