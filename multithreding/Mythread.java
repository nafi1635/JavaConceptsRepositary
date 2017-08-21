public class Mythread implements Runnable
{
        Thread thrd;
        Mythread(String name)
        {
                thrd=new Thread(this,name);
                thrd.start();
        }
        public void run()
        {
                System.out.println(thrd.getName()+"Starting.");
                try
                {
                        for(int count=0;count<10;count++)
                        {
                                Thread.sleep(400);
                                System.out.println("In"+thrd.getName()+",count is"+count);
                        }
                 }       
               catch(InterruptedException exc) 
               {
                        System.out.println(thrd.getName() + " interrupted.");
                }
                 System.out.println(thrd.getName() + " terminating.");
                }
   }
