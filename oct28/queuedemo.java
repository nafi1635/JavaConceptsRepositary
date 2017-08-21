package oct28;


/**
 * Write a description of class queuedemo here.
 * 
 * @nafi 
 * 29/10/15
 */
class queuedemo
{
    public static void main(String args[])
    {
        IntQ queue[]=new IntQ[2];
        queue[0]=new FixedQueue(3);
        queue[1]=new DynQueue(3);
        
        for(int i=0;i<2;i++)
        {
            for(int k=0;k<5;k++)
            {
                queue[i].enqueue(k);
            }
        }
        for(int i=0;i<2;i++)
        {
            for(int k=0;k<5;k++)
            {
                queue[i].dequeue();
            }
        }
    }
}