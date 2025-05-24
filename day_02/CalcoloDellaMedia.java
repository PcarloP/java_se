package day_02;
/*
 * Traccia: Scrivi un programma Java che chieda all'utente di inserire trenumeri e stampi la loro media
 */
import java.util.Scanner;

public class CalcoloDellaMedia {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
	
		 System.out.println( "inserisci il primo numero" );
	     int  numero1 = input.nextInt();
	     
		 System.out.println( "inserisci il secondo numero" );		 
		 int  numero2 = input.nextInt();
		 
		 System.out.println( "inserisci il terzo numero" );
		 int numero3 = input.nextInt();
		 
         int media = numero1 + numero2 + numero3 / 3;

		 System.out.println( media );
		 
		 
		 input.close();
		 
	}
}
