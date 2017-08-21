

import java.util.*;
 
class random
 {
  public static void main(String[] args) {
    int c;
    Random t = new Random();
 
    // random integers in [0, 100]
 
    for (c = 1; c <= 101; c++) {
      System.out.println(t.nextInt(100));
    }
  }
}