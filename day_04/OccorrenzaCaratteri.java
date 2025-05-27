package day_04;

/*Scrivi un programma Java 
*che calcola il numero di occorrenze di una lettera specificata
* all'interno di una stringa data 
*/

import java.util.Scanner;

public class OccorrenzaCaratteri {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        
		        System.out.print("Inserisci una frase: ");
		        String frase = scanner.nextLine();
		        
		        System.out.print("Inserisci una lettera da cercare: ");
		        char lettera = scanner.next().charAt(0); // Prende il primo carattere inserito ,conta quanti ne sono presenti nella stringa in questo caso

		        int occorrenze = 0;
	        
		        for (int i = 0; i < frase.length(); i++) {
		            if (frase.charAt(i) == lettera) {
		                occorrenze++;
		            }
		        }
		        System.out.println("La lettera '" + lettera + "' appare " + occorrenze + " volte.");
		        scanner.close();			
	}
}
