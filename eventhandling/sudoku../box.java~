import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class box extends JFrame implements ActionListener
{
	JFrame f;
	JButton b[]=new JButton[36];
	JButton butt[]=new JButton[6];
	JButton dice1,dice2;
	JButton close;
	int r;
	int i,j,x=100,y=100,sum=0;
	Scanner s=new Scanner(System.in);
	box()
	{
		f=new JFrame();
		for(i=0;i<36;i++)
		{
			b[i]=new JButton();
			b[i].setBounds(x,y,80,80);
			x=x+80;
			f.add(b[i]);
			b[i].addActionListener(this);
			b[i].setBackground(Color.white);
			if(x==580)
			{
				y=y+80;
				x=100;
			}
		}
		dice1=new JButton("roll1");
		dice1.setBounds(650,100,100,60);
		dice2=new JButton("roll2");
		dice2.setBounds(650,180,100,60);
		dice1.setBackground(Color.blue);
		dice1.setForeground(Color.green);
		dice2.setBackground(Color.blue);
		dice2.setForeground(Color.green);
		dice1.addActionListener(this);
		dice2.addActionListener(this);
		close= new JButton("Close");
		f.add(close);
		close.setBounds(580,640,100,50);
		close.addActionListener(this);
		f.add(dice1);
		f.add(dice2);
		f.setSize(800,800);
		f.setLayout(null);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{	
			
			if(e.getSource()==dice1)
			{	
				
				r=(int)(Math.random()*4+1);
				JOptionPane.showMessageDialog(box.this,"number is "+r);
				b[sum].setText(" ");
				sum=sum+r;
				b[sum].setText("*");
				if(b[35]==*)
				{
				JOptionPane.showMessageDialog(box.this,"you won");
				}
				
			}
			if(e.getSource()==close)
			{
				JOptionPane.showMessageDialog(box.this,"bi bi meet u again");
				System.exit(0);
			}	
	}
	
	public static void main(String args[])
	{
		new box();
	}	
}	
				
			
			
			
			
			
	
