import java.awt.Color;  
import javax.swing.*;  
  
public class TArea 
{  
    JTextArea area;  
    JFrame f;  
    TArea()
    {  
    	f=new JFrame();  
          
    	area=new JTextArea("This is super",300,300);  //it creates some text area of this bounds
    	area.setBounds(10,30,300,300);  
      
    	area.setBackground(Color.black);  //background color is black
    	area.setForeground(Color.blue);  //text color is blue
          
    	f.add(area);  
      
    	f.setSize(400,400);  
    	f.setLayout(null);  
    	f.setVisible(true);  
	}  
    public static void main(String[] args)
     {  
        new TArea();  
    }  
}  
