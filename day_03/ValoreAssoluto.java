package day_03;

import java.util.Scanner;

/*
 * Calcolo del valore assoluto di un numero 
 * Implementa un programma che chieda all'utente di inserire un numero 
 * e calcoli il suo valore assoluto utilizzando il metodo abs() della classe Math. 
 */


public class ValoreAssoluto {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		Scanner input = new Scanner(System.in);
		
		System.out.println( " inserisci un numero " );
		double numeroUtente = input.nextDouble();
		 
		double valoreAssoluto = Math.abs(numeroUtente);
		
		System.out.println( "il valore assoluto di "+ numeroUtente+ " è : "+valoreAssoluto);
		
		input.close();
	}
}
