package oct28;


/**
 * Write a description of interface IntQ here.
 * 
 * @smart nafi
 * 29/10/15
 */
public interface IntQ
{
    void enqueue(int n);// throws QueueExceptionFull;
    int dequeue() throws QueueException;
}
