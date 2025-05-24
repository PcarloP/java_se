package day_02;

/*
 * Conversione di temperaturaTraccia: 
 * Scrivi un programma Java che chieda all'utente di inserire unatemperatura in gradi Celsius
 *  e stampi la corrispondente temperatura ingradi Fahrenheit. 
 * Utilizza la formula: Fahrenheit = Celsius * 9/5 + 32.
 */

import java.util.Scanner;

public class ConversioneTemperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

     // Chiedi all'utente di inserire la temperatura in Celsius
        System.out.print( "Inserisci la temperatura in gradi Celsius: " );
        double celsius = input.nextDouble();

        // Calcola la temperatura in Fahrenheit
        double fahrenheit = celsius * 9.0 / 5.0 + 32;

        
        System.out.println( celsius + " gradi Celsius corrispondono a " + fahrenheit + " gradi Fahrenheit." );

        input.close();
    }
}
