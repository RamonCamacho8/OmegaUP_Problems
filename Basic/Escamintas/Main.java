package Basic.Escamintas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int temp = s.nextInt();

        if(temp > 34){
            System.out.println("caliente!");
            System.out.println("RIP escamitas :(");
        }
        else if(temp > 29)
            System.out.println("caliente!");
        else if(temp >= 21)
            System.out.println("tibia");
        else if(temp >= 15)
            System.out.println("fria!");
        else{
            System.out.println("fria!");
            System.out.println("RIP escamitas :(");
        }

        s.close();
    }
}