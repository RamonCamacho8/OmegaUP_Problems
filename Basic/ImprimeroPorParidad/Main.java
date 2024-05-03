package Basic.ImprimeroPorParidad;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        byte n = Byte.parseByte(s.nextLine());
        Integer[] lectura = Arrays.stream(s.nextLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
        Boolean p = s.nextInt() == 0 ? true : false;

        for (int i = 0; i < n; i++) {
            
            if( (lectura[i] % 2 == 0) == p)
                System.out.println( lectura[i] );

        
        }

        s.close();
    }
}