package Basic.Promedio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(
                          new InputStreamReader(System.in));
    // TODO: fixme.
    int length = Integer.parseInt(br.readLine().split(" ")[0]);
    String[] numbers = br.readLine().split(" ");

    int sum = 0;
    for (int i = 0; i < length; i++) {
        sum += Integer.parseInt(numbers[i]);
    }
    float prom = (float)sum / length;
    System.out.printf("%.2f", prom);

  }
}