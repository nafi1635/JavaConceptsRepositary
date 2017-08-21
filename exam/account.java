import java.util.Scanner;
class account
	{
		private String name;
		private double balance;
		account(String n,double b)
			{
			name=n;
			balance=b;
			}
			
	      void deposit()
	      	{
	      	
	      	Scanner s=new Scanner(System.in);
	      	System.out.println("enter money to deposit");
	      	double dep=s.nextDouble();
	      	balance=balance+dep;
	      	System.out.println("balance after deposit"+balance);
	      	}
	      	
	      	
	      		
	      				void withdraw()
	      					{
	      						Scanner s=new Scanner(System.in);
	      						System.out.println("enter money to withdraw");
	      						double with=s.nextDouble();
	      						try
	      								{
	      									if(balance>=with)
	      											{
	      												balance=balance-with;
	      												System.out.println("");
     		
	      												}
	      									else	
	      											{
	     									 	throw new lessbalanceexception();
	     							 				}
	      									}
	      						catch(lessbalanceexception e)
	      								{
	      								System.out.println(e);
	      	
	      	
	      								}
	      	}
	      	}
	      	
	      	
	      	
	      
	      
	      
	      	
	      	
	      	
	      	
	      	
	      	
