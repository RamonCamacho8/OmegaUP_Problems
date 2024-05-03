package Basic.OpenSource;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        
        String fullInput = "";
        int count = 0;
        Integer n = Integer.parseInt(s.nextLine());
        Integer[] numbers = new Integer[n];
        char stop = '*';
        while(count < n){

            String input = s.nextLine();
            int endIndex = 0;

            for (int i = 0; i < input.length(); i++) {
                
                if(input.charAt(i) == stop){
                    count++;
                    if (count >= n){
                        endIndex = i;
                        break;
                    }
                }
                endIndex = i;
            }

            fullInput += input.substring(0, endIndex+1);

        }  
        String[] lines = fullInput.split("\\*");

        for (int i = 0; i < lines.length; i++) {
            String[] line = lines[i].split("");

            int accum = 0;
            
            Boolean counting = false;
            int counter = 0;
            for (int j = 0; j < line.length; j++) {
                
                if(line[j].equals("a")){
                    counting = true;
                    counter = 0;
                    continue;
                }
                if(counting){

                    if(line[j].equals(",")){
                        counter++;
                    } 
                    else if(line[j].equals("b")){
                        accum += counter;
                        counter=0;
                        counting = false;
                        continue;
                    }
                    else if(line[j].equals("a")){
                        counting = false;
                        counter= 0;
                        continue;
                    }
                }
            }
            counter = 0;

            numbers[i] = accum;

        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        
        s.close();
    }
}