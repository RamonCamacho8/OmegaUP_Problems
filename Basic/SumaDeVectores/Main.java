package Basic.SumaDeVectores;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        byte size = s.nextByte();
        s.nextLine();

        Integer[] vector_1 = Arrays.stream(s.nextLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
        Integer[] vector_2 = Arrays.stream(s.nextLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
        
        for (int i = 0; i < size; i++) {
            if(i < size - 1 )
                System.out.print( (vector_1[i] + vector_2[i]) +" ");
            else
                System.out.println((vector_1[i] + vector_2[i]));
        }

        s.close();
    }
}