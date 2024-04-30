package Basic.LeyendoVariosDatos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = Integer.parseInt(s.nextLine());

        for (int i = 0; i < size; i++) {
            String[] pair = s.nextLine().split(" ");
            System.out.println(Integer.parseInt(pair[0]) +  Integer.parseInt(pair[1]));
        }
        s.close();
    }
}
