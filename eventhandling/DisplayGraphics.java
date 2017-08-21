import java.awt.*;  
import javax.swing.*;  
  
public class DisplayGraphics extends Canvas     //here extends to canvas..there are several types
{  
      
    public void paint(Graphics g)     //should be
     {  
        g.drawString("Hello",40,40);     ///there are many inbuilt methods are there
        setBackground(Color.WHITE);  
        g.fillRect(130, 30,100, 80);  
        g.drawOval(30,130,50, 60);  
        setForeground(Color.RED);  
        g.fillOval(130,130,50, 60);  
        g.drawArc(30, 200, 40,50,90,60);  
        g.fillArc(30, 130, 40,50,180,40);  
        g.drawLine(30,50,100,100);
        g.drawString("This is nafi world",10,10);
          
    }  
        public static void main(String[] args)
         {  
        DisplayGraphics m=new DisplayGraphics();  
        JFrame f=new JFrame();  
        f.add(m);  
        f.setSize(400,400);  
        //f.setLayout(null);  
        f.setVisible(true);  
    }  
  
} 
/**
THESE ARE METHODS:
public abstract void drawString(String str, int x, int y):---> is used to draw the specified string.
public void drawRect(int x, int y, int width, int height):---> draws a rectangle with the specified width and height.
public abstract void fillRect(int x, int y, int width, int height):---> is used to fill rectangle with the default color and specified width and height.
public abstract void drawOval(int x, int y, int width, int height):---> is used to draw oval with the specified width and height.
public abstract void fillOval(int x, int y, int width, int height): --->is used to fill oval with the default color and specified width and height.
public abstract void drawLine(int x1, int y1, int x2, int y2): ---->is used to draw line between the points(x1, y1) and (x2, y2).
public abstract boolean drawImage(Image img, int x, int y, ImageObserver observer):--> is used draw the specified image.
public abstract void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle):---> is used draw a circular or elliptical arc.
public abstract void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle):---->is used to fill a circular or elliptical arc.
public abstract void setColor(Color c): --->is used to set the graphics current color to the specified color.
public abstract void setFont(Font font):---> is used to set the graphics current font to the specified font.
*/
