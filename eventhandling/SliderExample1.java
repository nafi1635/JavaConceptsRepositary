import javax.swing.*;  
  
public class SliderExample1 extends JFrame
{  
  
public SliderExample1()
 {  
	JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 20);   //JSlider(orientation,min,max,where to start)
	slider.setMinorTickSpacing(1);
	slider.setMajorTickSpacing(5);
	
	
	slider.setPaintTicks(true);  
	slider.setPaintLabels(true); 
	
	JPanel panel=new JPanel();  //should be in slider
	panel.add(slider);  
  
	add(panel);  
}  
  
public static void main(String s[])
 	{  
	SliderExample1 frame=new SliderExample1();  
	frame.pack();     //if it not there panel is very small...pack means total length is will be there
	frame.setVisible(true);  
	}	  
}  
