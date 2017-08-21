class Racer implements Runnable
{
	public static String winner;
	public void race()
	{
		for(int distance=1;distance<=100;distance++)
		{
		System.out println("Distance covered by"+(Thread.currentThread().getName())+"is:"+distance);
		boolean isRacewon=this.isRacewon(distance);
		if(isRacewon)
			{
				break;
			}
	}
}	


private boolean isRacewon(int totaldistancecovered)
	{
	boolean isRacewon=false;
	    if((Racer.winner==null)&&(totaldistancecovered==100))
	      {
			String winnerName=Thread.currentThread().getName();
			Racer.winner=winnerName;
			System.out.println("winner is"+Racer.winner);
			isRacewon=true;
		}
		else if(Racer.winner==null)
			{
			isRacewon=false;
			}
		else if(Race.winner!=null)
			{
			isRacewon=true;
			}
	
	return isRacewon;
	}
	
public void run()
{
this.race();
}
}							
		 

