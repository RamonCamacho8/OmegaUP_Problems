package Basic.AContarLapices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(
                          new InputStreamReader(System.in));
    // TODO: fixme.
    String read = br.readLine();
    int quantity = Integer.parseInt( read.split(" ")[0]);
    int toFind = Integer.parseInt( read.split(" ")[1]);
    int count = 0;
    for (int i = 0; i < quantity; i++) {
        int number = Integer.parseInt(br.readLine().split(" ")[0]);
        if(number == toFind)
            count++;
    }

    System.out.println(count);
    
    
  }
}