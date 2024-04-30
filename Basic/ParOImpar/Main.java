package Basic.ParOImpar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(
                          new InputStreamReader(System.in));
    Integer number = Integer.parseInt(br.readLine().split(" ")[0]);
    if(number % 2 == 0){
        System.out.println("par");
    }
    else{
        System.out.println("impar");
    }
  }
}