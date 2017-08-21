import java.util.Scanner;
public class vowelsconsonants
	{
		public static void main(String args[])
			{
			System.out.println("enter anyy string");
			Scanner s=new Scanner(System.in);
			String str=s.nextLine();
			char arr[]=str.toCharArray();
			int c=0;
			int d=0;
			for(int i=0;i<arr.length;i++)
			
				{
					if((arr[i]=='a')||(arr[i]=='e')||(arr[i]=='i')||(arr[i]=='o')||(arr[i]=='u'))
						{
							c=c+1;
						}
					
					else
					  {
					     d=d+1;
					     }
					     
					 }
					 System.out.println("no of vowels"+c);
					     System.out.println("consonants"+d);
			}
	}				     
					     
					     
					     
					
						
			
		
