import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Integer[] lectura = Arrays.stream(s.nextLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
        

        s.close();
    }
}