package day_04;

import java.util.Scanner;

/*Scrivi un programma Java che inverte una stringa data.
 */

public class InvertiStringa {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
			
		
		System.out.println( " inserisci una stringa " );
		String input = scanner.nextLine();
		
		String invertita = "";
		
		for(int i = input.length() - 1;i >= 0;i--) {
			invertita += input.charAt(i);  // aggiungi il carattere corrente alla stringa invertita
			
		}
		
		System.out.println("Stringa invertita: " + invertita);

        scanner.close();
		
	}

}
