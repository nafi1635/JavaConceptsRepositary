
/**
 * this is over loaded method:java defines two or more methods in a same class with same
 * method name and diffrent parameters
 * @nafi) 
 * date:8/10/2015)
 */
class overloaded
{
    int height;
    overloaded()
    {
        System.out.println("bricks");
        height=0;
    }
    overloaded(int i)
    {
        System.out.println("buliding new house that is"+i+"feetfall");
        height=i;
    }
    void info()
    {
        System.out.println("house is "+height+"feet fall");
    }
    void info(String s)
    {
        System.out.println(s+"house is"+height+"feetfall");
    }
}
public class Mainclass
{
    public static void main(String args[])
    {
        overloaded o=new overloaded();
        o.info();
        o.info("overloaded method");
        new overloaded();
    }
}
        