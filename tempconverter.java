

import java.util.Scanner;
 
public class tempconverter
  {
  public static void main(String[] args)
  {
    float temperature;
    float celsius;
    Scanner in = new Scanner(System.in);      
   System.out.println("Enter temperature in Fahrenheit");
   temperature = in.nextInt();
   System.out.println("enter temparature in celsius");  //T = 9*T/5 + 32
    
    celsius=in.nextFloat();
     System.out.println("Temperature in celsius"+temp.temp(temperature));
     System.out.println("temparature in fahrenhiets"+temp2.temp2(celsius));
     
//classname.functionname(value)
     
  }
}
