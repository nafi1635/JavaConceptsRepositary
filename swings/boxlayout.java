/**The BoxLayout is used to arrange the components either vertically or horizontally. 
public static final int X_AXIS
public static final int Y_AXIS
public static final int LINE_AXIS
public static final int PAGE_AXIS
BoxLayout(Container c, int axis): creates a box layout that arranges the components with the given axis.*/
import java.awt.*;  
import javax.swing.*;  
  
public class boxlayout extends Frame
 {  
   Button buttons[];  
   public boxlayout() 
   {  
   buttons = new Button [5];  
    for (int i = 0;i<5;i++) 
    {  
      buttons[i] = new Button ("Button " + (i + 1));  
      add (buttons[i]);  
    }  
                setLayout (new BoxLayout( this, BoxLayout.Y_AXIS));  //there exsist two axis.... we can put X_AXIS also
                setSize(400,400);  
                setVisible(true);  
}  
  
public static void main(String args[])
        {  
                boxlayout b=new boxlayout();  
        }  
}  

