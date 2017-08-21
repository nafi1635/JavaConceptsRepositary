/**
nAfi
date:26/12/15
*/
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class pachis extends JFrame implements ActionListener
{
	JFrame f;
	JButton b[]=new JButton[24];
	JButton c[]=new JButton[24];
	JButton d[]=new JButton[24];
	JButton e[]=new JButton[24];
	JButton home,dice1,dice2;
	int x=115,y=355,k,l,i,j,u=355,v=115,m=445,n=355,p=355,q=445;
	int dic1,dic2,a1;
	pachis()
	{
		/**a=new JButton("a");
		b=new JButton("b");
		c=new JButton("c");
		d=new JButton("d");
		e=new JButton("e");
		f=new JButton("f");
		g=new JButton("g");
		h=new JButton("h");
		i=new JButton("i");
		j=new JButton("j");
		k=new JButton("k");
		l=new JButton("l");
		m=new JButton("m");
		n=new JButton("n");
		o=new JButton("o");
		p=new JButton("p");
		q=new JButton("q");
		r=new JButton("r");
		s=new JButton("s");
		t=new JButton("t");
		u=new JButton("u");
		v=new JButton("v");
		w=new JButton("w");
		x=new JButton("x");*/
		f=new JFrame();
		for(k=0;k<24;k++)
		{
			b[k]=new JButton("");
			b[k].setBounds(x,y,30,30);
			x=x+30;
			f.add(b[k]);
			b[k].addActionListener(this);
			if(x==355)
			{
				y=y+30;
				x=115;
			}
		}	
		for(l=0;l<24;l++)
		{
			d[l]=new JButton("");
			d[l].setBounds(u,v,30,30);
			v=v+30;
			f.add(d[l]);
			d[l].addActionListener(this);
			if(v==355)
			{
				u=u+30;
				v=115;
			}
		}
		for(i=0;i<24;i++)
		{
			c[i]=new JButton("");
			c[i].setBounds(m,n,30,30);
			m=m+30;
			c[i].addActionListener(this);
			f.add(c[i]);
			
			if(m==685)
			{
				n=n+30;
				m=445;
			}
		}
		for(j=0;j<24;j++)
		{
			e[j]=new JButton("");
			e[j].setBounds(p,q,30,30);
			q=q+30;
			f.add(e[j]);
			e[j].addActionListener(this);
			if(q==685)
			{
				p=p+30;
				q=445;
			}
		}
		home=new JButton("Home");
		home.setBounds(355,355,90,90);
		home.addActionListener(this);
		dice1=new JButton("Player1");
		dice1.setBounds(50,555,100,40);
		dice1.setBackground(Color.blue);
		f.add(dice1);
		dice1.addActionListener(this);
		dice2=new JButton("Player1");
		dice2.setBounds(650,555,100,50);
		dice2.setBackground(Color.blue);
		f.add(dice2);
		dice2.addActionListener(this);
		f.add(home);
		f.setSize(800,800);
		f.setLayout(null);
		f.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==dice1)
		{
			
               		  dic1=(int) (Math.random()*4);
               		  JOptionPane.showMessageDialog(pachis.this,"Dice number is"+dic1);
               		//dic1=a1;
               		
               		if(dic1==0);
               		{
               			b[16].setText("*");
               			
               		}	
               		if(dic1==1);
               		{
               			b[17].setText("*");
               			
               		}
               		if(dic1==2)
               		{
               			b[18].setText("*");
               		}	
               		if(dic1==3)
               		{
               			b[19].setText("*");
               		}	
               	}	
               		
               		
               			
               	  
			
		if(e.getSource()==home)
			{
			JOptionPane.showMessageDialog(pachis.this,"YA...you are in the home");
			}
	}		
public static void main(String args[])
	{
		new pachis();
	}
}
		
