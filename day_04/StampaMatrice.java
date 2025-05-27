package day_04;

//Scrivi un programma java per stampare gli elementi di una matrice.

import java.util.Scanner;

public class StampaMatrice {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		//  Inserimento dimensioni della matrice
		System.out.print("Inserisci il numero di righe: ");
		int righe = input.nextInt();

		System.out.print("Inserisci il numero di colonne: ");
		int colonne = input.nextInt();

		//  Creazione della matrice
		int[][] matrice = new int[righe][colonne];

		//  Inserimento degli elementi
		System.out.println("Inserisci gli elementi della matrice:");
		for (int i = 0; i < righe; i++) {
			for (int j = 0; j < colonne; j++) {
				System.out.print("Elemento [" + i + "][" + j + "]: ");
				matrice[i][j] = input.nextInt();
			}
		}
		//  Stampa della matrice
		System.out.println("\nLa matrice è:");
		for (int i = 0; i < righe; i++) {
			for (int j = 0; j < colonne; j++) {
				System.out.print(matrice[i][j] + "\t"); // \t per l'allineamento
			}
			System.out.println(); // Vai a capo dopo ogni riga
		}

		input.close();
	}

}
