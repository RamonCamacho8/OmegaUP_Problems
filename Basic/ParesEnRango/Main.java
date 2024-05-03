package Basic.ParesEnRango;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int inicio = s.nextInt();
        int fin = s.nextInt();
        
        for (int i = inicio; i <= fin; i++) {
            if(i%2 == 0)
                System.out.println(i);
        }


        s.close();
    }
}