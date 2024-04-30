package Basic.BolsasDeDulces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(
                          new InputStreamReader(System.in));
    // TODO: fixme.
    int sales = Integer.parseInt(br.readLine().split(" ")[0]);
    int total = 0;
    for (int i = 0; i < sales; i++) {
        String[] read = br.readLine().split(" ");
        total += (Integer.parseInt(read[0]) * Integer.parseInt(read[1]));
    }
    System.out.println(total);
  }
}
