package Basic.Comparaciones;

import java.util.Scanner;

public class Main {
  public static void main(String[] args)  {

    Scanner s = new Scanner(System.in);
    int first = s.nextInt();
    int second = s.nextInt();

    if (first == second) {
        System.out.println("iguales");
    } else if (first < second) {
        System.out.println("menor");
    } else {
        System.out.println("mayor");
    }

    s.close();
  }
}
