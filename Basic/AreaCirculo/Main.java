package Basic.AreaCirculo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int r = s.nextInt();

        System.out.printf("%.2f", (Math.PI * Math.pow(r, 2)));

        s.close();
    }
}