import java.awt.*;  
import javax.swing.*;  
  
public class MyCanvas extends Canvas{  
      JButton b;
    public void paint(Graphics g) {  
  
        Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage("pic/p3.gif");  
        g.drawImage(i, 120,100,this); 
        b=new JButton("click"); 
        b.setBounds(150,150,50,30);
          
    }  
        public static void main(String[] args) {  
        MyCanvas m=new MyCanvas();  
        JFrame f=new JFrame();  
        f.add(m);  
        
        f.setSize(400,400);  
        f.setVisible(true);  
    }  
  
}  
