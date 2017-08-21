/**
nAfi
date:21/12/15
*/


import java.awt.*;
public class framebyassociation
{
	public static void main(String args[])
	{
	framebyassociation f=new framebyassociation();
	
	
	}
	framebyassociation()
	{
	Frame f=new Frame("hi");
	Button b=new Button("button");
	f.add(b);
	f.setBounds(30,50,80,30);
	f.setSize(500,500);
	f.setLayout(null);
	f.setVisible(true);
	}
}	
	
