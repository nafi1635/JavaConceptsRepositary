package oct28;


/**
 * Write a description of class queuedem here.
 * 
 * @nAfi sMart
 * @5/11/15
 */
public class queuedem
{
    public static void main(String args[])
    {
        FixedQueue q=new FixedQueue(2);
        q.enqueue(4);
        q.enqueue(5);
      
        try
        {
            for(int i=0;i<5;i++)
            {
            
            System.out.println(q.dequeue());
             //throw (new QueueExceptionFull());
            }
        }
       catch(QueueException e)
       {
           e.getMessage();
           System.out.println("oh man sorry...Queue is empty");
           
       }
}
}