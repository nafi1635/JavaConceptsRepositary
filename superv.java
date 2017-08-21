class one
{
    void one()
    {
        System.out.println("one");
    }
}
class two extends one
{
    void two()
    {
        super();
        System.out.println("two");
    }
public class mainclass
{    
    public static void main(String args[])
    {
        two t=new two();
    }
}