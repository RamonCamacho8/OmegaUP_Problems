package Basic.SumaDeLosDigitos;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Integer[] lectura = Arrays.stream(s.nextLine().split("")).map(Integer::parseInt).toArray(Integer[]::new);
        int accum = 0;
        for (int i = 0; i < lectura.length; i++) {
            accum += lectura[i];
        }

        System.out.println(accum);


        s.close();
    }
}