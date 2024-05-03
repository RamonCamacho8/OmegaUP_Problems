package Basic.ProductoPunto;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Integer size = Integer.parseInt(s.nextLine());
        Integer[] vector_1 = Arrays.stream(s.nextLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
        Integer[] vector_2 = Arrays.stream(s.nextLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
        
        int accum = 0;

        for (int i = 0; i < size; i++) {
            accum += vector_1[i] * vector_2[i];
        }
        System.out.println(accum);


        s.close();
    }
}