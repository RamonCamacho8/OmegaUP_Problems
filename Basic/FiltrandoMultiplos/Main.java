package Basic.FiltrandoMultiplos;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = Integer.parseInt(s.nextLine());
        Integer[] seq = Arrays.stream(s.nextLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
        int k = Integer.parseInt(s.nextLine());

        for (int i = 0; i < n; i++) {
            if(seq[i] % k != 0)
                System.out.print("X ");
            else
                System.out.print(seq[i] + " ");
        }

        s.close();
    }
}