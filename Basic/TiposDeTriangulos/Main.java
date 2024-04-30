package Basic.TiposDeTriangulos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] numbers = s.nextLine().split(" ");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        int c = Integer.parseInt(numbers[2]);
        if( (a == b) && (a == c) )
            System.out.println("equilatero");
        else if ( (a == b) || (a == c) || (c == b) )
            System.out.println("isosceles");
        else
            System.out.println("escaleno");

        s.close();
    }
}
