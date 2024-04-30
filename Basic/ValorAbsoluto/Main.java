package Basic.ValorAbsoluto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] numbers = s.nextLine().split(" ");
        int m = Integer.parseInt(numbers[0]);
        int n = Integer.parseInt(numbers[1]);

        System.out.println( Math.abs( m + n) );

        s.close();
    }
}