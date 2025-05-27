package day_04;

/*Scrivi un programma Java 
*che calcola la potenza di un numero base elevatoa un esponente dato 
*/

import java.util.Scanner;

public class PotenzaNumero {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Inserisci la base: ");
		double base = scanner.nextDouble();

		System.out.print("Inserisci l'esponente (intero): ");
		int esponente = scanner.nextInt();

		double risultato = 1;

		if (esponente >= 0) {
			// Calcolo potenza del numero base(esponente positivo)
			for (int i = 0; i < esponente; i++) {
				risultato *= base;
			}
		} else {
			// Esponente negativo: calcolo l'inverso della potenza positiva
			for (int i = 0; i < -esponente; i++) {
				risultato *= base;
			}
			risultato = 1 / risultato;
		}
		System.out.println(base + " elevato a " + esponente + " = " + risultato);

		scanner.close();
	}
}
