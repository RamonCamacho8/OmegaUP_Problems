package Basic.AreaRectangulo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(
                          new InputStreamReader(System.in));
    // TODO: fixme.
    String[] numbers = br.readLine().split(" ");
    int area = Integer.parseInt(numbers[0]) * Integer.parseInt(numbers[1]);
    System.out.println(area);

  }
}