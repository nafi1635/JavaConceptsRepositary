package lab5;

public class company
{
    public static void main(String args[])
    {
        company ifanindustries=new company();
        person nafi=new person("nafi","mohammad",18);
        employee bilgates=new employee("nafi","mohammad",18,"great bussiness man",100000000,"CSE");
        customer einstein=new customer(5,30000);
    
    einstein.buy(4);
    einstein.buy("2 ifan laptops");
    nafi.display();
    bilgates.display();
    einstein.display();
    
    
  
}
}