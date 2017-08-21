import java.util.*;
public class lexicographic
{
	public static void main(String args[])
		{
			System.out.println("enter any string");
			Scanner s=new Scanner(System.in);
			String str=s.nextLine();
			String str1[]=str.split(" ");
			for(int i=0;i<str1.length;i++)
				{
					for(int j=i;j>0;j--)
						{
							if(str1[j].compareToIgnoreCase(str1[j-1])<0)
								{
									String c=str1[j-1];
									str1[j-1]=str1[j];
									str1[j]=c;
								}
						}
					
				}
				System.out.println("order is");
					for(String given:str1)
					
					{
						System.out.println(given);
					}
		}	
}					
						
									
							
			
