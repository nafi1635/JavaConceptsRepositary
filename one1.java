class one1
{
    one1()
    {
        System.out.println("one");
    }
}
class two2 extends one1
{
    two2()
    {
        // by default here we have super key word thats why these print 
        //only one value
        System.out.println("two");
    }
    public static void main(String args[])
    {
        two2 t=new two2();
        
    }
}
