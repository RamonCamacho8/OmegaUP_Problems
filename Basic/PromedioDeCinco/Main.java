package Basic.PromedioDeCinco;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Integer[] lectura = Arrays.stream(s.nextLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
        int suma = 0;
        for (int i = 0; i < lectura.length; i++) {
            suma += lectura[i];
        }
        System.out.printf("%.1f", ((float) suma / (float) lectura.length) );

        s.close();
    }
}