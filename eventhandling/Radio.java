import javax.swing.*;  
public class Radio
 {  
	JFrame f;  
  
Radio()
{  
	f=new JFrame();  
  
	JRadioButton r1=new JRadioButton("A) Facebook");  
	JRadioButton r2=new JRadioButton("B) Apple");  
	JRadioButton r3=new JRadioButton("C)google");  
	JRadioButton r4=new JRadioButton("D)MIcrosoft");  
	
	r1.setBounds(50,100,70,50);  
	r2.setBounds(50,150,70,50); 
	r3.setBounds(50,200,70,50); 
	r4.setBounds(50,250,70,50);  
  
	ButtonGroup bg=new ButtonGroup();  
	bg.add(r1);
	bg.add(r2);
	bg.add(r3);
	bg.add(r4);  
  
	f.add(r1);
	f.add(r2);
	f.add(r3);
	f.add(r4);  
  
	f.setSize(500,500);  
	f.setLayout(null);  
	f.setVisible(true);  
}  
public static void main(String[] args) 
	{  
	    new Radio();  
	}  
} 
