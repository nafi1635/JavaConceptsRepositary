/**import java.awt.event.*;
import javax.swing.*;

public ngame 
	{
	JButton b[]=new JButton[25];
	//JFrame f;
	
	int i,m=100,n=50;
	ngame()
	{
	
		//f=new JFrame();
		for(i=0;i<25;i++)
		{
			b[i]=new JButton("b"+i);
			b[i].setBounds(m,n,60,50);
			m=m+60;
			add(b[i]);
			if(m==400)
					n=n+50;
		
			
		}
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String args[])
	{
	new ngame();
	
	
	}
}	*/
import java.util.*;
import java.awt.*;  
import javax.swing.*;  
import java.awt.event.*;  
public class ngame extends JFrame implements ActionListener
{  

	
	
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,next;  
	JLabel l1;
	int j=50,k=50;
	int count=1;
	ngame(String n)
	{  
		
		
		super("My first game");  
		l1=new JLabel("--->WELCOME...Mr."+n+"....It Is Great to Meet you..."+"Plz find Cricketers here",JLabel.CENTER);
		
		l1.setSize(600,50);
		l1.setBackground(Color.blue);
 		b1=new JButton("1");     //creating buttons with strings
 		b2=new JButton("2");  
		 b3=new JButton("3");  
		 b4=new JButton("4");  
 		b5=new JButton("5");  
 		b6=new JButton("6");  
		 b7=new JButton("7");  
		 b8=new JButton("8");  
		 b9=new JButton("9");  
		 b10=new JButton("10"); 
		 b11=new JButton("11");  
		 b12=new JButton("12");  
		 a1=new JButton("13");  
		 a2=new JButton("14");  
		 a3=new JButton("15"); 
		 a4=new JButton("16");  
		 a5=new JButton("17");  
		 a6=new JButton("18");  
		 a7=new JButton("19");  
		 a8=new JButton("20"); 
		 a9=new JButton("21");  
		 a10=new JButton("22");  
		 a11=new JButton("23");  
		 a12=new JButton("24");  
		 c1=new JButton("25"); 
		 c2=new JButton("26");  
		 c3=new JButton("27");  
		 c4=new JButton("28");  
		 c5=new JButton("29");  
		 c6=new JButton("30"); 
		 c7=new JButton("31");  
		 c8=new JButton("32");  
		 c9=new JButton("33");  
		 c10=new JButton("34");  
		 c11=new JButton("35"); 
		 c12=new JButton("36"); 
		 next=new JButton("next"); 
		 
		  
  		
  		
		b1.setBounds(150,150,j,k);
		b2.setBounds(200,150,j,k);     //creating bounds for every button
		b3.setBounds(250,150,j,k); 
		b4.setBounds(300,150,j,k); 
		b5.setBounds(350,150,j,k); 
		b6.setBounds(400,150,j,k); 
		b7.setBounds(150,200,j,k);
		b8.setBounds(200,200,j,k);     
		b9.setBounds(250,200,j,k); 
		b10.setBounds(300,200,j,k); 
		b11.setBounds(350,200,j,k); 
		b12.setBounds(400,200,j,k);
		a1.setBounds(150,250,j,k);
		a2.setBounds(200,250,j,k);     
		a3.setBounds(250,250,j,k); 
		a4.setBounds(300,250,j,k); 
		a5.setBounds(350,250,j,k); 
		a6.setBounds(400,250,j,k);
		a7.setBounds(150,300,j,k);
		a8.setBounds(200,300,j,k);     
		a9.setBounds(250,300,j,k); 
		a10.setBounds(300,300,j,k); 
		a11.setBounds(350,300,j,k); 
		a12.setBounds(400,300,j,k);
		c1.setBounds(150,350,j,k);
		c2.setBounds(200,350,j,k);     
		c3.setBounds(250,350,j,k); 
		c4.setBounds(300,350,j,k); 
		c5.setBounds(350,350,j,k); 
		c6.setBounds(400,350,j,k);
		c7.setBounds(150,400,j,k);
		c8.setBounds(200,400,j,k);     
		c9.setBounds(250,400,j,k); 
		c10.setBounds(300,400,j,k); 
		c11.setBounds(350,400,j,k); 
		c12.setBounds(400,400,j,k);
		
		add(b1);   //adding buttons
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b10);  
		add(b11);
		add(b12);
		add(a1);   //adding buttons
		add(a2);
		add(a3);
		add(a4);
		add(a5);
		add(a6);
		add(a7);
		add(a8);
		add(a9);
		add(a10);  
		add(a11);
		add(a12);
		add(c1);   //adding buttons
		add(c2);
		add(c3);
		add(c4);
		add(c5);
		add(c6);
		add(c7);
		add(c8);
		add(c9);
		add(c10);  
		add(c11);
		add(c12);  
		add(next);
		add(l1);
		
