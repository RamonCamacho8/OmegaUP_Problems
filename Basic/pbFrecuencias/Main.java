package Basic.pbFrecuencias;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        byte p = s.nextByte();
        short n = s.nextShort();
        short[] counts = new short[p];

        for (short i = 0; i < n; i++) {
            byte input = s.nextByte();
            counts[ input - 1 ] = (short)(counts[ input - 1 ] + 1);
        }

        s.close();
    }

}