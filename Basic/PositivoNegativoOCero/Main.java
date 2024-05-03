package Basic.PositivoNegativoOCero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int i = s.nextInt();
        System.out.println("Salida");
        if(i > 0 )
            System.out.println("POSITIVO");
        else if( i < 0 )
            System.out.println("NEGATIVO");
        else
            System.out.println("CERO");
        

        s.close();
    }
}