package Basic.VectorSuperior;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());

        Byte[] vector_1 = Arrays.stream(s.nextLine().split(" ")).map(Byte::parseByte).toArray(Byte[]::new);
        Byte[] vector_2 = Arrays.stream(s.nextLine().split(" ")).map(Byte::parseByte).toArray(Byte[]::new);
        
        boolean superior = true;
        for (int i = 0; i < n; i++) {
            
            if(vector_1[i] <= vector_2[i]){
                superior = false;
            }
        }

        System.out.println(superior ? 1 : 0);

        s.close();
    }
}