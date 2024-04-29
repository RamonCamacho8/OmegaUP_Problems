package Basic.TresNumerosAlReves;

//https://omegaup.com/arena/problem/Tres-Numeros-Al-Reves/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(
                          new InputStreamReader(System.in));
    String[] numbers = new String[3];
    for (int i = 0; i < numbers.length; i++) {
        numbers[i] = br.readLine();
    }
    for (int i = numbers.length - 1; i >= 0; i--) {
        System.out.println(numbers[i]);
    }
    
  }
}
