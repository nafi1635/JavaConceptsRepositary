
/**
 * INHERTANCE
 * we talked about super classes and sub classes. 
 * If a class inherits a method from its super class, then there is a chance to override the method provided that it is not marked final.

The benefit of overriding is: ability to define a behaviour that's specific to the subclass type which means a subclass can implement a parent class method based on its requirement.
 * 
 * @nafi
 * @6/11/15
 */
public class testoverriding
{
 
   public static void main(String args[]){
      methodoverriding a = new methodoverriding(); // Animal reference and object
      methodoverriding1 b = new methodoverriding1(); // Animal reference but Dog object

      a.move();// runs the method in Animal class

      b.move();//Runs the method in Dog class
   }
}