package Basic.SistemasDeEcuacionesUnaSolucion;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Float[] abc_1 = Arrays.stream(s.nextLine().split(" ")).map(Float::parseFloat).toArray(Float[]::new);
        Float[] abc_2 = Arrays.stream(s.nextLine().split(" ")).map(Float::parseFloat).toArray(Float[]::new);
        float y = 1;
        float c1 = abc_1[2] - abc_1[1];
        
        float c2 = c1 / abc_1[0];
        float c3 = abc_2[0] * c2;
        float c4 = (c3 + abc_1[1]);

        y = abc_2[2] / c4;
        float x = (c1 * y / abc_1[0]);

        System.out.println(y + " " + x);


        s.close();
    }
}