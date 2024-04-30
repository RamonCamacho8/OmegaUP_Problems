package Basic.AconB;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] chain = s.nextLine().split(" ");
        byte a = Byte.parseByte(chain[0]); 
        byte b = Byte.parseByte(chain[1]); 

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.print(a % b);
        
        s.close();
    }
}