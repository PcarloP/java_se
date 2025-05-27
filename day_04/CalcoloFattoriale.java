package day_04;

import java.util.Scanner;

/*Scrivi un programma Java 
*che calcola il fattoriale di un numero dato.es. 9! = 9*8*7*6*5*4*3*2*1
*/

public class CalcoloFattoriale {
	
	
	 public static long calcolaFattoriale(int n) {
	        long risultato = 1;
	        for (int i = 1; i <= n; i++) {
	            risultato *= i;
	        }
	        return risultato;
	 }

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
			
		
		System.out.println( "inserisci un numero intero " );
		int numero = input.nextInt();
		
		if (numero < 0) {
            System.out.println("Il fattoriale non è definito per numeri negativi \n");
        } else {
            long fattoriale = calcolaFattoriale(numero);
            System.out.println(numero + "! = " + fattoriale);
        }
		
		input.close();
	}

}
