public class sqrt
{
    public static void main(String args[])
    {
        double x=calculate(4.0);
        System.out.println(x);
    }
    public static double calculate(double n)
    {
        double rootvalue=1.0;
        for(int i=0;i<n;i++)
        {
            rootvalue=0.5*(rootvalue+(n/rootvalue));
        }
        return rootvalue;
    }
}