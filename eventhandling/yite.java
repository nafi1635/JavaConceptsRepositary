/**import java.awt.*;
import java.awt.event.*;
import javaz.swing.*;
public class yite extends JFrame implements ActionListener
{
	int x=10,y=10,i,j;
	JButton b[]=new JButton[11];
	
public void showbutton()
{
for(i=0;i<=8;i++,x+=100,j++)
	{  
 		b[i]=new JButton();  
		if(j==3)  
			{
			j=0;
			y+=100;
			x=10;
			}  
 	b[i].setBounds(x,y,100,100);  
	add(b[i]);  
	b[i].addActionListener(this);  
	} 
} 
yite()
{	
	super("just fOr me");
	b[9]=new JButton("Play");
	b[10]=new JButton("Exit");
	b[9].setBounds(120,80,100,40);  
	b[10].setBounds(120,150,100,40);  
	add(b[9]);
	 add(b[10]);  
	b[9].addActionListener(this);  
	b[10].addActionListener(this);  
	setLayout(null);  
	setSize(330,450);  
	setVisible(true);  
	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	 
}
public void ActionPerformed(ActionEvent e)
  	{
  		if(e.getSource()==b[9])
  			{
  				showbutton();
  			}
  		if(e.getSource()==b[10])
  			{
  			System.exit(0);
  			}
  	}
  public static void main(String args[])
  {
  new yite();
  }	
 } 		*/
 	import java.awt.*;
import java.awt.event.*;
import javaz.swing.*;
public class yite extends JFrame implements ActionListener
{
		JButton b[]=new JButton[64];
		
		
	

