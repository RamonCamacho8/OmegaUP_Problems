package Basic.Reverso;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        short size = s.nextShort();
        s.nextLine();
        String[] numbers = s.nextLine().split(" ");
        String newString = "";

        for (int i = size - 1; i >= 0; i--) {
            if(i == 0)
                newString += numbers[i];
            else
            newString += numbers[i] + " ";
        }

        System.out.print(newString);

        s.close();
    }
}