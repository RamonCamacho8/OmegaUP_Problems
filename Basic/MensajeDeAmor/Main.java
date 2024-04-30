package Basic.MensajeDeAmor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int m = scanner.nextInt();
        int[] array = new int[m];
        for (int i = 0; i < m; i++) {
            int n = scanner.nextInt();
            array[i] = n;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i]; j++) {
                System.out.print("<3");
            }
            System.out.println();
        }

        scanner.close();
    }  
}
