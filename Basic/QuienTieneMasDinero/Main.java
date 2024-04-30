package Basic.QuienTieneMasDinero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int juan = 0;
        int pedro = 0;

        for (int i = 0; i < 3; i++) {
            
            int moneda = s.nextInt();
            juan+=moneda;
        }
        for (int i = 0; i < 2; i++) {
            
            int moneda = s.nextInt();
            pedro+=moneda;
        }

        if(pedro>juan)
            System.out.println("Pedro");
        else
            System.out.println("Juan");

        s.close();
    }
}
