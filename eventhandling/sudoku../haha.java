import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class haha extends JFrame implements ActionListener
{
	TextField tf;
	tf=new TextField();
	tf.setBounds(10,20,100,10);
	JFrame f;
	JButton b[]=new JButton[36];
	JButton butt[]=new JButton[6];
	JButton a1,a2,a3,a4,a5,a6;
	
	JButton close;
	int i,j,x=100,y=100;
	Scanner s=new Scanner(System.in);
	haha()
	{
		f=new JFrame();
		for(i=0;i<36;i++)
		{
			b[i]=new JButton();
			b[i].setBounds(x,y,80,80);
			x=x+80;
			f.add(b[i]);
			b[i].addActionListener(this);
			if(x==580)
			{
				y=y+80;
				x=100;
			}
		}
		a1=new JButton("1");
		a1.setBounds(650,100,60,60);
		a2=new JButton("2");
		a2.setBounds(650,180,60,60);
		a3=new JButton("3");
		a3.setBounds(650,260,60,60);
		a4=new JButton("4");
		a4.setBounds(650,340,60,60);
		a5=new JButton("5");
		a5.setBounds(650,420,60,60);
		a6=new JButton("6");
		a6.setBounds(650,500,60,60);
		a1.setBackground(Color.blue);
		a1.setForeground(Color.green);
		a2.setBackground(Color.blue);
		a2.setForeground(Color.green);
		a3.setBackground(Color.blue);
		a3.setForeground(Color.green);
		a4.setBackground(Color.blue);
		a4.setForeground(Color.green);
		a5.setBackground(Color.blue);
		a5.setForeground(Color.green);
		a6.setBackground(Color.blue);
		a6.setForeground(Color.green);
		a1.addActionListener(this);
		a2.addActionListener(this);
		a3.addActionListener(this);
		a4.addActionListener(this);
		a5.addActionListener(this);
		a6.addActionListener(this);
		close= new JButton("Close");
		f.add(close);
		close.setBounds(580,640,100,50);
		close.addActionListener(this);
		f.add(tf);
		f.add(a1);
		f.add(a2);
		f.add(a3);
		f.add(a4);
		f.add(a5);
		f.add(a6);
		f.setSize(800,800);
		f.setLayout(null);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getsource()==a1)
		{
		
		}
		
		if(e.getSource()==close)
			{
				JOptionPane.showMessageDialog(haha.this,"bi bi meet u again");
				System.exit(0);
			}	
	}
	
	public static void main(String args[])
	{
		new haha();
	}	
}	
				
			
			
			
			
			
	
