
/**
nAfi
date:21/12/15
*/

import java.awt.*;
public class myframe extends Frame
{
	myframe(String str)
		{
		super(str);
		}
	public static void main(String args[])
	{
	myframe fr=new myframe("My First Simple Frame");
	fr.setSize(400,400);
	fr.setBackground(Color.blue);
	fr.setVisible(true);
	
	}
}	
		
