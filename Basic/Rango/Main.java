package Basic.Rango;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Integer[] lectura = Arrays.stream(s.nextLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);

        for (int i = lectura[0]; i <= lectura[1] ; i++) {
            
            System.out.print(i + " ");
        }

        s.close();
    }
}