public class usethreads
{
        public static void main(String args[]) 
        {
                System.out.println("Main thread starting.");
                simplethread mt = new simplethread("Child #1");
                Thread newThrd = new Thread(mt);       
                newThrd.start();
                //newthrd.getPriority();
                    for(int i=0; i<50; i++) 
                        {
                        System.out.print(".");
                                try 
                                {
                                Thread.sleep(100);
                                }
                                catch(InterruptedException exc)
                                 {
                                System.out.println("Main thread interrupted.");
                                }
                        }
                System.out.println("Main thread ending.");
            }
}
