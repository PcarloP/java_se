package day_04;

import java.util.Scanner;

/*Scrivi un programma Java
*che ricerca un elemento specifico all'interno di un array di interi
* e restituisce la sua posizione (indice).
*/

public class RestituirePosizione {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int dimensione = 6;
		int[] array = new int[dimensione];

		System.out.println("inserisci i numeri");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}

		System.out.println("inserisci un numero da cercare ");
		int numeroDaCercare = input.nextInt();

		boolean trovato = true;
		for (int i = 0; i < array.length; i++) {

			if (array[i] == numeroDaCercare) {
				System.out.println("il numero è stato trovato all'indice : " + i);
				trovato = true;
			}

		}
		if (!trovato) {
			System.out.println("numero non trovato nell array");
		}
        input.close();
	}
}
