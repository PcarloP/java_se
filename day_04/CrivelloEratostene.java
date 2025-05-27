package day_04;

//Scrivi un programma java per verificare se un numero è primo con il metodo del crivello di eratostene 

import java.util.Scanner;

public class CrivelloEratostene {

	public static void crivello(int N) {
		// Array booleano: true = primo, false = non primo
		boolean[] primo = new boolean[N + 1];

		// Inizializza tutti a true (ipotizzando tutti primi)
		for (int i = 2; i <= N; i++) {
			primo[i] = true;
		}

		// Crivello di Eratostene
		for (int i = 2; i * i <= N; i++) {
			if (primo[i]) {
				// Segna multipli di i come non primi
				for (int j = i * i; j <= N; j += i) {
					primo[j] = false;
				}
			}
		}

		// Stampa i numeri primi
		System.out.println("Numeri primi fino a " + N + ":");
		for (int i = 2; i <= N; i++) {
			if (primo[i]) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Inserisci un numero massimo (N): ");
		int N = input.nextInt();

		crivello(N);

		input.close();

	}
}
