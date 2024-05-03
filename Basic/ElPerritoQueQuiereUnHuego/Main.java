package Basic.ElPerritoQueQuiereUnHuego;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        byte o_1 = s.nextByte();
        byte t_1 = s.nextByte();
        s.nextLine();
        byte o_2 = s.nextByte();
        byte t_2 = s.nextByte();
        System.out.println();

        if((o_1 > o_2) && (t_1 > t_2))
            System.out.println("Hueso 1");
        else if ((o_1 < o_2) && (t_1 < t_2))
            System.out.println("Hueso 2");
        else
            System.out.println("Perrito confundido :(");
        

        s.close();
    }
}