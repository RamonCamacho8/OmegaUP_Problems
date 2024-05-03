package Basic.OpenSource;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Integer n = Integer.parseInt(s.nextLine());
        Integer[] numbers = new Integer[n];
        for (int i = 0; i < n; i++) {

            String singleLine = "";

            while (true) {
                String tempLine = s.nextLine();
                if(tempLine.equals("*"))
                    break;
                singleLine += tempLine;
            }

            String[] line = singleLine.split("");


            int accum = 0;
            int pivot = 0;
            Boolean counting = false;
            
            for (int j = 0; j < line.length; j++) {
                if(line[j].equals("a")){
                    pivot = j;
                    counting = true;
                    continue;
                }
                if(counting){
                    if(line[j].equals("b")){
                        accum += j - pivot - 1;
                        counting = false;
                        continue;
                    }
                    else if(line[j].equals("a")){
                        counting = false;
                        continue;
                    }
                }
            }
            numbers[i] = accum;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        s.close();
    }
}