public class minmax
{
public static void main(String args[])
{
    int array[]=new int[2];
    int max,min;
    array[0]=10;
    array[1]=-10;
    min=max=array[0];
    for(int i=1;i<2;i++)
    {
        if(array[i]<min)
        {
            System.out.println("min"+array[i]);
        }
        else
        {
            System.out.println("max"+array[i]);
        }
    }
}
}