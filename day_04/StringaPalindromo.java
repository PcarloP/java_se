package day_04;

/*Scrivi un programma Java
*che verifica se una stringa data 
* è un palindromo(cioè se può essere letta allo stesso modo da destra a sinistra e viceversa)   
*/

import java.util.Scanner;

public class StringaPalindromo {

	public static void main(String[] args) {
			
		  Scanner scanner = new Scanner(System.in);

	       	      
	        System.out.print("Inserisci una parola o frase: ");
	        String input = scanner.nextLine();

	        //toLowerCase() Rende la stringa minuscola , replaceAll("[^a-z0-9]","") e rimuove spazi e caratteri non alfabetici
	        String pulita = input.toLowerCase().replaceAll("[^a-z0-9]", "");

	        //Inverte la stringa,StringBuilder per manipolare la stringa , toString conversione da tipo stringBuilder a String
	        String inversa = new StringBuilder(pulita).reverse().toString();

	        // Confronto della versione pulita con la versione invertita
	        if (pulita.equals(inversa)) {
	            System.out.println("È un palindromo!");
	        }else {
	            System.out.println("Non è un palindromo.");
	         }     
	     scanner.close();  
	}  
}
