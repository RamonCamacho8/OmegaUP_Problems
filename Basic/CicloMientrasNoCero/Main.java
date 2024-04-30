package Basic.CicloMientrasNoCero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(
                          new InputStreamReader(System.in));
    // TODO: fixme.

    String[] numbers = br.readLine().split(" ");
    int sum = 0;

    for (int i = 0; i < numbers.length; i++) {
        int parsedString = Integer.parseInt(numbers[i]);
        if(parsedString == 0)
            break;
        sum += parsedString;
    }

    System.out.println(sum);


  }
}