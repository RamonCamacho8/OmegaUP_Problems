package Basic.RestaYMultiplicacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] numbers = s.nextLine().split(" ");

        System.out.println((Integer.parseInt(numbers[0])-Integer.parseInt(numbers[1]))*(Integer.parseInt(numbers[2]) - Integer.parseInt(numbers[3])));

        s.close();
    }
}
