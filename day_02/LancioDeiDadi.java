package day_02;

import java.util.Random;

/*
 *gioco del lancio del dadoTraccia:
 * Scrivi un programma Java che simuli il lancio di un dado a sei facce.
 *Il programma dovrà generare casualmente un numero compreso tra 1 e 6 estamparlo a schermo.
 */

import java.util.Scanner;

public class LancioDeiDadi {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random random = new Random();

		int play = 1;
		int exitplay = 10;
		int SceltaUtente;

		int[] FaccieDado = new int[6];

		for ( int i = 0; i < FaccieDado.length; i++ ) {
			FaccieDado[i] = i + 1;
		}
		
		System.out.println( "    _ _ _ _ _ _ _ _ _ _");
		System.out.println( "    benvenuto nel gioco " );
		System.out.println( "    _ _ _ _ _ _ _ _ _ _ \n" );
			
		while (true) {

			System.out.println( " per lanciare il dado digita 1" );
			System.out.println( " per uscire dal gioco digita 10" );
			SceltaUtente = input.nextInt();

			if ( SceltaUtente == play ) {
				int indiceCasuale = random.nextInt( FaccieDado.length );
				int risultato = FaccieDado[indiceCasuale];

				System.out.println("Il numero uscito è: " + risultato + "\n");
			}

			if ( SceltaUtente == exitplay ) {
				System.out.println("sei uscito dal gioco , grazie di aver partecipato");
				break;
			}
		}
		input.close();
	}
}
