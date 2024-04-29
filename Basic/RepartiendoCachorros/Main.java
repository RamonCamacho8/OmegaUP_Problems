package Basic.RepartiendoCachorros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(
                          new InputStreamReader(System.in));

    String[] arguments = br.readLine().split(" ");

    int puppies = Integer.parseInt(arguments[0]);
    int puppiesToKeep = Integer.parseInt(arguments[1]);
    int toSplit = 1 + Integer.parseInt(arguments[2]);
    int left = puppies - puppiesToKeep;

    puppiesToKeep += left % toSplit;
 
    System.out.println(puppiesToKeep);
        
  }
}
