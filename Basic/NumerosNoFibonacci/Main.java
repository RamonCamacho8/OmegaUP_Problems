package Basic.NumerosNoFibonacci;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        short n = s.nextShort();
        ArrayList<Short> nofibo = new ArrayList<Short>();

        for (int i = 3; i < n; i++) {
            nofibo.add((short) (i));
        }

        Short[] fibo = new Short[2];
        fibo[0] = 1;
        fibo[1] = 2;
        while(true){
            int nextNumber = (fibo[0] + fibo[1]);
            if(nextNumber <= n)
            {
                fibo[0] = fibo[1];
                fibo[1] = (short) nextNumber;
                int index = nofibo.indexOf(fibo[1]);
                nofibo.remove(index);
            }
            else
                break;
        }

        for (Short short1 : nofibo) {
            System.out.print(short1 + " ");
        }

        s.close();
    }
}