package Basic.CalculosCondicionales;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        
        n = n % 2 == 0 ? n / 2 : n + 1;
        int accum = 1;

        if (String.valueOf(n).length() >= 3) {
            n /= 100;
            accum++;
        }
        else if(String.valueOf(n).length() == 2){
            n /= 10;
            accum++;
        }
        
        if( n % 3 == 0 ){
            n -= 1;
            accum++;
        }

        System.out.println(n + " " + accum);

        s.close();
    }
}