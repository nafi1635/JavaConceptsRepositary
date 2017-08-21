
/**
 * Write a description of class simpleinheritance here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class A
{
    int i;
    void show()
    {
        i=15;
        System.out.println("Its a"+i);
    }
    public int change(int i)
    {
        return i;
    }
}
class B extends A
{
    int k;
    void show()
    {
        System.out.println("its b");
    }
    void sum()
    {
        System.out.println(i+k);
    }
}    
   
public class simpleinheritance
{
    public static void main(String args[])
         {
             A a=new A();
             
             a.show();
            }
        }
        
    
        
