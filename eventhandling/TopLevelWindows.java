package SwingSamples;
import javax.swing.*;
public class TopLevelWindows
{
public static void main(String args[])
{
JFrame myJFrame = new JFrame("The JFrame");
myJFrame.setSize(300,300);
myJFrame.setLocation(100,100);
JWindow myJWindow = new JWindow();
myJWindow.setSize(300,300);
myJWindow.setLocation(500, 100);
myJFrame.setVisible(true);
myJWindow.setVisible(true);
}
}
