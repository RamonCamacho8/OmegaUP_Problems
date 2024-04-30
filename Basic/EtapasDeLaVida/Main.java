package Basic.EtapasDeLaVida;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        byte edad = s.nextByte();

        if(edad >= 65)
            System.out.println("ADULTO 3RA");
        else if (edad >= 19)
            System.out.println("ADULTO");
        else if (edad >= 15)
            System.out.println("JOVEN");
        else if (edad >= 4)
            System.out.println("NINO");
        else
            System.out.println("BEBE");

        s.close();
    }
}