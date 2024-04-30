package Basic.SentadosOParados;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] chain = s.nextLine().split(" ");
        int rows = Integer.parseInt(chain[0]);
        int chairsPerRow = Integer.parseInt(chain[1]);
        int tickets = s.nextInt();
        int chairs = rows * chairsPerRow;
        if( tickets > chairs )
            System.out.println(chairs +" "+ (tickets-chairs) );
        else 
            System.out.println(tickets + " " + 0);
        
        s.close();
    }
}