package Basic.ESTernaPitagorica;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Integer[] lectura = Arrays.stream(s.nextLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
        
        if((Math.pow(lectura[0], 2) + Math.pow(lectura[1], 2)) == Math.pow(lectura[2], 2))
            System.out.println("SI");
        else 
            System.out.println("NO");

        s.close();
    }
}