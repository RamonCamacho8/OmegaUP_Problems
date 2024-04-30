package Basic.EncuentraElMayor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int quantity = s.nextInt();
        s.nextLine();
        String[] numbers = s.nextLine().split(" ");

        int pivot = 0;
        for (int i = 0; i < quantity; i++) {
            int number = Integer.parseInt(numbers[i]);
            if(number > pivot)
                pivot = number;
        }

        System.out.println(pivot);
        s.close();
    }
}
