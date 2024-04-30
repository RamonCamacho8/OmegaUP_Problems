package Basic.BolitasDeQueso;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       
        int x = s.nextInt();
        System.out.println((3 * x + 2));

        s.close();
    }
}