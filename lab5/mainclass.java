package lab5;


/**
 * Write a description of class lines here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class lines{ public void move(){ System.out.println("i can move");}}
class nafi extends lines{ public void move(){System.out.println("my legs also can move");}}
public class mainclass{ public static void main(String args[]) {  lines l=new lines();   
    nafi b=new nafi();     l.move();       b.move();   }}
       
    
       
    
   
