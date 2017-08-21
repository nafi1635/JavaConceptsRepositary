class morethreads
{
        public static void main(String args[])
        {
                System.out.println("Main thread starting.");
                Mythread mt1 = new Mythread("nafi");
                Mythread mt2 = new Mythread("Bhagavan");
                Mythread mt3 = new Mythread("nilesh");
                    for(int i=0; i < 50; i++) 
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
