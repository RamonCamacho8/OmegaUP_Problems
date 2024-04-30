package Basic.CalculosMentalesCompetitivos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(
                          new InputStreamReader(System.in));
    // TODO: fixme.
    double real = Double.parseDouble(br.readLine().split(" ")[0]);
    double[] results = new double[4];
    results[0] = real + 5;
    results[1] = results[0] * results[0];
    results[2] = results[1] / (real / 3);
    results[3] = Math.pow(results[2], 3);

    for (int i = 0; i < results.length; i++) {
        System.out.println(results[i]);
        if(i < results.length - 1)
            System.out.print(" ");
    }
  }
}
