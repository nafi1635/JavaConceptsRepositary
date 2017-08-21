

import java.util.*;
import java.io.*;
 
class runtime
 {
  public static void main(String[] args) {
    Runtime rs = Runtime.getRuntime();
 
    try {
      rs.exec("vlc");
    }
    catch (IOException e) {
      System.out.println(e);
    }   
  }
}