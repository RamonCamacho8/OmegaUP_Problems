package Basic.DetectandoElOrden;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Byte[] entrada = Arrays.stream(s.nextLine().split(" ")).map(Byte::parseByte).toArray(Byte[]::new);
        
        if(entrada[0] == entrada[1] && entrada[1] == entrada[2]){
            System.out.println("I");
        }
        else{
            Boolean creciente = true;
            Boolean decreciente = true;
            for (int i = 0; i < entrada.length - 1; i++) {
                if(entrada[i] == entrada[i+1]){
                    continue;
                }
                if(entrada[i] > entrada[i+1]){
                    creciente = false;
                } else 
                    decreciente = false;
            }

            System.out.println( creciente ? "C" : decreciente ? "D" : "X" );
        }
            

        s.close();
    }
}