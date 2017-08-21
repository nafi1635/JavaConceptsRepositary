package lab5;

public class customer
{
	private float discount;
	private float  balance;   
	
public customer(float b,float c)
{
		balance=b;
		discount=c;
	}
void  balance(float b)
{
    
}
void discount(float c)
{
}
void buy(int n)
{
    System.out.println("you brought 4 times man");
}
void buy(String s)
{
    System.out.println("you brought laptops");
}
void display()
{
    System.out.println("laptop price is   "+discount+"  "+"you have only discount"+balance+"  "+"rupees only");
    }
}
