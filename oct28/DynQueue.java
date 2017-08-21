package oct28;


/**
 * Write a description of class DynQueue here.
 * 
 * @nafi
 * @29/10/15
 */
public class DynQueue implements IntQ
{
 private int q[];
    private int head,tail;
    public DynQueue(int size)
    {
        q=new int[size];
        head=tail=0;
    }
   public  void enqueue(int num)
    {
        if(tail==q.length)
        {
            int t[]=new int[q.length*2];
            for(int i=0;i<q.length;i++)
            {
                t[i]=q[i];
            }
            q=t;
        }
        q[tail]=num;
        tail++;
        System.out.println("Item inseted");
}
 public int dequeue()
{
    if(head==tail)
{
    System.out.println("queue is empty..");
    return 0;
}
int num=q[0];
for(int i=0;i<q.length-1;i++)
{
    q[i]=q[i+1];
}
tail--;
q[tail]=0;
return num;
}
}