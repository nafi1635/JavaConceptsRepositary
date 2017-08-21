import java.awt.*;
import java.applet.*;
public class scrollbar extends Frame
{
	Scrollbar vertsb,horzsb;
	String msg="";
	scrollbar()
		{
			setLayout(new FlowLayout());
			int width=100;
			int height=7000;
			vertsb=new Scrollbar(Scrollbar.VERTICAL,0,1,0,100);
			horzsb=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,100);
			add(vertsb);
			add(horzsb);
		}
public static void main(String a[])
		{
			scrollbar sb=new scrollbar();
			sb.setVisible(true);
			sb.setSize(500,600);
		}
}
