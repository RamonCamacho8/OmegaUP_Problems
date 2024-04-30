package Basic.LaBandaRobaTamales;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        String[] read = s.nextLine().split(" ");
        int tamales = Integer.parseInt(read[0]);
        int miembros = Integer.parseInt(read[1]) - 1;

        int restantes = tamales % 2;
        int patron = restantes;

        tamales -= restantes;
        patron += tamales/2;
        tamales -= tamales/2;
        restantes =  tamales % miembros;
        patron += restantes;

        System.out.println(patron);

        s.close();

    }
}
