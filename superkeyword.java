
/**
 * Write a description of class superkeyword here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
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
public class superkeyword
{    
    public static void main(String args[])
    {
        two t=new two();
    }
}