package day_03;

import java.util.Scanner;

/* Verifica se un numero è pari o dispari 
 * Implementa un programma che chieda all'utente di inserire un numero intero e verifichi se è pari o dispari 
 * utilizzando l'operatore modulo 
 */


public class NumeroPariDispari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println( "inserisci un numero" );
		int numeroUtente = input.nextInt();
		
		if(numeroUtente  % 2 == 0) {
			System.out.println( "il numero è pari " );
		}else {
			System.out.println("il numero è dispari");
		}
	
		input.close();
		
		
	}

}
