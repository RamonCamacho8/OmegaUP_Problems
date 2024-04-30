package Basic.AmasB;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] string = s.nextLine().split(" ");

        int a = Integer.parseInt(string[0]);
        int b = Integer.parseInt(string[1]);

        System.out.println(a + b);


        s.close();
    }
}
