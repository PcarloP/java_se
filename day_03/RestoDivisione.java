package day_03;

/* Calcolo del resto della divisione tra due numeri
 * Implementa un programma che chieda all'utente di inserire due numeri 
 * e calcoli il resto della divisione tra il primo numero e il secondo numero utilizzando l'operatore modulo.
 */
import java.util.Scanner;

public class RestoDivisione {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
		
			
			System.out.println( "inserisci il primo numero");
			double numero1 = input.nextDouble();
			
			System.out.println( "inserisci il secondo numero");
			double numero2 = input.nextDouble();
			  
			double resto = numero1 % numero2;//operatore modulo restituisce il resto della divisione
			
			System.out.println("il resto della divione e : "+ resto);
			input.close();
		
		
	}

}
