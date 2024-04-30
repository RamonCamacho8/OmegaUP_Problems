package Basic.FormulasRaras;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(
                          new InputStreamReader(System.in));
    // TODO: fixme.
    String[] chain = br.readLine().split(" ");
    float x = Float.parseFloat(chain[0]);
    float y = Float.parseFloat(chain[1]);
    float z = Float.parseFloat(chain[2]);

    double result = (x+x*(y + z * z))/((x + Math.PI)*(y + Math.PI));
    System.out.println(result);

  }
}
