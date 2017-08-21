import java.awt.event.*;
import javax.swing.*;

public mine extends JFrame
	{
	JButton b[]=new JButton[25];
	//JFrame f;
	
	int i,m=100,n=50;
	mine()
	{
	
		//f=new JFrame();
		for(i=0;i<25;i++)
		{
			b[i]=new JButton("b"+i);
			b[i].setBounds(m,n,60,50);
			m=m+60;
			add(b[i]);
			if(m==400)
			{
				n=n+50;
			}
			
		}
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String args[])
	{
	new mine();
	
	
	}
}	
			
				
			
			
			
			
		
		
		 
