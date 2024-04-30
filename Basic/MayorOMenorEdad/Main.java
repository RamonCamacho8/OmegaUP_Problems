package Basic.MayorOMenorEdad;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);


        int edad = s.nextInt();

        if(edad >= 18)
            System.out.println("Es Mayor");
        else
            System.out.println("Es Menor");

        s.close();
    }
}
