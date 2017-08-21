
import java.awt.event.*;  
import javax.swing.*;  
  
public class imagebutton
{  

	imagebutton()
	{  
	JFrame f=new JFrame();  
                  
          
	JButton b=new JButton(new ImageIcon("/home/nafi/Desktop/cut.jpg"));  
	
	b.setBounds(130,100,200,200);  
 
	f.add(b);  
          
           
	f.setSize(300,400);  
	f.setLayout(null);  
	f.setVisible(true);  
          
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
          
    }  
      
public static void main(String[] args)
	 {  
	    new imagebutton();  
	}  
}  
	
