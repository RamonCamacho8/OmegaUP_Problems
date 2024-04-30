package Basic.PlanetaAjeno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int accum = s.nextInt();
        
        //Me quedo con el residuo
        int seconds = accum % 50;
        //Se convierten a minutos cuando se divide entre 50
        accum = (accum - seconds) / 50;
        //Me quedo con los minutos de residuo
        int minutes = accum % 70;
        //Se convierten a horas cuando se divide entre 70
        accum = (accum - minutes) / 70;
        int hours = accum % 12;
        //Se convierten a dias cuando se divide entre 12
        accum = (accum - hours) / 12;
        int days = accum;
        
        System.out.println(days+" "+hours+" "+minutes+" "+seconds);

        s.close();

    }
}
