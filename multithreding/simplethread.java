public class simplethread implements Runnable
{
        String thrdname;
        simplethread(String name)
        {
                thrdname=name;
        }
        public void run()
        {
                System.out.println(thrdname+"Staring");
                try
                {
                        for(int count=0;count<10;count++)
                        {
                                       
                                Thread.sleep(400);
                                System.out.println("in"+thrdname+",count is"+count);
                        }
                }
                catch(InterruptedException exc)
                {
                        System.out.println(thrdname+"interrupted");
                }
                System.out.println(thrdname+"terminating");
        }
 }       
        
