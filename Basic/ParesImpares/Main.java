package Basic.ParesImpares;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        int cantidad = Integer.parseInt(s.nextLine());
        String[] numeros = s.nextLine().split(" ");
        int parCount = 0;
        for (int i = 0; i < cantidad; i++) {
            if(Integer.parseInt(numeros[i]) % 2 == 0)
                parCount++;
        }

        System.out.println(parCount + " " + (cantidad - parCount));

        s.close();

        
    }
}
