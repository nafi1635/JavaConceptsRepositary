package oct28;


/**
 * Write a description of class FixedQueue here.
 * 
 * smart nafi
 * 29/10/15
 */
class FixedQueue implements IntQ
{
    private int q[];
    private int head,tail;
    public FixedQueue(int size)
    {
        q=new int[size];
        head=tail=0;
    }
    public void enqueue(int num) //throws QueueExceptionFull
    {
        if(tail==q.length)
        {
             //throw(new QueueExceptionFull());
             System.out.println("Sorry...queue is full");
            return;
            }
q[tail]=num;
tail++;
System.out.println("Item inserted");
}
public int dequeue()throws QueueException
{
    if(head==tail)
{ 
   
    throw(new QueueException());//System.out.println("que is empty") ;
   //return 0; 
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


    
