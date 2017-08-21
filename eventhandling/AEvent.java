import java.awt.*;
import java.awt.event.*;
public class AEvent extends Frame implements ActionListener
{
	TextField tf;
	AEvent()
	{
		tf=new TextField();
		tf.setBounds(60,50,170,50);
		
		Button b=new Button("HIt me");
		b.setBounds(100,120,80,30);
		
		b.addActionListener(this);
		add(b);
		add(tf);
		
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
	tf.setText("Hi buddys");
	}
	public static void main(String args[])
	{
	new AEvent();
	}
}	
		
