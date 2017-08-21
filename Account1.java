public class Account1
{
    private String firstname;
    private String lastname;
    private double balance;
    private String accountno;
    
    public String getaccountno()
    {
         return accountno;
        }
        public double getbalance()
        {
            return balance;
             }
             void deposit(double amount)
             {
                 balance=balance+amount;
                }
                void withdraw(double amount)
                {
                 balance=balance-amount;
                }
            }
            
         
    