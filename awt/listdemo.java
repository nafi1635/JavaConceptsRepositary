import java.awt.*;
import java.applet.*;
public class listdemo extends Frame
{
 	
	public listdemo(String str)
	{
	super(str);
	setLayout(new FlowLayout());
	List os=new List(4,true);
	List browser=new List(3,false);
	os.addItem("Win 95");
	os.addItem("linux");
	os.addItem("unix");
	os.addItem("macintosh");
	browser.addItem("Firefox");
	browser.addItem("netscape");
	browser.addItem("hot java");
	add(os);
	add(browser);
	
	}
	
	
	public static void main(String args[])
	{
	listdemo lb=new listdemo("my first demo");
	lb.setSize(600,600);
	lb.setVisible(true);
	
	
	
	}
}	