		next.addActionListener(this); 
		c8.addActionListener(this); 
		c12.addActionListener(this); 
		a9.addActionListener(this); 
		b11.addActionListener(this); 
		b12.addActionListener(this);
		a1.addActionListener(this);
		a2.addActionListener(this);
		a3.addActionListener(this);
		a4.addActionListener(this);
		a5.addActionListener(this);
		a6.addActionListener(this);
		a7.addActionListener(this);
		a8.addActionListener(this);
		a10.addActionListener(this);
		a11.addActionListener(this);
		a12.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		c1.addActionListener(this);
		c2.addActionListener(this);
		c3.addActionListener(this);
		c4.addActionListener(this);
		c5.addActionListener(this);
		c6.addActionListener(this);
		c7.addActionListener(this);
		c9.addActionListener(this);
		c10.addActionListener(this);
		c11.addActionListener(this);
		next.setBounds(280,500,100,50);
		next.setBackground(Color.blue);    
		next.setForeground(Color.white);  
		setSize(600,600);  
		setLayout(null);  
		setVisible(true);  
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	}
	//end of constructor  

public void actionPerformed(ActionEvent e)
{  		
		
		if(count<6&&count>=1 )
		{
		if(e.getSource()==b1||e.getSource()==b2||e.getSource()==b3||e.getSource()==b4||e.getSource()==b5||e.getSource()==b6||e.getSource()==b7||e.getSource()==b8||e.getSource()==b9||e.getSource()==b10||e.getSource()==a1||e.getSource()==a2||e.getSource()==a3||e.getSource()==a4||e.getSource()==a5||e.getSource()==a6||e.getSource()==a7||e.getSource()==a8||e.getSource()==a10||e.getSource()==a11||e.getSource()==a12||e.getSource()==c1||e.getSource()==c2||e.getSource()==c3||e.getSource()==c4||e.getSource()==c5||e.getSource()==c6||e.getSource()==c7||e.getSource()==c9||e.getSource()==c10||e.getSource()==c11||e.getSource()==c8||e.getSource()==c12||e.getSource()==a9||e.getSource()==b11||e.getSource()==b12)
		{
		
		
		





		if(e.getSource()==next)
		{  	
					
	         	
       				  
        				
			JOptionPane.showMessageDialog(ngame.this,"yes thank you for using");  
			
                //end of actionPerformed 
                }
                if(e.getSource()==c8)
		{  
			JOptionPane.showMessageDialog(ngame.this,"Yes Boss...you find Virat kohli\n try next crickter");  
			
                }//end of actionPerformed  
               
               if(e.getSource()==c12)
		{  
			JOptionPane.showMessageDialog(ngame.this,"yes Boss..you find Ms Dhoni\n try..next");  
			
                }//end of actionPerformed  
               
               if(e.getSource()==a9)
		{  
			JOptionPane.showMessageDialog(ngame.this,"yes Boss ..you find Rohit sharma \n try next");  
			
                }//end of actionPerformed  
               
               if(e.getSource()==b11)
		{  
			JOptionPane.showMessageDialog(ngame.this,"yes Boss ..you find Shikhar dhawan \n try next");  
			
                }//end of actionPerformed  
                   if(e.getSource()==b12)
		{  
			JOptionPane.showMessageDialog(ngame.this,"yes Boss ..you find Rahane \n try next");  
			
                }//end of actionPerformed  
            
                if(e.getSource()==b1||e.getSource()==b2||e.getSource()==b3||e.getSource()==b4||e.getSource()==b5||e.getSource()==b6||e.getSource()==b7||e.getSource()==b8||e.getSource()==b9||e.getSource()==b10||e.getSource()==a1||e.getSource()==a2||e.getSource()==a3||e.getSource()==a4||e.getSource()==a5||e.getSource()==a6||e.getSource()==a7||e.getSource()==a8||e.getSource()==a10||e.getSource()==a11||e.getSource()==a12||e.getSource()==c1||e.getSource()==c2||e.getSource()==c3||e.getSource()==c4||e.getSource()==c5||e.getSource()==c6||e.getSource()==c7||e.getSource()==c9||e.getSource()==c10||e.getSource()==c11)
                
                {
                JOptionPane.showMessageDialog(ngame.this,"Try another");
                }
             
                
            
            
            
  	
                 
               
               
}
count++;
   
 	
 }
 	//counting choices
 	if(count==2)
				JOptionPane.showMessageDialog(ngame.this,"4 choices are left");
	if(count==3)
				JOptionPane.showMessageDialog(ngame.this,"3 choices are left");					
	if(count==4)
				JOptionPane.showMessageDialog(ngame.this,"2 choices are left");		 
 	 if(count==5)
				JOptionPane.showMessageDialog(ngame.this,"1 choices are left");	
	if(count==6)
				JOptionPane.showMessageDialog(ngame.this,"Your 5 choices are out..");	
							
 }
public static void main(String[] args)
{  

System.out.println("Enter your name");
Scanner s=new Scanner(System.in);
String name=s.next();
System.out.println("your name is   "+name);
new ngame(name);  


	
}//end of main  
  
}//
			
				
			
			
			
			
		
		
		 
