/**
nAfi
date:21/12/15
*/



import java.awt.*;
public class begin extends Frame
	{
		public static void main(String args[])
		{
		begin b=new begin();
		//begin c=new begin();
		}
		begin()
		{
			Checkbox b=new Checkbox("Hit me");   //for mark
			//Button b=new Button("beat me");     //its a button
			//Label c=new Label("ya");      //write in box
			//Choice b=new Choice();   //required no arguments
			//List b=new List(50,false);
			
			b.setBounds(30,100,100,100);//(int xaxis,int yaxis,int width,int height)
			
			add(b);
			setSize(600,500);
			setLayout(null);
			setVisible(true);
			
		}
	}		
