import javax.swing.*;  
public class jframe 
{  
	JFrame f;  
	jframe()
	{  
      
		f=new JFrame();  
          
		JButton b=new JButton("click");  
		b.setBounds(30,100,100, 40);  
		
		JButton c=new JButton("click");  
		c.setBounds(130,100,100, 40);  
		
	       JButton d=new JButton("click");  
		d.setBounds(230,100,100, 40);  
		
		JButton e=new JButton("click");  
		e.setBounds(330,100,100, 40);
		
		/**JButton f=new JButton("click");  
		f.setBounds(30,150,100, 40);  
		
		JButton g=new JButton("click");  
		g.setBounds(170,140,100, 40);  
		
	       JButton h=new JButton("click");  
		h.setBounds(270,140,100, 40);  
		
		JButton i=new JButton("click");  
		i.setBounds(370,140,100, 40);    
          */
		f.add(b);
		f.add(c);  
		f.add(d); 
		f.add(e); 
		//f.add(f); 
		//f.add(g); 
		//f.add(h); 
		//f.add(i); 
		
          
		f.setSize(500,500);  
		f.setLayout(null);  
		f.setVisible(true);  
	}	  
  
public static void main(String[] args)
	 {  
	new jframe();  
	}  
}  
