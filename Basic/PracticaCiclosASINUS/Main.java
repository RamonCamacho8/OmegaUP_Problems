package Basic.PracticaCiclosASINUS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int accum = 0;
        int input = Integer.parseInt(s.nextLine());
        s.nextLine();
        for (int i = 0; i < input; i++) {
            int temp = Integer.parseInt(s.nextLine());
            accum+=temp;

        }

        System.out.println(accum);
        

        s.close();
    }
}