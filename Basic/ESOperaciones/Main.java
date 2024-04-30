package Basic.ESOperaciones;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] chain = s.nextLine().split(" ");
        Integer a = Integer.parseInt(chain[0]); 
        Integer b = Integer.parseInt(chain[1]); 

        System.out.println((a + b) + " " + (a - b) + " " + (a / b) + " " +(a * b) + " " +(a % b));
        
        s.close();
    }
}