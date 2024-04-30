package Basic.SelectivasAprobadoReprobado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        byte cal = s.nextByte();

        System.out.println(cal > 5 ? "APROBATORIA" : "REPROBATORIA");
        

        s.close();
    }
}