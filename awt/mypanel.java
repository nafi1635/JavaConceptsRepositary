

/**
nAfi
date:21/12/15
*/

import java.awt.*;
public class mypanel extends Frame
{
	mypanel(String str)
	{
		super(str);
	}
	public static void main(String args[])
	{
	mypanel fr=new mypanel("Firse Panel");
	//Panel p=new Panel();
	
	fr.setSize(400,400);
	fr.setBackground(Color.green);
	Label l=new Label("enter some value",Label.RIGHT);
	
	//String getText();
	//fr.setLayout(null);
	//p.setSize(200,200);
	//p.setBackground(Color.blue);
	//p.setVisible(true);
	//fr.add(l);
	Button b=new Button("YES");
	Button c=new Button("NO");
	
	fr.setLayout(new FlowLayout());
	CheckboxGroup cbg=new CheckboxGroup();      //this is for radio buttons
	
	Checkbox cb1=new Checkbox("windows 95",cbg,true);
       Checkbox cb2=new Checkbox("unix",cbg,false);
       Checkbox cb3=new Checkbox("solaris",cbg,false);
	Checkbox cb4=new Checkbox("Macintosh",cbg,false);
	fr.add(cb1);
	fr.add(cb2);
	fr.add(cb3);
	fr.add(cb4);
	fr.add(b);
	fr.add(c);
	
	
	
	fr.setVisible(true);
	
	}	
}	
