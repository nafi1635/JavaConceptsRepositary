class one
{
    int i=10;
    void show()
    {
        System.out.println("super"+i);
    }
}
  class two extends one
{
    int i=20;
    void show()
    {
System.out.println("sub="+i);
System.out.println("super="+super.i);
}
public static void main(String args[])
{
    two t=new two();
    t.show(); 
    //here direct show function is not acceble we have to create a object
}
}
